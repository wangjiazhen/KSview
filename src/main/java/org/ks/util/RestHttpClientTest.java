package org.ks.util;

import com.alibaba.fastjson.JSON;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;
import org.ks.enums.StatusCodeEnum;
import org.ks.sys.cache.service.RedisService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * REST 接口简单测试类
 */@Service
public class RestHttpClientTest {
    private static final Logger log = LoggerFactory.getLogger(RestHttpClientTest.class);


    private static String massURL = "http://211.147.239.62:9051/api/v1.0.0/message/mass/send";
    private static String username = "KSPD@KSPD";
    private static String password = "Leasing123";
    private static String messagecontent="您的验证码是：xxxxxx，5分钟内有效。请不要把验证码泄露给其他人，如非本人操作请忽略。";


    @Autowired
    private RedisService redisService;
	
	public static void main(String[] args) throws Exception {
        String code = "" + (int)(Math.random()*900000+100000);
        System.out.println(code);
        String s="【欢迎使用库赛科技】您的验证码是：xxxxxx，5分钟内有效。请不要把验证码泄露给其他人，如非本人操作请忽略。".replace("xxxxxx",code);
        System.out.println(s);
		 new RestHttpClientTest().sendMsg("18238057866",s);
    }

	/**
	 * 发送短信
	 */
	public void sendMsg(String phone,String content){
		try{
			HttpURLConnection conn = getConnection(massURL, username, password);
			writeResponse(conn, getMassJsonContent(phone,phone,content));
		}catch(Exception e){
		}
	}

    /****
     * 判断验证码是否正确
     * @param phone
     * @return
     */
    public String  getPhoneKey(String phone,String verifiedCode){
        String phonecode=redisService.getString(phone);
        log.info("======正确的验证码:"+phonecode);
        return phonecode;
    }

    /**
     * 发送短信有返回值
     */
    public ResultInfo sendMsgVerification(String phone){
        ResultInfo re = new ResultInfo(StatusCodeEnum.OK,"验证码发送成功");
        try{
            //根据手机号查询key
            String phonecode=redisService.getString(phone);
            if(phonecode!=null){
                re.setMessage("您的验证码仍在有效期内");
                return re;
            }

            String code = "" + (int)(Math.random()*900000+100000);
            HttpURLConnection conn = getConnection(massURL, username, password);
            String content=messagecontent.replace("xxxxxx",code);
            String temp=writeResponseResultInfo(conn, getMassJsonContent(phone,phone,content));
            log.info(temp);
            com.alibaba.fastjson.JSONObject applyTypeResultJsonObj = JSON.parseObject(temp);
            String tempcode= (String) applyTypeResultJsonObj.get("msg");
            if("成功".equals(tempcode)){
//                String uuid= (String) applyTypeResultJsonObj.get("uuid");
                //设置发送验证码的时间已经验证码的键值
                redisService.save(phone,code,300);
            }

        }catch(Exception e){
            re.setMessage("验证码发送失败");
            log.error(e.toString());
        }
        return re;
    }

    private static void writeResponse(HttpURLConnection conn, String requestContent) throws IOException {
        OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream(),"utf-8");
        out.write(requestContent);
        out.close();

        StringBuilder response = new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream(),"utf-8"));
        String tmp;
        System.out.println("********** Response **********");
        while ((tmp = reader.readLine()) != null) {
            System.out.println(tmp);
            response.append(tmp);
        }
    }

    private static String writeResponseResultInfo(HttpURLConnection conn, String requestContent) throws IOException {
        OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream(),"utf-8");
        out.write(requestContent);
        out.close();

        StringBuilder response = new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream(),"utf-8"));
        String tmp="";
        System.out.println("********** Response **********");
        while ((tmp = reader.readLine()) != null) {
            System.out.println(tmp);
            response.append(tmp);
        }
        return response.toString();
    }

    private static HttpURLConnection getConnection(String serverURL, String username, String password) throws IOException {
        HttpURLConnection conn = (HttpURLConnection) new URL(serverURL).openConnection();
        conn.setDoOutput(true);
        conn.setDoInput(true);
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/json;charset=utf-8");
        conn.setRequestProperty("Accept", "application/json");
        String authorization = generateAuthorization(username, password);
        conn.setRequestProperty("Authorization", authorization);
        conn.connect();
        return conn;
    }

    /**
     * 生成http请求头Authorization串，用于鉴权
     */
    private static String generateAuthorization(String username, String password) {
        String md5Pwd = DigestUtils.md5Hex(password);
        String pair = username + ":" + md5Pwd;
        return Base64.encodeBase64String(pair.getBytes());
    }

    private static String getMassJsonContent(String batchName,String phone,String content) {
        return "{\n" +
                    "    \"batchName\": \""+batchName+"\",\n" +
                    "    \"items\": [\n" +
                    "        {\n" +
                    "            \"to\": \""+phone+"\",\n" +
                    "            \"customMsgID\": \"\"\n" +
                    "        }\n" +
                    "    ],\n" +
                    "    \"content\": \""+content+"\",\n" +
                    "    \"msgType\": \"sms\",\n" +
                    "    \"bizType\": \"100\"\n" +
                    "}";
    }

    private static String getGroupJsonContent() {
        return "{\n" +
                "    \"batchName\": \"玄武无线科技组发测试\",\n" +
                "    \"items\": [\n" +
                "        {\n" +
                "            \"to\": \"15811112222\",\n" +
                "            \"content\": \"玄武科技测试短信01\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"to\": \"13511112222\",\n" +
                "            \"content\": \"玄武科技测试短信02\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"msgType\": \"sms\",\n" +
                "    \"bizType\": \"100\"\n" +
                "}";
    }

}
