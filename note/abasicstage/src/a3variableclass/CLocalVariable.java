package a3variableclass;

/**
 * @author Eva   Email:
 * @Description 局部变量
 * @data 2023/1/6 11:05
 */
public class CLocalVariable {
    /*
    局部变量：类的方法中的变量
    声明在方法、构造方法或者语句块中；
    在方法、构造方法、或者语句块被执行的时候创建，当它们执行完成后，变量将会被销毁；
    访问修饰符不能用于局部变量；
    只在声明它的方法、构造方法或者语句块中可见；
    是在栈上分配的。
    没有默认值，所以局部变量被声明后，必须经过初始化，才可以使用。
     */

    public void pup(){
//        局部变量
//        byte aa;
//        System.out.println(aa);   // 必须初始化

//        public int bb=9; // 访问修饰符不能用于局部变量

        int aa=2;
        System.out.println(aa);
    }
}
