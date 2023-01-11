package a3variableclass;

/**
 * @author Eva   Email:
 * @Description 成员变量
 * @data 2023/1/6 11:05
 */
public class BMemberVariable {
    /*
        类变量：独立于方法之外的变量，用 static 修饰
            类变量也称为静态变量，在类中以 static 关键字声明，但必须在方法之外。
            无论一个类创建了多少个对象，类只拥有类变量的一份拷贝。
            除了被声明为常量外很少使用，静态变量是指声明为 public/private，final 和 static 类型的变量。静态变量初始化后不可改变。
            储存在静态存储区。经常被声明为常量，很少单独使用 static 声明变量。
            在第一次被访问时创建，在程序结束时销毁。
            与实例变量具有相似的可见性。但为了对类的使用者可见，大多数静态变量声明为 public 类型。
            默认值和实例变量相似。数值型变量默认值是 0，布尔型默认值是 false，引用类型默认值是 null。变量的值可以在声明的时候指定，
                也可以在构造方法中指定。此外，静态变量还可以在静态语句块中初始化。
            静态变量可以通过：ClassName.VariableName的方式访问。
            类变量被声明为 public static final 类型时，类变量名称一般建议使用大写字母。如果静态变量不是 public 和 final 类型，
                其命名方式与实例变量以及局部变量的命名方式一致。

        实例变量：独立于方法之外的变量，不过没有 static 修饰
            声明在一个类中，但在方法、构造方法和语句块之外；
            当一个对象被实例化之后，每个实例变量的值就跟着确定；
            在对象创建的时候创建，在对象被销毁的时候销毁；
            实例变量的值应该至少被一个方法、构造方法或者语句块引用，使得外部能够通过这些方式获取实例变量信息；
            可以声明在使用前或者使用后；
            访问修饰符可以修饰实例变量；
            对于类中的方法、构造方法或者语句块是可见的。一般情况下应该把实例变量设为私有。通过使用访问修饰符可以使实例变量对子类可见；
            具有默认值。数值型变量的默认值是0，布尔型变量的默认值是false，引用类型变量的默认值是null。变量的值可以在声明时指定，也可以在构造方法中指定；
            可以直接通过变量名访问。但在静态方法以及其他类中，就应该使用完全限定名：ObjectReference.VariableName。
     */
    //    类变量
    static long cc = 100; // 详细可参考static的介绍
    //    全局变量
    public short bb; //

    public void pup(){
        System.out.println(bb);  // 直接使用全局变量
        System.out.println(cc);
    }

    public static void main(String[] args) {
//        System.out.println(bb);  静态方法不可以直接使用非静态变量
    }
}