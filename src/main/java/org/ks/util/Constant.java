package org.ks.util;

/**
 * 常量类
 */
public class Constant {
    /**
     * 生产环境namespace
     */
    public static final String NAMESPASE_PROD = "eagle";
    /**
     * 测试环境万能验证码
     */
    public static final String TEST_VERIFY_CODE = "666666";
    public static final String BAIDU_TOKEN = "139b6d9b31989ff3855fe066c26141b1";

    /**
     * 商户号：200604000007607
     * 用户名：20060400000760704
     * 密码：111111
     *
     * 商户私钥为：200604000007607.cer
     * 公钥:allinpay-pds.cer
     * 接口文档地址：https://tlt.allinpay.com/apidoc/#3610
     * 具体接口名称：3.6.10账户类别验证五要素(211011)
     */

    /**
     * OCR 的账户id，用的优质融的
     * ocr 的appid
     */
    public static final String BAIDU_APPID_XFTM = "14830769";
    /**
     * ocr 的api 的key
     */
    public static final String BAIDU_AI_KEY_XFTM = "QvB7GPCycNrQX69jB0yCqM5A";
    /**
     * ocr 的 secret
     */
    public static final String BAIDU_SECRET_KEY_XFTM = "PRGZYd4Nh62ZqN6lWQglMh2HH4L13X0A";
    /**
     * 通联接口地址
     * test：https://test.allinpaygd.com/aipg/ProcessServlet
     * prod：https://tlt.allinpay.com/aipg/ProcessServlet
     */
    public static final String TL_URL = "https://test.allinpaygd.com/aipg/ProcessServlet";
    /**
     * 通联商户号
     * test: 200604000007607
     */
    public static final String TL_BUSINESS_NO = "200604000007607";
    /**
     * 通联用户名
     * test: 20060400000760704
     */
    public static final String TL_USER_NAME = "20060400000760704";
    /**
     * 通联密码
     * test: 111111
     */
    public static final String TL_PWD = "111111";

    /**
     * 客户信息校验 以及 放款状态同步
     * test:https://khbktest.xftm.com:8082/
     */
    public static final String SECOND_SALE_URL = "https://khbktest.xftm.com:8082/";


    /**
     * ## 厂商字段
     * gpsCsLn=鲁诺
     * gpsCsCx=车晓
     * gpsCsZc=智车
     * gpsCsGl=广联
     * gpsCsXf=先锋无线
     * gpsCsBd=北斗
     * ## 重庆城市代码
     * gpsDqdmCq=500000
     * ## 北京城市代码
     * gpsDqdmBj=110000
     * ## 天津城市代码
     * gpsDqdmTj=120000
     * ## 上海城市代码
     * gpsDqdmSh=310000
     */

////
//    public static final String GPS_BD_TOKEN = "12l3PePoBcCkjloKz1KC1d5e01Mu4";
//    public static final String GPS_BD_URL = "http://www.yuanchuanglianhe.com/riskctrl/order/xfOrder/";
//    public static final String GPS_BD_PIC_URL = "http://www.yuanchuanglianhe.com/upload/";
    public static final String GPS_BD_URL = "http://d3105.vicp.io:4198/riskctrl/order/xfOrder/";
    public static final String GPS_BD_TOKEN = "10zoCxfjLJXrT9bdWE66401UnOp3";
    /**
     * #cs
     * #appid=1003
     * #tokenkey=abcdefg123456
     * #url=http://gpsready.zhichecn.com/extapi/pioneer
     * <p>
     * #zs
     * appid=1002
     * tokenkey=5FF2BE6ACF0F51C3489EF9F979D42769
     * url=https://gps.zhichecn.com/extapi/pioneer
     * #url=http://gps.zhichecn.com:8080/extapi/pioneer
     */
    public static final String GPS_ZC_APPID = "1003";
    public static final String GPS_ZC_TOKEN_KEY = "abcdefg123456";
    public static final String GPS_ZC_URL = "http://gpsready.zhichecn.com/extapi/pioneer";
//    public static final String GPS_ZC_APPID = "1002";
//    public static final String GPS_ZC_TOKEN_KEY = "5FF2BE6ACF0F51C3489EF9F979D42769";
//    public static final String GPS_ZC_URL = "https://gps.zhichecn.com/extapi/pioneer";
    /**
     * #cs
     * #gps_key=2dfa5b24ac674c05880bf36833efd985
     * #url=gps.test.didihu.com.cn
     * #zs
     * gps_key=2dfa5b24ac674c05880bf36833efd985
     * url=gps.didihu.com.cn
     */
    public static final String GPS_GL_KEY = "2dfa5b24ac674c05880bf36833efd985";
    public static final String GPS_GL_DOMAIN = "http://gps.test.didihu.com.cn";
//    public static final String GPS_GL_KEY = "2dfa5b24ac674c05880bf36833efd985";
//    public static final String GPS_GL_DOMAIN = "http://gps.didihu.com.cn";

