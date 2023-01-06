package allone.b23InnerClass;
/*
用的不多，看懂源码 integer

类的内部成员之五：内部类
1、Java中允许将一个类A声明在另一个类B中，则类A就是内部类，类B称为外部类
2、内部类的分类：成员内部类（静态、非静态） vs 局部内部类（方法内、代码块内、构造器内)
3、成员内部类
    一方面，作为外部类的成员
        >调用外部类的结构
        >可以被static修饰
        >可以被4种不同的权限修饰
    另一方面，作为一个类：
        >类内可以定义属性、方法、构造器等
        >可以被final修饰，表示此类不能被继承。言外之意，不使用final，就可以被继承
        >可以被abstract修饰
4、关注如下3个问题
    4.1 如何实例化成员内部类的对象
    4.2 如何在成员内部类中区分调用外部类的结构
    4.3 开发中局部内部类的使用
 */
public class AInner {
    public static void main(String[] args) {
//        4.1
//        静态的成员内部类
        Animal.Dog dog = new Animal.Dog();
        dog.show();

//        非静态成员内部类
        Animal a = new Animal();
        Animal.Bird bird = a.new Bird();

        bird.sing();




    }
}

class Animal{
    String name;
    public void eat(){

    }
//    成员内部类
    public Animal(){
        class CC{

        }
        Animal.this.eat();
    }

    static class Dog{
        String name;
        public Dog(){

        }
        public void show(){

        }

    }

    public class Bird{
        public void sing(){

        }
    }

    {
        class BB{
            String name;
            public void drink(String name){
                System.out.println(name); // 方法的形参
                System.out.println(this.name); // 内部类的属性
                System.out.println(Animal.this.name); // 外部类的属性
            }
        }
    }

//    =======================4.3==============================
//    开发中使用较少
    public void methodA(){
        class AA{

        }
    }

//    返回一个实现了Comparable接口的类的对象
    public Comparable getCompar(){

//        class myCompare implements Comparable{
//
//            @Override
//            public int compareTo(Object o) {
//                return 0;
//            }
//        }
//        return new myCompare();

//        方法二：
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }
}
