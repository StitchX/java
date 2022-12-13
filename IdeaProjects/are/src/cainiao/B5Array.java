package cainiao;

// 数组
public class B5Array {
    /*
    Java 语言中提供的数组是用来存储固定大小的同类型元素。
    一、数组的概述
    1、数组的理解：数组(Array)，是多个相同类型数据按照一定顺序排列的集合，并使用一个名字命名，
    并通过编号的方式对这些二数据进行统一管理。

    2、数组的相关的概念
    》数组名
    》元素
    》角标、下标、索引
    》数组的长度，元素的个数

    3、数组的特点
    1）数组是有序排列的
    2）数组属于引用数据类型的变量。数组的元素，既可以是基本数据类型，也可以是引用数据类型
    3）创建数组对象会在内存中开辟一整块连续的空间   （对比链表，由地址指向下一个空间）
    4）数组的长度一旦确定，就不能更改

    4、数组的分类
    1）按照维度：一维数组、二维数组。。
    2）按照数组元素的类型：基本数据类型元素的数组、引用数据类型元素的数组
     */

//    数组作为参数
    public void arraydemo(int[] i){
        for (int j:i){
            System.out.println(j);
        }
    }

//    数组作为返回值
    public int[] arraydemo2(){
        int[] aa = new int[]{11,2,23,4,5,6};
        return aa;
    }

    public static void main(String[] args) {
//        声明
        double[] a1; // 首选的方法
        double a2[]; //Java中采用是为了让 C/C++ 程序员能够快速理解java语言

//        创建 和 赋值
        a1 = new double[10];  // 静态初始化：数组的初始化和数组元素的赋值操作分开进行
        a1[0]=1.0;
//        a1[10]=2.2;  //Index 10 out of bounds for length 10
        a2 = new double[]{1.2,3.4,5.6}; // 静态初始化：数组的初始化和数组元素的赋值操作同时进行

        int[] a3={1,2,6,4};

        int[][] a4=new int[][]{{1,2},{1,2,3}}; // 二维数组
        int[][] a5=new int[2][3];
//        二维数组；依赖于内存结构的理解
        int[][] a6 = new int[2][];
        a6[0] = new int[4];  // 引用的引用
        a6[0] = new int[3];
        int[] a7[]=new int[2][];  // 也是二维数组

//        for增强
        for (double i :a2){
            System.out.println(i);
        }

//        数组作为函数 的 参数
        B5Array b5 = new B5Array();
        b5.arraydemo(new int[]{1,2,3,4,5,6,7});

//        数组作为函数的返回值
        System.out.println(b5.arraydemo2()[3]);

        a1[0]=1.2;
        a1[1]=2.1;
        System.out.println(a1[1]);   //2.1
        System.out.println(a1.length);  //10
        System.out.println(a1[2]);   // 0



//        数组的复制

        int[] array1,array2;
        array1 = new int[]{1,2,3,4,5};
//        array2 = array1;  // 复制的索引

//        复制
//        array2 = new int[array1.length];
//        for (int i = 0;i<array1.length;i++){
//            array2[i] = array1[i]
//        }


    }
}

/*
1、声明、初始化
2、调用指定位置元素
3、获取数组长度
4、遍历数组元素
5、数组元素的默认初始化值(数字：0，0.0 ; 布尔：false; String：null; char：0或'\\u000' ;
                        引用数据类型 String:null)
6、数组的内存解析
堆栈的概念，引用计数算法，垃圾回收机制



二维数组：
5、数组元素的默认初始化值
    外层元素为地址值a[0]  = [I@15dbs7457  ； 内层未初始化则为 null
    内层元素和一维一致a[0][0] = null

 */