package com.foundation;

//循环、条件、选择结构 ：for、while、if、switch

public class G_LoCondSele {
    public static void main(String[] args) {
//        --------------------------------------
        /*
        int x=10;
        while (x>1){
            System.out.println("while循环");
            x--;
        }

        do {
            System.out.println("do,while");
            x++;
        }while (x>11);

//      For-Each 循环或者加强型循环
        for(int j=1;j<10;j++){
            System.out.println("for循环");
        }

//        Java5 引入了一种主要用于数组的增强型 for 循环
        int[] numbers={1,2,3,4,5};
        for (int z:numbers){
            System.out.print(z);
            if (z==5){
                break;  //continue 略
            }
            System.out.print(",");
        }

         */

//        -----------------------------------------------------------
/*
        int a=5;
        if (a > 1){
            System.out.println("条件语句");
        }else if(a<1) {
            System.out.println("第二条件");
        }else {
            System.out.println("所有之后");
        }

        if(a>1){
            if (a==5){
                System.out.println("嵌套语句");
            }
        }

 */

//        ---------------------------------------------------------------
//        从 Java SE 7 开始，switch 支持字符串 String 类型了
        char grade = 'C';
        switch (grade){
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
                System.out.println("良好");
                break;
            case 'C':
                System.out.println("及格");
                break;  //没有break则打印后面的分支 不合格 未知等级

            case 'D':
                System.out.println("不合格");

            default:
                System.out.println("未知等级");
        }


    }
}
