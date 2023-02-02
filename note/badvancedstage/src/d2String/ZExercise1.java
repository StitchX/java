package d2String;

/**
 * @author Eva   Email:
 * @Description 面试题
 * @data 2023/2/2 17:33
 */
public class ZExercise1 {
    String str = new String("good");
    char[] ch = {'t','e','s','t'};

    public void change(String str,char ch[]){
        str = "test OK";
        ch[0] = 'b';
    }

    public static void main(String[] args) {
        ZExercise1 ze = new ZExercise1();
        ze.change(ze.str, ze.ch);
        System.out.println(ze.str);  // good
        System.out.println(ze.ch); // best
    }
}
