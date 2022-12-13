package cainiao;

public class B6ArrayTest {
    public static void main ( String[] args )
    {
        int[] myArray = {1, 2, 3, 4, 5};
        ChangeIt.doIt( myArray );
        for(int j=0; j<myArray.length; j++)
            System.out.print( myArray[j] + " " );
    }
}

//java 基本数据类型传递参数时是值传递 ；引用类型传递参数时是引用传递 。
//    然而数组虽然是引用传递 ，但是将引用 z = null 只是将引用z不指向任何对象 ，并不会对原先指向的对象数据进行修改 。
class ChangeIt
{
    static void doIt( int[] z )
    {
        z = null ;
    }
}
//数组作为参数是引用传递 ，在 doIt 方法中可以修改数组的值 。
class LowHighSwap
{
    static void doIt( int[] z )  // z 和 myArray指向同一个地址值
    {
        int temp = z[z.length-1];
        z[z.length-1] = z[0];
        z[0] = temp;
    }
}