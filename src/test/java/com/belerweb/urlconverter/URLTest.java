package com.belerweb.urlconverter;

import org.junit.Assert;
import org.junit.Test;


public class URLTest {

  @Test
  public void testDecode() {
    String url = URL.decode("thunder://QUFodHRwOi8vNzYuNzMuNDQuMTMvMDUwOWoucmFyWlo=");
    System.out.println(url);
    Assert.assertEquals(url, "http://76.73.44.13/0509j.rar");

    url =
        URL.decode(
            "Flashget://W0ZMQVNIR0VUXWh0dHA6Ly9iYnMuaGRiaXJkLmNvbS9abXhoYzJoblpYUjRPaTh2Zkcxb2RITjhla3QxT0hFMlR6WjBUbEJDTkRjcmNYbHlkMmRrUjBad1dUSm9jRXhxUVhWTWFrbDNUVlJKZFdGSFVqQmthVFF6VFdwQ2QweHVaM2xPYWxGMVdWZEdha3hYZURaaFIxRjFZbGhCTUh3eE5UY3dORFEwTkRFMWZEQXpSVUk0TXpneVJEazRRa1UyTURBMlF6VkJRVEU1UkVRek5UVTFRekpGZkM4PS/Mq7yro7q008Hjv6rKvCB0YWljaGkuMC4uMjAxMi5oZHR2LjcyMHAueDI2NC5hYWMtbHpoZC5tcDRbRkxBU0hHRVRd&5743&1370693216flashget://W0ZMQVNIR0VUXWh0dHA6Ly9iYnMuaGRiaXJkLmNvbS9abXhoYzJoblpYUjRPaTh2Zkcxb2RITjhla3QxT0hFMlR6WjBUbEJDTkRjcmNYbHlkMmRrUjBad1dUSm9jRXhxUVhWTWFrbDNUVlJKZFdGSFVqQmthVFF6VFdwQ2QweHVaM2xPYWxGMVdWZEdha3hYZURaaFIxRjFZbGhCTUh3eE5UY3dORFEwTkRFMWZEQXpSVUk0TXpneVJEazRRa1UyTURBMlF6VkJRVEU1UkVRek5UVTFRekpGZkM4PS/Mq7yro7q008Hjv6rKvCB0YWljaGkuMC4uMjAxMi5oZHR2LjcyMHAueDI2NC5hYWMtbHpoZC5tcDRbRkxBU0hHRVRd&5743&1370693216",
            "gbk");
    System.out.println(url);
    Assert
        .assertEquals(
            url,
            "http://bbs.hdbird.com/Zmxhc2hnZXR4Oi8vfG1odHN8ekt1OHE2TzZ0TlBCNDcrcXlyd2dkR0ZwWTJocExqQXVMakl3TVRJdWFHUjBkaTQzTWpCd0xuZ3lOalF1WVdGakxXeDZhR1F1YlhBMHwxNTcwNDQ0NDE1fDAzRUI4MzgyRDk4QkU2MDA2QzVBQTE5REQzNTU1QzJFfC8=/太极：从零开始 taichi.0..2012.hdtv.720p.x264.aac-lzhd.mp4");

    url = URL.decode("qqdl://aHR0cDovL3YuNzk2Ni5jb20vMDcwNS8yNS8xNS53bXY=");
    System.out.println(url);
    Assert.assertEquals(url, "http://v.7966.com/0705/25/15.wmv");
  }

  @Test
  public void testToThunder() {
    String url = URL.toThunder("http://www.baidu.com/img/baidu_jgylogo3.gif");
    System.out.println(url);
    Assert.assertEquals(url,
        "thunder://QUFodHRwOi8vd3d3LmJhaWR1LmNvbS9pbWcvYmFpZHVfamd5bG9nbzMuZ2lmWlo=");

    url = URL.toFlashget("http://www.baidu.com/img/baidu_jgylogo3.gif");
    System.out.println(url);
    Assert
        .assertEquals(
            url,
            "Flashget://W0ZMQVNIR0VUXWh0dHA6Ly93d3cuYmFpZHUuY29tL2ltZy9iYWlkdV9qZ3lsb2dvMy5naWZbRkxBU0hHRVRd&1926");

    url = URL.toXF("http://www.baidu.com/img/baidu_jgylogo3.gif");
    System.out.println(url);
    Assert.assertEquals(url, "qqdl://aHR0cDovL3d3dy5iYWlkdS5jb20vaW1nL2JhaWR1X2pneWxvZ28zLmdpZg==");
  }

}
