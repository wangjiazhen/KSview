package org.ks.util;

/**
 * 常量类
 */
public class Constant {

    public static final Long SERVICE_ID_GATEWAY = 5L;

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
    public static final String FDD_VERSION = "2.0";

    /***
     * 判断是win 还是 linux系统
     * @return
     */
    public static String osName(){
        String osName=System.getProperty("os.name");
        osName=osName.substring(0,1);
        return osName;
    }


    public static void main(String[] args) {
        String osName=System.getProperty("os.name");
        osName=osName.substring(0,1);
        System.out.println(osName);
    }
}

