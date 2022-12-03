package cainiao;
/*
数组中常见的异常：
    1、数组角标越界的异常：ArrayIndexOutOfBoundsException

    2、空指针异常：NullPointerException

 */
public class B8ArrayException {
    public static void main(String[] args) {
        int[] a={1,9,3,4,5};
//        System.out.println(a[9]);

//        空指针异常
//        情况一：
        int[] a2={1,9,3,4,5};
        a2 = null;
//        System.out.println(a2[0]);

//        情况二：
        int[][] a3 = new int[3][];
//        System.out.println(a3[1][1]);

//        情况三：
        String[] a4=new String[]{"aa","ss","ww"};
        a4[1] = null;
//        System.out.println(a4[1].toString());
    }
}
