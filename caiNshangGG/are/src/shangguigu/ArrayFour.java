package shangguigu;

/*
数组的复制、反转、查找（线性查找，二分法）、冒泡排序、快速排序
 */
public class ArrayFour {

    public static void main(String[] args) {
        int[] array1,array2;
        array1 = new int[]{1,2,3,4,5,6,7,8,9};
//        array2 = array1;  // 复制的索引

//        复制
//        array2 = new int[array1.length];
//        for (int i = 0;i<array1.length;i++){
//            array2[i] = array1[i]
//        }


//        反转
        for (int i = 0;i<array1.length;i++){
            int temp;
            temp = array1[i];
            array1[i] = array1[array1.length-i-1];

//            线性查找，一个个查找
//            二分法查找：比较快，前提是所要查找的数组是有序的
//            略



        }
    }
}
