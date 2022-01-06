package org.ks.system;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

/**
 * @author : Aaron
 * <p>
 * create at:  2020-05-28  19:57
 * <p>
 * description: UserInfo
 */
@Component
public class UserInfo {

    private static final Logger log = LoggerFactory.getLogger(UserInfo.class);

    public UserInfo() {
        System.out.println("userinfo is init");
    }

    @Resource(name = "redisTemplate")
    private RedisTemplate redisTemplate;

    @Autowired
    private HttpServletRequest httpServletRequest;


    /**
     * 获取当前登陆用户id
     * 默认返回空  空即表示无法从header中获取用户token
     *
     * @return
     */
    public String getUserId() {

        try {
            if (!StringUtils.isEmpty(httpServletRequest.getHeader("xftmtoken"))) {

                String key = httpServletRequest.getHeader("xftmtoken");
                Object o = redisTemplate.opsForValue().get(key);
                if (o == null) {
                    return "";
                } else {
                    HashMap<String, String> map = JSON.parseObject(o.toString(), HashMap.class);
                    return String.valueOf(map.get("userId")) == null ? "" : String.valueOf(map.get("userId"));
                }
            }
        } catch (Exception e) {
            log.error("获取userId异常", e);
        }

        return "";

    }


}

