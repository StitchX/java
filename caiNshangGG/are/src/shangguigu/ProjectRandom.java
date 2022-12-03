package shangguigu;

public class ProjectRandom {
    public static void main(String[] args) {
        System.out.println(Math.random());  // [0,1)  0.5714565869091532

//        想要 10~99的数据
        /*
         */
        System.out.println((int)(Math.random()*(99-10+1)+10));
    }
}
