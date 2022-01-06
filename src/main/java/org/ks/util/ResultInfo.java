package org.ks.util;


import org.ks.enums.StatusCodeEnum;

/**
 * @author : Aaron
 *
 * create at:  2020-04-14  09:02
 *
 * description: ResultInfo
 */
public class ResultInfo<T> {

  private int code;

  private String message;

  private T data;
  private Long total;

  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }



  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }






  public ResultInfo(StatusCodeEnum statusCodeEnum) {
    this.code = statusCodeEnum.getCode();
    this.setMessage(statusCodeEnum.getValue());
  }
  public ResultInfo(StatusCodeEnum statusCodeEnum, String msg) {
    this.code = statusCodeEnum.getCode();
    this.setMessage(msg);
  }

  public ResultInfo(int code, String message, T data, Long total) {
    this.code = code;
    this.message = message;
    this.data = data;
    this.total = total;
  }

  public ResultInfo() {
  }
  public static <R> ResultInfo<R> buildSuccess(R r){
    ResultInfo<R> resultInfo = new ResultInfo<>(StatusCodeEnum.OK);
    resultInfo.setData(r);
    return resultInfo;
  }
  public static  ResultInfo<String> buildFailed(String r){
    ResultInfo<String> resultInfo = new ResultInfo<>(StatusCodeEnum.BAD_REQUEST);
    resultInfo.setMessage(r);
    return resultInfo;
  }

  public static  ResultInfo<String> buildFailed(StatusCodeEnum code){
    ResultInfo<String> resultInfo = new ResultInfo<>(code);
    return resultInfo;
  }

  public static ResultInfo<String> buildFailed(StatusCodeEnum code, String msg){
    ResultInfo<String> resultInfo = new ResultInfo<>(code);
    resultInfo.setMessage(msg);
    return resultInfo;
  }

  @Override
  public String toString() {
    return "ResultInfo{" +
            "code=" + code +
            ", message='" + message + '\'' +
                ", data=" + data.toString() +
            ", total=" + total +
            '}';
  }
}
