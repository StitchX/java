package cn.ch07;

/*
泛型（Generic）是JDK1.5增加的最重要的Java语言特性。   // 针对不同类型的相同使用方法，多态的一种，
    使用泛型可以针对不同的类有相同的处理办法
    Vector<String> v = new Vector<String> ();
    v.addElement( “one” );
    String s = v.elementAt(0);
使用泛型的好处
    类型更安全    // 没有泛型则为object，后面进行转换
    适用更广泛，针对不同的类有相同的处理办法，但这些类之间不一定有继承关系。
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

/*
对类型的限定
• 使用?  // 表示任意类型
    如Collections的reverse方法
    reverse(List<?> list)  // 注意泛型是引用类型
• 使用extends  // 表示子类
    如Set的addAll方法
    addAll(Collection<? extends E> col )
• 使用super // 表示父类、超级类、基类
    如Collections的fill方法
    fill(List<? super T> list, T obj)
 */
/*
有时泛型写起来比较复杂
• Arrays.sort方法
•   public static <T> void sort(T[] a, Comparator<? super T> c)
• Stream.map方法
•   public <R> Stream<R> map(Function<? super T, ? extends R> mapper)
• Collections.max方法
•   public static <T extends Object & Comparable<? super T>>T
•   max(Collection<? extends T> coll)
 */
public class E_generic {
    public static void main(String[] args) {
        TNode<String> t=new TNode<>("Roo");
        t.add("Left");
        t.add("Middle");
        t.add("left");
        t.getChild(0).add("aaa");
        t.getChild(0).add("bbb");
        t.traverse();


        Date data = BeanUtil.<Date>getInstance("Java.util.Date");
        System.out.println(data);
    }

}

//自定义泛型类
class TNode<T>{
    private T value;
    private ArrayList<TNode<T>> children = new ArrayList<>();

    TNode(T v) {this.value = v;}
    public T getValue(){return this.value;}
    public void add(T v){
        TNode<T> child = new TNode<>(v);
        this.children.add(child);
    }
    public TNode<T> getChild(int i){
        if ((i<0) ||(i>this.children.size()) ) return null;
        return (TNode<T>) this.children.get(i);
    }

    public void traverse(){
        System.out.println(this.value);
        for (TNode child:this.children) child.traverse();
    }
}
//自定义泛型方法    注意：<>要写到方法名字的前面
//Java中的Bean经常指对象
class BeanUtil{
    public static <T> T getInstance(String clzName) {
        try {
            Class c = Class.forName(clzName);
            return (T) c.newInstance();
        }
        catch (ClassNotFoundException ex){}
        catch (InstantiationException ex){}
        catch (IllegalAccessException ex){}
        return null;
    }


}
