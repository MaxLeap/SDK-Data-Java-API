package com.maxleap.las.sdk.types;

import java.util.HashMap;
import java.util.Map;

/**
 * User: qinpeng
 * Date: 14-5-19
 * Time: 13:41
 */
public class MLBytes {

  private static final String __type = MLKeyType.BYTES.v();
  private String base64;

  public MLBytes() {
  }

  public MLBytes(String base64) {
    this.base64 = base64;
  }

  public static String get__type() {
    return __type;
  }

  public String getBase64() {
    return base64;
  }

  public void setBase64(String base64) {
    this.base64 = base64;
  }

  public Map toMap() {
    Map map = new HashMap();
    map.put("__type", "Bytes");
    map.put("base64", base64);
    return map;
  }
}
