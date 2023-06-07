package d9collection.exercise;

import org.junit.Test;

import java.util.HashSet;

/**
 * @author Eva   Email:
 * @Description
 * @data 2023/6/7 15:26
 */
public class Interviewer {


    @Test
    public void test03(){
        HashSet set = new HashSet();
        Person p1 = new Person(1001,"AA");
        Person p2 = new Person(1002,"CC");

        set.add(p1);
        set.add(p2);

        System.out.println(set);

        p1.name="CC";
        set.remove(p1);  // 找到位置，无法找到位置，之前存储的位置是AA，现在是通过CC找的

        System.out.println(set);

        set.add(new Person(1001,"CC"));

        System.out.println(set);

        set.add(new Person(1001,"AA"));

        System.out.println(set);
    }
}
