package all.a8StringBuffer;

//当对字符串进行修改的时候，需要使用 StringBuffer 和 StringBuilder 类。
//和 String 类不同的是，StringBuffer 和 StringBuilder 类的对象能够被多次的修改，并且不产生新的未使用对象

import org.junit.Test;

    /*
    StringBuilder 类在 Java 5 中被提出，它和 StringBuffer 之间的最大不同在于 StringBuilder 的方法不是线程安全的（不能同步访问）。
    由于 StringBuilder 相较于 StringBuffer 有速度优势，所以多数情况下建议使用 StringBuilder 类。
     */

public class AStringBuffer {
    StringBuilder sb1 = new StringBuilder(10);
    StringBuilder sb2 = new StringBuilder("hello world");

    StringBuilder sb3 = new StringBuilder();

    // 增
    @Test
    public void demo01(){
        sb3.append('A');
        sb3.append("a2");
        sb3.insert(1,"a3");
        System.out.println(sb3); // Aa3a2
        System.out.println(sb3.length()); // 5
    }

    // 删
    @Test
    public void demo02(){
        sb2.delete(0,4);
        System.out.println(sb2); // o world
    }

    // 改
    @Test
    public void demo03(){
        sb2.replace(1,2,"123");
        System.out.println(sb2); // h123llo world
        sb2.reverse();
        System.out.println(sb2); // dlrow oll321h
    }

//    有初始化长度,但实际长度还是 0
    @Test
    public void demo04(){
        StringBuffer sbu1 = new StringBuffer("qwertyu");
        StringBuffer sbu2=new StringBuffer(10);
        System.out.println(sbu1.length());  // 7
        System.out.println(sbu2.length()); // 0

        sbu2.append('z');
        System.out.println(sbu2.length()); // 1
//        sbu2.insert(3,'d'); // 报错:Range [3, 1) out of bounds for length 1
    }

    // 查
    @Test
    public void demo05(){
//        "hello world"
        System.out.println(sb2.charAt(1));  //e 返回指定索引处字符
        System.out.println(sb2.capacity()); //27 返回当前容量
        System.out.println(sb2.indexOf("1")); //2 返回第一次出现的指定子字符串在该字符串中的索引。
        System.out.println(sb2.indexOf("w",1)); //从指定的索引处开始，返回第一次出现的指定子字符串在该字符串中的索引。
    }

}
