package cn.ch05;
// 第五章：深入理解Java语言
/*
1、基本类型变量和引用变量
2、字段变量和局部变量
3、变量的传递
4、变量的返回
5、补充：不定长参数
 */

public class A_variable {

//    1、
//    基本类型(primitive type)：其值直接存于变量中。“在这里”
//    引用型(reference type) 的变量除占据一定的内存空间外，它所引用的对象实体（由new 创建）也要占据一定空间。“在那里”
//        三种引用类型：interface、class、array
//          引用型变量只存储了一个引用，可理解为对象实体的地址/指针/句柄
    private int day;
    private int month;
    private int year;
    public A_variable(int a, int b, int c){
        year = a;
        month = b;
        day = c;
    }
    void addYear(){
        year++;
    }
    public void disPlay(){
        System.out.println(year+" "+ month+ " "+day);
    }
//    public static void main(String[] args) {
//        A_variable av = new A_variable(2021,1,1);
//        A_variable avb = av;   // av和avb两个变量指向同一个实体对象
//        av.addYear();
//        av.disPlay();    // 2022 1 1
//        avb.disPlay();    // 2022 1 1
//    }

//    2、
//    字段变量（field)与局部变量(Local variable)
//    前者是在类中，后者是方法中定义的变量或方法的参变量
//    从内存角度看
//        存储位置，字段变量为对象的一部分、存在于堆中的，局部变量是存在于栈中。 （）
//        生命周期不同  (字段变量随对象创建而产生；局部变量随方法的使用，在栈中创建空间，方法结束后存储释放)
//        初始值：字段变量可以自动赋初值（上诉year\month\day，数值初始为0，布尔为FALSE），局部变量则须显式赋值
//    从语法角度看
//      字段变量属于类，可以用public,private,static,final 修饰
//      局部变量不能够被访问控制符及static修饰
//      都可以被final修饰

    void Demo(){

//        报错
        final int a;  //进入方法体后栈指针发生变化，未对局部变量赋值
//        System.out.println(a);  // 需要初始化   局部变量则须显式赋值
    }

//    3、
//    Java 是值传递，即，是将表达式的值复制给形式参数。
//    对于引用型变量，传递的值是引用值，而不是复制对象实体
//      可以改变对象的属性
    public static void modify(int a){
        a++;
    }
    public static void modify(int[] b){
        b[0]++;
        b = new int[7];
    }

    public static void main(String[] args) {
        int a1 = 0;
        modify(a1);
        System.out.println(a1);  // 0  a1 = 0; a = 0; a=1

        int[] b1 = new int[2];
        modify(b1);
        System.out.println(b1[0]);  //3   b1[0]->(实体对象，初始为0)；b[0]->(同一个实体对象);(实体对象+1);b1[0]->(1)
        System.out.println(b1[1]);

    }


//    4、  --------- 没听懂
//    方法的返回：
//    返回基本类型
//    返回引用类型。它就可以存取对象实体
    /*
     Object getNewObject()
• {
• Object obj=new Object();
• return obj;
• }
• 调用时：Object p= GetNewObject();
     */

//    5、
//    不定长参数（Variable length arguments），从JDK1.5开始
//    用省略号表示, 并且是最后一个参数
//    实际上Java当成一个数组
    int sum(int... nums){   //主要用于数组的增强型 for 循环
        int sum = 0;
        for(int n:nums){
            sum+=n;
        }
        return sum;
    }


}


