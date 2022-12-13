package cainiao;

// Arrays 工具类
import java.util.Arrays;

public class B7ArrayClass {
    public static void main(String[] args) {
        int[] a={1,9,3,4,5};
        int[] b={1,2,3,5};
        String str = Arrays.toString(a);  //将数组array转换成字符串
        System.out.println(str);  //[1, 9, 3, 4, 5]
        Arrays.sort(a);  // 排序
        System.out.println(a[1]);  // 3
        Arrays.fill(a,10);  // 全部赋值为10
        System.out.println(a[0]);  //10

        System.out.println(Arrays.equals(a,b));  //比较两个数组

        int i=Arrays.binarySearch(a,5);  // 二分法查找
        System.out.println(i); // 查找特定元素下标
    }
}
