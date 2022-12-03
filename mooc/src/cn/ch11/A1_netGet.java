package cn.ch11;

/*
使用 java.net.URL 进行网络信息获取
    URL：地址（uniform resource locator )
    读取网页文件内容的步骤如下
        (1) 创建一个URL类型的对象。       //
        URL url = new URL( “http://www.dstang.com”);
        (2) 利用URL类的openStream()，获得对应的InputStream类的对象。
        InputStream stream = url.openStream();
        (3) 通过 InputStream 或 InputStreamReader 来读取内容。
 */
public class A1_netGet {
    /*
    更复杂的网络信息获取
    可以使用第三方库, 参见lib子目录
    如Apache的httpclient
    http://hc.apache.org/
    在Eclipse中引入库
    类似地NetBeans中，项目—库—点右键—添加jar文件
    示例 HttpClientStock.java
    str = Request.Get("http://www.dstang.com")
    .execute().returnContent().asString();        // 流式操作
    稍早的一篇文章 http://blog.chinaunix.net/uid-7591044-id-1742965.html

     */

    public static void main(String[] args) {
        String stockCode = "sz000837";


    }
}
