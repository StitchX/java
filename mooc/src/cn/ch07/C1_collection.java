package cn.ch07;

/*
Collection API
   Collection API提供“集合”“收集”的功能
   Collection API包含一系列的接口和类

Collection API包含三大类
Collection接口：有两个子接口
    List: (Collection的子接口)记录元素的保存顺序，且允许有重复元素
    Set: (Collection的子接口) 不记录元素的保存顺序，且不允许有重复元素
Map接口，即映射
    键-值对（key-value pair）的集合
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.*;

/*
collection接口
 +add(element: Object) : boolean
 +remove(element: Object) : boolean
 +size() : int
 +isEmpty()  : boolean
 +contains(element: Object)   :  boolean
 +iterator()  Itetator   遍历 迭代


Iterator(interface)  -> collection  (interface) ->set     ->   HashSet、TreeSet
                                                ->List    (interface)  ->   vector（->Stack）、ArrayList、LinkedList
                                                ->Queue   (interface)  ->   PriorityQueue、ArrayDeque、LinkedList
 */
public class C1_collection {
    /*
    List接口： 线性表（linear list）
        主要的实现类是 ArrayList. LinkedList， 以及早期的Vector
    List接口
        public interface List<E> extends Collection<E> {
            E get(int index);
            E set(int index, E element);
            void add(int index, E element);
            E remove(int index);
            int indexOf(Object o);
            ....
        }

    迭代器 Iterator (所有的Collection都能产生）
        Iterator iterator = iterable.iterator();
        while( iterator.hasNext()) doSomething( iterator.next());

    在JDK1.5以后，增强的for语句(enhanced for)或叫for-each
    for( Element e : list ) doSomething(e);
        for (Photo photo : album){
            System.out.println( photo.toString() );
            }
    编译器生成了Iterator的while(hasNext（)) {….next() }
     */

    public static void main(String[] args) {

//        List<Photo> album = new ArrayList<>();
//        Photo类型列表，<>方式表泛型
        List<Photo> album = new LinkedList<>();
        album.add(new Photo("one", new Date(), "classroom"));
        album.add(new Photo("two", new Date(), "library"));
        album.add(new Photo("three", new Date(), "gym"));
        album.add(new Photo("four", new Date(), "dorm"));


        Iterator<Photo> iterator =  album.iterator();
        while (iterator.hasNext()){
            Photo photo = iterator.next();
            System.out.println(photo.toString());
        }
        for(Photo photo:album){
            System.out.println(photo);
        }
    }


}


class Photo{
    String title;
    Date date;
    String memo;
    Photo(String title,Date date,String memo){
        this.date = date;
        this.title =title;
        this.memo = memo;
    }
    @Override
    public String toString(){
        return title + "("+date+")" +memo;
    }

}
