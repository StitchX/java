package cn.ch07;

import java.lang.reflect.Array;

/*
自编程序排序与查找
    如冒泡排序 、选择排序 、快速排序等
系统已有的排序与查找
    如 Arrays类及Collections类
 */
import java.util.*;

class D_find {

    public static void main(String[] args) {
        /*
        Arrays类是用于对数组进行排序和搜索的类。
            Arrays.asList( 10, 7, 6, 5, 9) 方法可以直接得到一个List对象
        Arrays类提供了sort()和binarySearch()
        执行binarySearch()之前应调用sort()
            public static void sort(List list);
            public static void sort(List list, Comparator c);
            public static int binarySearch(List list, Object key);
            public static int binarySearch(List list, Object key, Comparator c)
         */
        int[] s = {11,32,23,51,64,35};
        System.out.println(s[2]);
        Arrays.<Integer>sort(s);
        for (int a:s){
            System.out.print(a+" ");
        }
        int loc = Arrays.<Integer>binarySearch(s,s[2]);
        System.out.println("Location of "+s[2]+" is "+loc);



        List<Person> school = new ArrayList<Person>();
        school.add(new Person("li",23));
        school.add(new Person("wang",21));
        school.add(new Person("zhang",18));
        school.add(new Person("chen",19));
        school.add(new Person("shao",21));
        System.out.println(school);

        /*
        此类完全由在 collection 上进行操作静态方法组成.
        如sort, binarySearch, reverse等
         */
        Collections.sort(school, new PersonCompatator());
//        更一般地，使用Lambda表达式（Java8以上）
//        Collections.sort(school,(p1,p2)->p1.age-p2.age);

        System.out.println(school);

        int index = Collections.binarySearch(school,new Person("li",23),new PersonCompatator());
//        int index2 = Collections.binarySearch(school,new Person("li",23),(p1,p2)->p1.age-p2.age);


        if (index >0){
            System.out.println("Found:"+school.get(index));
        }else {
            System.out.println("Not Found!");
        }


    }





}

class Person{
    String name;
    int age;
    public Person(String name, int age){
        this.name= name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name+":"+age;
    }
}
/*
要么对象是java.lang.Comparable
    实现方法
    public int compareTo(Object obj){
        return this.price – ((Book)obj).price;
    }
要么提供一个java.lang. Comparator
    实现方法 public int compare(T o1, T o2)
    这些方法的含义要与equals不冲突
 */
class PersonCompatator implements Comparator {

    @Override
    public int compare(Object obj1,Object obj2) {
        Person p1 = (Person) obj1;
        Person p2 = (Person) obj2;
        if (p1.age>p2.age) return 1;
        else if (p1.age<p2.age) return -1;
        else return p1.name.compareTo(p2.name);
    }
}