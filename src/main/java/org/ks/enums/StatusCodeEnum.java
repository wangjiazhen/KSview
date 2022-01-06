package org.ks.enums;

/**
 * @author : Aaron
 *
 * create at:  2020-04-14  08:58
 *
 * description: 通用返回枚举
 */
public enum StatusCodeEnum {

  /**
   * 成功返回状态
   */

  OK(200, "请求成功"),


  /**
   * 请求格式错误
   */

  BAD_REQUEST(400, "请求格式错误"),

  /**
   * 未授权
   */

  UNAUTHORIZED(401, "您未经过授权"),

  /**
   * 没有权限
   */

  FORBIDDEN(403, "您没有权限操作"),


  /**
   * 请求的资源不存在
   */

  NOT_FOUND(404, "您请求的资源找不到"),

  /**
   * 该http方法不被允许
   */

  NOT_ALLOWED(405, "您的请求不被允许"),

  /**
   * 请求处理发送异常
   */

  PROCESSING_EXCEPTION(406, "请求发生异常"),

  /**
   * 请求处理未完成
   */

  PROCESSING_UNFINISHED(407, "请求中断"),


  /**
   * 登录过期
   */

  BEOVERDUE(408, "登陆过期"),

  /**
   * token过期
   */
  TOKEN_BEOVERDUE(50014,"token过期"),




  /**
   * 用户未登录
   */

  NOT_LOGIN(409, "未登录"),


  /**
   * 这个url对应的资源现在不可用
   */

  GONE(410, "当前资源不可用"),

  /**
   * 请求类型错误
   */

  UNSUPPORTED_MEDIA_TYPE(415, "请求类型错误"),

  /**
   * 校验错误时用
   */

  UNPROCESSABLE_ENTITY(422, "校验出错"),

  /**
   * 请求过多
   */

  TOO_MANY_REQUEST(429, "请求过多");

  private int code;

  private String value;


  StatusCodeEnum(int code, String value) {
    this.code = code;
    this.value = value;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
