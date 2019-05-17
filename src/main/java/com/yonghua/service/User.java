package com.yonghua.service;

import java.util.List;
import java.util.Map;

/**
 * @author sun yong hua
 * @description User
 * @createDate 2019-05-09 19:21
 */
public class User {
  private final List<Map<String,Object>> userList;

  public User(List<Map<String,Object>> userList) {
    this.userList = userList;
  }

  public List<Map<String,Object>> getUserList() {
    return userList;
  }
}
