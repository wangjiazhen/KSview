package org.ks.sys.vo;

import java.util.List;

/**
 * @author : Aaron
 *
 * create at:  2020-04-14  09:32
 *
 * description: 用户返回视图
 */
public class UserVo {

  /**
   * 用户ID
   */
  private long userId;
  /**
   * 用户名
   */
  private String userName;

  /**
   * 用户真实姓名
   */
  private String realUserName;

  /**
   * 电话号码
   */
  private String telPhone;

  /**
   * 手机号
   */
  private String mobilePhone;

  /**
   * 账号
   */
  private String acct;

  /**
   * token
   */
  private String token;

  /**
   * 菜单
   */
  private List<MenuVo> menus;
  public List<MenuVo> getMenus() {
    return menus;
  }

  public void setMenus(List<MenuVo> menus) {
    this.menus = menus;
  }
  public String getAcct() {
    return acct;
  }

  public void setAcct(String acct) {
    this.acct = acct;
  }

  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getRealUserName() {
    return realUserName;
  }

  public void setRealUserName(String realUserName) {
    this.realUserName = realUserName;
  }

  public String getTelPhone() {
    return telPhone;
  }

  public void setTelPhone(String telPhone) {
    this.telPhone = telPhone;
  }

  public String getMobilePhone() {
    return mobilePhone;
  }

  public void setMobilePhone(String mobilePhone) {
    this.mobilePhone = mobilePhone;
  }

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  @Override
  public String toString() {
    return "UserVo{" +
        "userId=" + userId +
        ", userName='" + userName + '\'' +
        ", realUserName='" + realUserName + '\'' +
        ", telPhone='" + telPhone + '\'' +
        ", mobilePhone='" + mobilePhone + '\'' +
        ", token='" + token + '\'' +
        '}';
  }
}

