package com.yonghua.controller;

import java.util.Set;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicLong;

import com.yonghua.service.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
  private final JdbcTemplate jdbcTemplate;

  @Autowired
  public HelloController(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  @RequestMapping("/hello")
  public Hello Hello(@RequestParam(value = "name", defaultValue = "World") String name) {
    String sql = "select * from n_web_user";
    List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
    System.out.println(list);
    return new Hello(list);
  }
}