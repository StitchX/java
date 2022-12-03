package cn.ch09;


import javax.swing.*;
import java.awt.*;   // “java.awt是一个软件包，包含用于创建用户界面和绘制图形图像的所有分类。
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/*
网络流
要点：
    URL
    网络流
    线程、invokeLater
 */
public class A3_netStream extends JFrame {
    TextArea textArea = new TextArea("downloading:\n");
    public void init(){
        setSize(400,300);
        getContentPane().add(textArea);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void download() {
        String strUrl = "http://www.baidu.com";
        new Thread( ()->{
            String content = getContentFromUrl( strUrl );
            SwingUtilities.invokeLater(()->{
                textArea.append( content );
            });
        }).start();
    }
    public static String getContentFromUrl( String strUrl )
    {
        try {
            URL url = new URL(strUrl);
            InputStream stream = url.openStream();

            String content = readAll( stream,"UTF-8" ); //常见的编码包括 GB2312, UTF-8
            return content;

        }catch ( MalformedURLException e) {
            System.out.println("URL格式有错" );
        }catch (IOException ioe) {
            System.out.println("IO异常" );
        }
        return "";
    }

    public static String readAll( InputStream stream, String charcode ) throws IOException{
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(stream, charcode));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            sb.append(line+"\n");
        }
        return sb.toString();
    }

    public static void main( String[] args){
        A3_netStream f = new A3_netStream();
        f.init();
        f.download();
    }


}
