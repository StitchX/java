package cn.ch07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class C2_stackAndQueue {
    /*
    Stack 栈   // 使用：函数的调用、递归
    是遵循“后进先出”(Last In First Out, LIFO)原则
    重要线性数据结构
    包含三个方法
        public Object push(Object item)：将指定对象压入栈中。
        Public Object pop()：将 栈最上面的元素从栈中取出，并返回这个对象。
        public boolean empty()：判断栈中没有对象元素。
     */
    static String[] months = {
        "Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"
    };

    public static void main(String[] args) {
        Stack<String> stk = new Stack<>();
//        int i;
        for (int i=0;i < months.length;i++){
            stk.push(months[i]+" ");
        }
        System.out.println("stk = " +stk);
        System.out.println("popping elements：");
        while (!stk.empty()){
            System.out.println(stk.pop());
        }

        /*
    队列Queue  // 实现排队一些应用
    队列(Queue)，也是重要的线性数据结构。
    队列遵循“先进先出”(First In First Out，FIFO)的原则
    固定在一端输入数据(称为入队)，另一端输出数据(称为出队)。
    重要的实现是LinkedList类
                    可抛出异类的        返回元素的
    Insert（插入）     add(e)           offer(e)
    Remove（移除）    remove()          poll()
    Examine（检查）   element()         peek()

     */
        Queue<Integer> q = new LinkedList<>();
        for (int j=0;j<5;j++){
            q.offer(j);
        }
        while (!q.isEmpty()){
            System.out.println(q.poll());
        }
    }



    /*
    几个早期的类或接口
    Vector， 现多用 ArrayList
        相当于动态数组(比JDK1.0中的 ArrayList好), elementAt,
    Stack， 现多用 LinkedList
        Stack是Vector的子类, push, pop, peek
    Hashtable， 现多用 HashMap
        Hashtable实现Map接口, 参见Properties类
    Enumeration， 现多用Iterator
        Enumeration用另一种方式实现Iterator的功能
        如Vector可以得到枚举器
        Enumeration<E> e = v.elements();
        while(e.hasMoreElements()) doSomething(e.nextElement())
     */
}
