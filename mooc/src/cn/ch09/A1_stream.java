package cn.ch09;

/*
把不同类型的输入、输出都抽象为流（Stream)
    按流的方向，可分为输入流与输出流   // 屏幕、文件
java.io包
    从JDK1.4起，加了 java.nio 包， JDK1.7 作了改进，称nio2  // new IO

 */


/*
根据里面的内容分为：字节流与字符流
         字节流    字符流
输 入 InputStream Reader
输 出 OutputStream Writer


字符：Unicode 表示两个字节（Java里面）
字节：考虑编码方式（UTF-8，国标码）
 */
public class A1_stream {
    /*
    InputStream类
    read()方法
    逐字节地以二进制的原始方式读取数据
        public int read()； 读入一个字节，-1表示无
        public int read(byte b[])； 返回读入的字节数
        public int read(byte[] b, int off, int len)；


    OutputStream类
    write()方法
    它的功能是将字节写入流中
        public void write (int b)；// 将参数b的低位字节写入到输出流
        public void write (byte b[])；// 将字节数组b[]中的全部字节顺序写入到输出流
        public void write(byte[] b, int off, int len)；// 将字节数组b[]中从off开始的len个字节写入到流中
    Output的另外两个方法是flush()及close()。
        public void flush ()； 刷新缓存，实际写入到文件、网络
        public void close()； 关闭流


    Reader类
        与InputStream类相似，都是输入流
        但差别在于Reader类读取的是字符（char），而不是字节。
    Reader的重要方法是read()
        public int read()； //需要将int转成char
        public int read(char b[])；
        public int read(char[] b, int off, int len)；


    Writer类
        与OutputStream类相似，都是输出流
        但差别在于Writer类写入的是字符（char），而不是字节。
    Writer的方法有：
        public void write (int b)；// 将参数b的低两字节写入到输出流
        public void write (char b[])；// 将字符数组b[]中的全部字节顺序写入到输出流
        public void write(char[] b, int off, int len)；// 将字节数组b[]中从off开始的len个字节写入到流中
        public void write( String s)；// 将字符串写入流中
        public void write( String s, int off, int len)；// 将字符串写入流中, off为位置，len为长度
        public void flush ()；// 刷新流
        public void close()；// 关闭流
     */


    /*
    流分为节点流与处理流两类。
    （1）节点流（Node Stream）
        可以从或向一个特定的地方（节点）读写数据
        如文件流 FileInputStream，内存流 ByteArrayInputStream   // 文件、内存、网络、字符串
    （2）处理流（Processing Stream）
        是对一个已存在的流的连接和封装，处理流又称为过滤流（Filter)
        如缓冲处理流 BufferedReader        //



    节点流（Node Stream）
    直接与节点（如文件）相连
    处理流（Processing Stream）
    对节点流或其他处理流进一步进行处理
    （如缓冲、组装成对象，等等）


    处理流的构造方法总是要带一个其他的流对象作参数
    BufferedReader in =
        new BufferedReader(new FileReader(file));
    BufferedReader in2 =
        new BufferedReader(
            new InputStreamReader(    // 字节流过滤为reader
                new FileInputStream(file), “utf-8”));     //   字节->字符->bufferreader   一层一层包装、链式处理
    s = in2.readLine();
    一个流对象经过其他流的多次包装，称为流的链接


     */

}