    // 最新位置查询接口
    public static final String GPS_GL_NOW_GPS_KEY = "6dfa5b24af674c05880bc36869efd258";
    public static final String GPS_GL_NOW_GPS_DOMAIN = "http://e-shield.didihu.com.cn";

    public static final String GPS_LN_ACCT = "F0001";
    public static final String GPS_LN_PWD = "xftm0001";
    public static final String GPS_LN_URL = "http://58.58.34.98:2003/lunuopumpwebservice.asmx";

        public static final String GPS_CX_URL = "http://testxf3.chexiao.co:9080/xf/webservice?wsdl";
    public static final String GPS_CX_ACCT = "xftm";
    public static final String GPS_CX_PWD = "111111";

//    public static final String GPS_CX_URL = "http://xf.chexiao.co:9080/xf/webservice?wsdl";
//    public static final String GPS_CX_ACCT = "xftm";
//    public static final String GPS_CX_PWD = "xftm2017";


    public static final String GPS_CX_NOW_GPS_URL = "http://mk.chexiao.co";
    public static final String GPS_CX_TOKEN = "dbb3d7bff3ee443c9127ac31516e3de8";

    public static final String TMZL_SIGN_URL = "http://10.10.1.153:8081/iSignature";

    /**
     * 贷前应用服务器相关账号信息
     */
    public static final String BEFORE_LOAN_HOST_IP = "10.10.1.153";
    public static final String BEFORE_LOAN_USERNAME = "xftmleasing";
    public static final String BEFORE_LOAN_PASSWORD = "hpL200080";

    /**
     * 上海脉信语音识别应用服务器 共享文件夹
     */
    public static final String MAIXIN_HOST_IP = "10.10.11.41";//"10.10.1.179";//
    public static final String MAIXIN_USERNAME = "administrator";//"xftmleasing";
    public static final String MAIXIN_PASSWORD = "!qaz2wsx";//"XftM0926";
    public static final String MAIXIN_AUDIO_UPLOAD_PATH = "//d//icc//data//zhenai";

    public static final Long SERVICE_ID_VIEW = 1L;
    public static final Long SERVICE_ID_ACTIVITI = 2L;
    public static final Long SERVICE_ID_DADADIC = 3L;
    public static final Long SERVICE_ID_FILE = 4L;
    public static final Long SERVICE_ID_GATEWAY = 5L;
    public static final Long SERVICE_ID_PRELEASING = 6L;
    public static final Long SERVICE_ID_SMS = 7L;

    public static final String UTF_8_LOW = "utf-8";

    /**
     * 是 - 1
     */
    public static final Integer INT_YES = 1;

    /**
     * 否 - 0
     */
    public static final Integer INT_NO = 0;

    /**
     * 前端分页参数isPage
     * 1 - 分页
     * 0 - 不分页
     */
    public static final String PARAM_IS_PAGE = "isPage";
    /**
     * 前端分页参数pageNum
     * 页码 默认 1
     */
    public static final String PARAM_PAGE_NUM = "pageNum";
    public static final String DEFAULT_PAGE_NUM = "1";
    /**
     * 前端分页参数pageSize
     * 每页大小 默认 10
     */
    public static final String PARAM_PAGE_SIZE = "pageSize";
    public static final String DEFAULT_PAGE_SIZE = "10";
    public static final String GATEWAY_URL = "https://zfbktest.xftm.com.8040";


