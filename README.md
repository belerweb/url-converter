## URL Converter ##
**URL Converter** 是一个迅雷/快车/旋风地址转换工具。如果你使用Maven，你可以添加如下依赖：
```xml
<dependency>
	<groupId>com.belerweb</groupId>
	<artifactId>url-converter</artifactId>
	<version>1.0.0</version>
</dependency>
```

### 示例 ###
```java
String url = URL.decode("thunder://QUFodHRwOi8vd3d3LmJhaWR1LmNvbS9pbWcvYmFpZHVfamd5bG9nbzMuZ2lmWlo=");
System.out.println(url); ／／ http://www.baidu.com/img/baidu_jgylogo3.gif

url = URL.toFlashget("http://www.baidu.com/img/baidu_jgylogo3.gif");
System.out.println(url); ／／ Flashget://W0ZMQVNIR0VUXWh0dHA6Ly93d3cuYmFpZHUuY29tL2ltZy9iYWlkdV9qZ3lsb2dvMy5naWZbRkxBU0hHRVRd&1926
```
