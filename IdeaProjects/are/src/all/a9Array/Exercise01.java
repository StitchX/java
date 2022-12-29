package all.a9Array;


public class Exercise01 {
    public static void main ( String[] args ){

        int[] myArray = {1, 2, 3, 4, 5};
        ZDemo01.doIt( myArray );

        for(int j=0; j<myArray.length; j++)
            System.out.print( myArray[j] + " " ); // 1 2 3 4 5

        System.out.println("下面是地址传递,指向同一个对象");
        ZDemo02.doIt(myArray);
        for(int j=0; j<myArray.length; j++)
            System.out.print( myArray[j] + " " ); // 5 2 3 4 1
    }

}
