package d13reflection;

import org.junit.Test;

import javax.management.ObjectName;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author Eva   Email:
 * @Description
 *  调用运行时类中指定的结构：属性、方法、构造器
 * @data 2023/7/19 14:09
 */
public class GReflection {
    /*
    不需要掌握
     */
    @Test
    public void test01() throws Exception {
        Class clazz = YCat.class;
//        创建运行时类的对象
        YCat y1 = (YCat) clazz.newInstance();

//        获取指定的属性：要求运行时类中属性声明为public
//        通常不采用此方法
        Field id = clazz.getField("id");
//        clazz.getField("id");
        /*
        设置当前属性的值

        set()：参数1：指明设置哪个对象的属性 参数2：将此属性值设置为多少
         */
        id.set(y1,1001);
        /*
        获取当前属性的值
        get()：参数1：获取哪个对象的当前属性值
         */
        int pId = (int)id.get(y1);
        System.out.println(pId);

    }
    /*
    如何操作运行时类中的指定的属性 -- 需要掌握
     */

    @Test
    public void test02() throws Exception {
        Class clazz = YCat.class;
//        创建运行时类的对象
        YCat y1 = (YCat) clazz.newInstance();

//        1. getDeclaredField(String fieldName)：获取运行时类中指定变量名的属性
        Field name = clazz.getDeclaredField("name");

//        2.保证当前属性是可访问的
        name.setAccessible(true);
//        3.获取、设置指定当对象的此属性值
        name.set(y1,"name");

        System.out.println(name.get(y1));
    }
    /*
    如何操作运行时类中的指定的方法 -- 需要掌握
     */

    @Test
    public void test03() throws Exception {

        Class clazz = YCat.class;
//        创建运行时类的对象
        YCat y1 = (YCat) clazz.newInstance();

//        1.获取指定的某个方法
//        getDeclaredMethod():参数1 :指明获取的方法的名称 参数2:指明获取的方法的形参列表
        Method show = clazz.getDeclaredMethod("show",String.class);
//        2.保证当前方法是可访问的
        show.setAccessible(true);
        /*
        3. 调用方法的invoke():参数1:方法的调用者 参数2: 给方法形参赋值的实参
        invoke()的返回值即为对应类中调用的方法的返回值.
         */
        Object returnValue = show.invoke(y1,"CHN"); //String nation = y1.show("CHN");
        System.out.println(returnValue);
        System.out.println("**************如何调用静态方法**********************");
//        private static void showDesc()
        Method showDesc = clazz.getSuperclass().getDeclaredMethod("showDesc");
        showDesc.setAccessible(true);
//        如果调用的运行时类中的方法没有返回值,则此invoke()返回null
//        Object returnVal = showDesc.invoke(YCat.class);
        Object returnVal = showDesc.invoke(null);
        System.out.println(returnVal);//null

    }

    /*
    如何操作运行时类中的指定的构造器
     */
    @Test
    public void test04() throws Exception {
        Class clazz = YCat.class;

//        private Person(String name)
        /*
        1.获取指定的构造器
        getDeclaredConstructor(): 参数: 指明构造器的参效列表
         */
        Constructor constructor = clazz.getDeclaredConstructor(String.class);

//        2.保证此构造器是可访问的
        constructor.setAccessible(true);

//        3.调用此构造器创建运行时类的对象
        YCat y1 = (YCat) constructor.newInstance("Tom");
        System.out.println(y1);
    }
}
