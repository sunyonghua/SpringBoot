package com.yonghua.controller;

import java.util.List;
import java.util.Map;

import com.yonghua.service.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sun yong hua
 * @description UserController
 * @createDate 2019-05-09 19:21
 */
@RestController
public class UserController {
  private final JdbcTemplate jdbcTemplate;

  @Autowired
  public UserController(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  @RequestMapping("/user")
  public User user(@RequestParam(value = "username", defaultValue = "") String username) {
    String sql = "select * from n_web_user ";
    if (!username.equals("") && username != null) {
      sql += "where  username like '%" + username + "%'";
    }
    System.out.println(sql);
    List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
    return new User(list);
  }
}
