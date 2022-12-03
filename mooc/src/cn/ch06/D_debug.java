package cn.ch06;
/*
程序中的错误通常可以分成三大类
语法错误（Syntax error)
    编辑、编译器发现
运行错误（Runtime error）  // 文件打不开，网络问题
    异常处理机制
逻辑错误（Logic error）   // 1加到100，只加到99
    调试（debug) 、单元测试（unit test)

 */
/*
调试的三种手段
    断点 (breakpoint)
    跟踪 (trace)    F7
    监视 (watch)
 */

/*
• 即时监视
    鼠标指向变量
• 快速监视
    点右键，Inspector
• 添加监视
    点右键，Watch
• 还可以看：调用堆栈等
 */

public class D_debug {
    public static void main(String[] args) {
        int[] x = {1,2,3,4,5,6,7};
        int total = sum(x);
        System.out.println(total);

    }

    static int sum(int[] a){
        int sum=0;
        for (int i=0;i<a.length;i++){
            sum +=a[i];
        }
        return sum;
    }
}
