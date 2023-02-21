package d9collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Eva   Email:
 * @Description jdk5 新增foreach循环，用于遍历集合、数组
 * @data 2023/2/20 15:44
 */
public class DForEach {
    
    @Test
    public void demo01(){
        Collection coll1=new ArrayList();
        coll1.add("AA");
        coll1.add("BB");
        coll1.add("eew");
        coll1.add(123);

        for (Object obj :
                coll1) {
//            for(集合元素的类型 局部变量：集合对象)
//            内部仍然调用了迭代器
            System.out.println(obj);
        }
    }
}
