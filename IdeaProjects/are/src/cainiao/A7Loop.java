package cainiao;

// 循环语句
//break continue
public class A7Loop {
    /*
    Java5 中引入了一种主要用于数组的增强型 for 循环
     */

    public static void main(String[] args) {

//        声明语句：声明新的局部变量，该变量的类型必须和数组元素的类型匹配。其作用域限定在循环语句块，其值与此时数组元素的值相等。
//        表达式：表达式是要访问的数组名，或者是返回值为数组的方法。
        int[] a = {1,2,3,4,5};
        for (int i:a){
            System.out.println(i);
        }


//        带标签的break和continue

        label: for (int j=0;j<10;j++){
            for (int k=0;k<10;k++){
                if (j==3){
                    break label; // 指定结束循环 label
                }
            }
        }
    }
}