    /**
     * 还款方式-分期等额本息
     */
    public static final String REPAY_MODE_NORMAL = "11";

    /**
     * 还款频率-月
     */
    public static final String REPAY_FREQUENCY_MONTH = "3";

    /**
     * 先锋太盟微信APPID
     */
    public static final String XFTM_WX_APP_ID = "wx464fe73282ff9b87";//"wx743de4a4fa762293";
    /**
     * 先锋太盟微信APPSECRET
     */
    public static final String XFTM_WX_APP_SECRET = "4ad0a4dcd0043fc7a191721c9b3a5a3f";//"54164220134bbd5b9d872ccd544eea1a";
    /**
     * baiduMap ak 服务端
     */
    public static final String BAIDUMAP_AK_LY = "6cooWi6yPiv1v0XQdBkhnMPlOO1Da52M";

    /**
     * baiduMap 地址解析url
     */
    public static final String BAIDU_MAP_GEOCODER_URL = "http://api.map.baidu.com/geocoder/v2/";

    /**
     * baiduMap 地址坐标转换url
     */
    public static final String BAIDU_MAP_GEOCONV_URL = "http://api.map.baidu.com/geoconv/v1/";


    /**
     * 百度ai应用相关账号(文字识别)
     */
    public static final String BAIDU_AI_APPID = "11247722";// "";
    public static final String BAIDU_AI_APIKEY = "M0FTDmEKf7I2wUf76L4P6AtR";// "";
    public static final String BAIDU_AI_SECRETKEY = "wrFNMWd3CW5BCGO6ugo32CQ9OtMw6fMg";// "";

    /**
     * 百度ai应用相关账号(语音识别)
     */
//    public static final String BAIDU_SPEECH_APPID = "17056842";// "";
//    public static final String BAIDU_SPEECH_APIKEY = "1xe6GCnIhBdOOTWtfsWIOnDc";// "";
//    public static final String BAIDU_SPEECH_SECRETKEY = "yEtwPtEmm0HEmpu3pj2k8bsX8MvCllVD";// "";
    public static final String BAIDU_SPEECH_APPID = "17062939";// "";
    public static final String BAIDU_SPEECH_APIKEY = "2IVwQevS5j2qFTuyrnGSilOy";// "";
    public static final String BAIDU_SPEECH_SECRETKEY = "CzWydX7jKNQ1gPUteOfT7vdkKstF6YEK";// "";


    /**
     * 实槌开发环境  保全接口host:
     */
    public static final String FDD_BQ_HOST = "http://bq8088.fabigbig.com";
    /**
     * 用户名（username）
     */
    public static final String FDD_BQ_USERNAME = "13aa82f8f582489aad413000029639f3";
    /**
     * 密码（password）
     */
    public static final String FDD_BQ_PASSWORD = "c26d12f073934a1397a37d8ad1ac7188";
    /**
     * 客户端Id（ClinetId）
     */
    public static final String FDD_BQ_CLIENT_ID = "5cf75dbf52494b5eba760ae6bf9de049";
    /**
     *  客户端秘钥 ClinetSecret
     */
    public static final String FDD_BQ_CLIENT_SECRET = "46d7766e1ba34dc7a3d15ee5e1d3ced6";


    public static final String FDD_APP_ID = "403023";
    public static final String FDD_APP_SECRET = "1PYO7zNKqnsWq8UQRBs8d0aZ";
    public static final String FDD_VERSION = "2.0";
    public static final String FDD_HOST = "http://test.api.fabigbig.com:8888/api/";

    public static final String FDD_XF_CUSTOMER_ID = "DDBBF659FC4C6E63FF78ED60323BA16E";

    public static final String TLYZM = "http://happyleasing.cn/TMZL/app/lywxapi.htm!";
}
