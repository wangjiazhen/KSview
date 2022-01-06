package org.ks.aop;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import javax.servlet.http.HttpServletRequest;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.ks.util.Constant;
import org.ks.util.LocalDateTimeUtil;
import org.ks.util.ResultInfo;
import org.ks.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.List;

@Aspect
@Component
public class PageHelperAspect {
    private static final Logger log = LoggerFactory.getLogger(Thread.currentThread().getStackTrace()[1].getClassName());

    @Autowired
    HttpServletRequest request;

    @Pointcut("execution(public * org.ks.*.*.service..*(..))")
    public void selectFunction(){}

    @Around("selectFunction()")
    public Object serviceImplAop(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        String isPage = request.getHeader(Constant.PARAM_IS_PAGE);
        if (!StringUtil.isNull(isPage)) {
            if(Integer.parseInt(isPage) == Constant.INT_YES.intValue()){
                String pageNum = request.getHeader(Constant.PARAM_PAGE_NUM);
                if (StringUtil.isNull(pageNum)) {
                    pageNum = Constant.DEFAULT_PAGE_NUM;
                }
                String pageSize = request.getHeader(Constant.PARAM_PAGE_SIZE);
                if (StringUtil.isNull(pageSize)) {
                    pageSize = Constant.DEFAULT_PAGE_SIZE;
                }
                PageHelper.startPage(Integer.parseInt(pageNum), Integer.parseInt(pageSize));
            }
        }
        Object object = proceedingJoinPoint.proceed();
        return object;
    }



    @Pointcut("execution(public * org.ks.*.*.ctrl..*(..))")
    public void ctrlLog(){}


    @Around("ctrlLog()")
    public Object ctrlLogAop(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        // 拦截的实体类
        Object target = proceedingJoinPoint.getTarget();
        // 拦截的方法名称。当前正在执行的方法
        String methodName = proceedingJoinPoint.getSignature().getName();
        // 拦截的方法参数
        Object[] args = proceedingJoinPoint.getArgs();
        // 拦截的放参数类型
        Signature sig = proceedingJoinPoint.getSignature();
        // 获得被拦截的方法
        Method method = null;
        MethodSignature msig = (MethodSignature) sig;
        Class[] parameterTypes = msig.getMethod().getParameterTypes();
        method = target.getClass().getMethod(methodName, parameterTypes);

        log.info("URL : " + request.getRequestURL().toString());
        log.info("HTTP_METHOD : " + request.getMethod());
        log.info("IP : " + request.getRemoteAddr());
        Enumeration<String> enu = request.getParameterNames();
        while (enu.hasMoreElements()) {
            String name = enu.nextElement();
            log.info("NAME:{},VLAUE:{}", name, request.getParameterValues(name));
        }

        String isPage = request.getHeader(Constant.PARAM_IS_PAGE);
        Long start = System.currentTimeMillis();
//        log.info("方法[{}]开始执行...", signature.getName());
        Object object = proceedingJoinPoint.proceed();
        log.info("RESPONSE : " + JSON.toJSONString(object));
//        log.info("方法[{}]执行结束.", signature.getName());
        if (!StringUtil.isNull(isPage) && Integer.parseInt(isPage) == Constant.INT_YES.intValue()) {
            if (object instanceof ResultInfo) {
                if (((ResultInfo) object).getData() instanceof List) {
                    List objList = (List) ((ResultInfo) object).getData();
                    PageInfo pageInfo = new PageInfo<>(objList);
                    ((ResultInfo) object).setTotal(pageInfo.getTotal());
                }
            }
        }
        Long end = System.currentTimeMillis();
        Long time = end - start;
        log.info(target.getClass().getName() + "." + method.getName() + "- take " + LocalDateTimeUtil.formatTime(time));

        return object;
    }

}
