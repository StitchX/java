package com.foundation;
//Java 语言中提供的数组是用来存储固定大小的同类型元素。
// Java 数组的声明、创建和初始化

public class K_Array {

    public static void printArray(int[] array){
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]);
        }
        System.out.println();
    }
    public static int[] pr2(int[] array){
        return array;
    }


    public static void main(String[] args) {
//        一、使用 dataType[arraySize] 创建了一个数组。
//        二、把新创建的数组的引用赋值给变量 arrayRefVar


//      ---------------------------声明和创建----------------------------------------
//    声明的两种方式区别
        String[] arrayRefVar;
//        String arrayRefVar2[]; // 效果相同，但不是首选方法,风格是来自 C/C++ 语言,了让 C/C++ 程序员能够快速理解java语言

//        创建数组的三种方式：
//        知道要存入的元素值，用静态初始化\未知要数组中放入什么元素值，用动态初始化
//        方法一：
        int[] arraydemo1 = new int[5];   // 默认初始化，基本类型是 0  布尔类型是 false 引用类型为null

//        方法二： 一、使用 dataType[arraySize] 创建了一个数组。二、把新创建的数组的引用赋值给变量 arraydemo2。
        //int[] arraydemo02 (声明，此时存放一个引用，为null);  arraydemo02 = new int[]{2,3,1} （分配空间并赋值）
        int[] arraydemo2 = new int[]{1,2,3,4,5};

//        方法三
        int[] arraydemo3 = {1,2,3,4,5};  //  静态创建，声明并直接赋值，创建内存空间。

//        方式一和方式二,声明和内存分配是分开的,
//        int[] arraydemo2 这一步是在栈空间分配一个引用，存放的是一个引用，null
//        到这一步的时候jvm才开始在内存堆区域分配空间，并赋值
//------------------------------------------------------------------------------------------


//    创建数组
        /*
        arrayRefVar = new String[5];
        int[] arrayInt2 = {1,2,3,4,5};

        arrayRefVar[0]="aa";
        arrayRefVar[1]="bb";
        arrayRefVar[4]="dd";
        for (int i=0;i<arrayRefVar.length;i++){
            System.out.println(arrayRefVar[i]);
            System.out.println(i);
        }

        for (String j:arrayRefVar){
            System.out.println(j);
        }

         */

        printArray(new int[]{1,2,3,4,5});

//        数组作为函数的返回值
        System.out.println(pr2(new int[]{9,8,7,6})[0]);


//        多维数组
//        多维数组的动态初始化（以二维数组为例）
//        1. 直接为每一维分配空间，格式如下：
//        2.从最高维开始，分别为每一维分配空间
        double[][] s = new double[3][4];
        String[][] s2 = new String[3][];
//        s[0]=new String[2] 和 s[1]=new String[3] 是为最高维分配引用空间,为最高维限制其能保存数据的最长的长度
        s2[0] = new String[2];
        s2[1] = new String[3];
//        然后再为其每个数组元素单独分配空间 s0=new String("Good")
        s2[0][0] = new String("qq");
        s2[1][2]="QQ";
        s[0][1] = 2.3;


//        java 基本数据类型传递参数时是值传递 ；引用类型传递参数时是引用传递
    }
}
