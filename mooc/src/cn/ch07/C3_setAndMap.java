package cn.ch07;

import java.util.*;

public class C3_setAndMap {
    /*
    Set 集
        两个重要的实现 HashSet及TreeSet
        其中TreeSet的底层是用TreeMap来实现的
    Set中对象不重复，即：
        hashCode()不等
        如果hashCode()相等，再看equals或==是否为false
     */
    /*
    注：
     String 对象的哈希码根据以下公式计算：
        s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
     使用 int 算法，这里 s[i] 是字符串的第 i 个字符，n 是字符串的长度，^ 表示求幂。（空字符串的哈希值为 0。）
     一般在覆盖时，要同时覆盖 hashCode、equals方法
     相同数值以链表形式存储
     */
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Brazil");
        set.add("Russia");
        set.add("India");
        set.add("China");
        set.add("south Africa");

        System.out.println(set.contains("China"));

        for (String obj: set){
            System.out.println(obj);
        }

        /*
         Map是键-值对的集合
             其中可以取到entrySet()、keySet()、values()、
             Map.Entry是一个嵌套接口
         Map类的重要实现
             HashMap类
             TreeMap类：用红黑树的算法
         */

//        Map<String,String> map = new HashMap<>();
        Map<String,String> map = new TreeMap<>();
        map.put("b","Brazil");
        map.put("r", "Russia");
        map.put("i","India");
        map.put("c","china");
        map.put(new String("c"),"China2"); // 替换上一个值

        System.out.println(map.get("c"));

        for (String key:map.keySet()){
            System.out.println(key);
        }

        for (String valus:map.values()){
            System.out.println(valus);
        }

        for (Map.Entry<String,String> entry:map.entrySet())
            System.out.println(entry.getKey()+":"+entry.getValue());

        Iterator it = map.entrySet().iterator();
//        while (it.hasNext()){
//            Map.Entry<String,String> entry = (Map.Entry<String,String>)it;  //没有看到完整代码
//            System.out.println();
//        }

        /*
        Map        -> Hashtable、AbstractMap（ -> HashMap、TreeMap）
          这个是 <interface>                       这些后面的是类
        Dictionary -> Hashtable -> Properties
         */
    }
}
