package cn.ch06;

import org.junit.Test;

import static org.junit.Test.*;
/*
• @Test来标注测试函数
• 在测试中常用的语句如下：
 fail( 信息 ); //表示程序出错
 assertEqauls(参数1，参数2 ); //表示程序要保证两个参数要相等
 assertNull(参数); //表示参数要为null
例如：
• @Test
• public void testSum2() {
• HelloWorld a = new HelloWorld();
• assertEquals(a.sum(0, 100), 100);
• // fail("Not yet implemented");
• }

 */
public class C2_junit {

    @Test
    public void asserC1(){

        C1_assertion c1 = new C1_assertion();
        assert c1.hypotenuse(4,3)==5:"算法不正确";

    }


}
