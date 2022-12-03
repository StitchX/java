package cn.ch09;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
/*
    背单词
     Recite.java
     要点：
        文本文件读取
        字符串处理
        集合
        线
        Tim
     */

public class A4_Recite extends JFrame{
    JLabel lblWord = new JLabel("word");
    JLabel lblMeaning = new JLabel("meaning");
    public void init() {
        setSize( 400,100 );
        setLayout(new FlowLayout());
        getContentPane().add(lblWord);
        getContentPane().add(lblMeaning);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    List<String> words = new ArrayList<>();
    List<String> meanings = new ArrayList<>();
    int current = 0;
    public void start() {
        new Thread(()->{
            try{
                readAll();
            }catch(IOException ex){}
            new javax.swing.Timer(1000,(e)->{
                lblWord.setText( words.get(current) );
                lblMeaning.setText( meanings.get(current) );
                current++;
            }).start();
        }).start();
    }

    public void readAll( ) throws IOException{
        String fileName = "College_Grade4.txt";
        String charset = "GB2312";
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(fileName), charset));
        String line;
        while ((line = reader.readLine()) != null) {
            line = line.trim();
            if( line.length() == 0 ) continue;
            int idx = line.indexOf("\t");
            words.add( line.substring(0, idx ));
            meanings.add( line.substring(idx+1));
        }
        reader.close();
    }

    public static void main( String[] args){
        A4_Recite f = new A4_Recite();
        f.init();
        f.start();
    }
}
