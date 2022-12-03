package cn.ch06;
/*
断言（assertion)
assert的格式是：
    assert 表达式;
    assert 表达式 : 信息;
 */

public class C1_assertion {
    public static void main(String[] args) {
        C1_assertion c1 = new C1_assertion();
        assert c1.hypotenuse(4,3)==5:"算法不正确";
    }
    /*
    编译
        只有在JDK1.4及以上的版本中才可以使用断言。
        具体地说，在早期的JDK版本(1.4)中编译时，要通过-source选项来指明版本，如：
        javac -deprecation -source 1.4 -classpath . Assertion.java
    运行
        在运行时，要使assert起作用，则在java命令中，使用选项(-ea，即-enableassertions)。如：
        java -ea -classpath . Assertion

     */
    double hypotenuse(double x, double y){
        return Math.sqrt(x*x + y*y);
    }

//    http://www.junit.org

}
