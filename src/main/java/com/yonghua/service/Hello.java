package com.yonghua.service;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @author sun yong hua
 * @description Hello
 * @createDate 2019-04-23 17:26
 */
public class Hello {
  private final List<Map<String, Object>> content;

  public Hello(List<Map<String, Object>> content) {
    this.content = content;
  }

  public List<Map<String, Object>> getContent() {
    return content;
  }
}
