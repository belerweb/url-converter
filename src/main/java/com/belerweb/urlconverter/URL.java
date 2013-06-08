package com.belerweb.urlconverter;

import java.io.UnsupportedEncodingException;

import org.apache.commons.codec.binary.Base64;

/**
 * URL 转换工具
 */
public class URL {

  /**
   * URL(普通/迅雷/旋风/快车)转换成迅雷URL
   */
  public static String toThunder(String url) {
    return "thunder://" + encode64("AA" + decode(url) + "ZZ");
  }

  /**
   * URL(普通/迅雷/旋风/快车)转换成快车URL
   */
  public static String toFlashget(String url) {
    return "Flashget://" + encode64("[FLASHGET]" + decode(url) + "[FLASHGET]") + "&1926";
  }

  /**
   * 迅雷/旋风/快车URL转换成原始URL
   */
  public static String toXF(String url) {
    return "qqdl://" + encode64(decode(url));
  }

  /**
   * URL(普通/迅雷/旋风/快车)转换成旋风URL
   */
  public static String decode(String url) {
    return decode(url, "UTF-8");
  }


  /**
   * URL(普通/迅雷/旋风/快车)转换成旋风URL
   */
  public static String decode(String url, String charset) {
    try {
      if (url.startsWith("thunder://")) {
        return thunderDecode(url, charset);
      }
      if (url.startsWith("Flashget://")) {
        return flashgetDecode(url, charset);
      }
      if (url.startsWith("qqdl://")) {
        return qqDecode(url, charset);
      }
    } catch (UnsupportedEncodingException e) {
      throw new RuntimeException(e);
    }

    return url;
  }

  private static String thunderDecode(String thunderUrl, String charset)
      throws UnsupportedEncodingException {
    String url = decode64(thunderUrl.substring(10), charset);
    return url.substring(2, url.length() - 2);
  }

  private static String flashgetDecode(String flashgetUrl, String charset)
      throws UnsupportedEncodingException {
    String url =
        flashgetUrl.substring(11, flashgetUrl.contains("&")
            ? flashgetUrl.indexOf("&")
            : flashgetUrl.length());
    url = decode64(url, charset);
    return url.substring(10, url.length() - 10);
  }

  private static String qqDecode(String url, String charset) throws UnsupportedEncodingException {
    return decode64(url.substring(7), charset);
  }

  private static String encode64(String data) {
    return Base64.encodeBase64String(data.getBytes());
  }

  private static String decode64(String data, String charset) throws UnsupportedEncodingException {
    return new String(Base64.decodeBase64(data), charset);
  }

}
