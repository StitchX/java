package cainiao;

//当对字符串进行修改的时候，需要使用 StringBuffer 和 StringBuilder 类。
//和 String 类不同的是，StringBuffer 和 StringBuilder 类的对象能够被多次的修改，并且不产生新的未使用对象
public class B4StringBuffer {
    /*
    StringBuilder 类在 Java 5 中被提出，它和 StringBuffer 之间的最大不同在于 StringBuilder 的方法不是线程安全的（不能同步访问）。
    由于 StringBuilder 相较于 StringBuffer 有速度优势，所以多数情况下建议使用 StringBuilder 类。
     */

    public static void main(String[] args) {
//
        StringBuilder sb1 = new StringBuilder(10);
        StringBuilder sb2 = new StringBuilder("nimenhaoya");

        StringBuilder sb = new StringBuilder();
//        增
        sb.append('1');
        sb.append("aa");
        sb.insert(2,"kk");  //1akka
        System.out.println(sb);

//        删
        sb.delete(1,3);
        System.out.println(sb);  //1ka

//        改
        sb.replace(1,2,"123"); //1123a
//        System.out.println(sb);
        sb.reverse();  // a3211
//        System.out.println(sb);

        StringBuffer sbu1 = new StringBuffer("qwertyu");
//        StringBuffer sbu1=new StringBuffer(10); // sbu1.length()=0
//        查
        System.out.println(sbu1.charAt(1));  //w 返回指定索引处字符
        System.out.println(sbu1.capacity()); //23 返回当前容量
        System.out.println(sbu1.indexOf("e")); //2 返回第一次出现的指定子字符串在该字符串中的索引。
        System.out.println(sbu1.indexOf("w",1)); //从指定的索引处开始，返回第一次出现的指定子字符串在该字符串中的索引。

    }
}
