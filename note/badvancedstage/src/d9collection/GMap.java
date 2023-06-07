package d9collection;

/**
 * @author Eva   Email:
 * @Description
 * 一、Map实现类的结构：
 * |--- Map: 双列数据，存储key-value对的数据 -- 类似于告知的函数：y=f(x)
 *      |--HashMap: 作为Map的主要实现类；线程不安全，效率高；存储null的key和value
 *          |--LinkedHashMap:保证在遍历map元素时，可以按照添加的顺序实现遍历
 *              原因：在原有的HashMap底层结构基础上，添加了一对指针，指向前一个和后一个元素。
 *              对于频繁的遍历操作，此类执行效率高于HahsMap。
*       |--TreeMap: 保证按照添加的key-value对进行排序，实现排序遍历。此时考虑key的自然排序和定制排序。
 *                  底层使用的红黑树
 *      |--Hashtable: 作为古老的实现类；线程安全，效率高；不能存储null的key和value
 *          |-- Properties: 常用来处理配置文件。key和value都是String类型
 *
 *
 *       HashMap的底层： 数组+链表 （jdk7及之前）
 *                      数组+链表+红黑树（jdk 8）
 *
 *  面试题：
 *      1. HashMap的底层实现原理？
 *      2. HashMap 和 Hashtable的异同？
 *      3. CurrentHashMap 与 Hashtable的异同？ （暂时不讲）
 *
 * 二、
 *
 * @data 2023/6/7 15:51
 */
public class GMap {
}
