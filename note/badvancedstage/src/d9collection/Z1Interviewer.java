package d9collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Eva   Email:
 * @Description 面试题 List
 * @data 2023/6/6 16:21
 */
public class Z1Interviewer {

    /*
    区分List中的remove(int index) 和 remove(Object obj)
     */
    public void testListRemove(){
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        updateList(list);
        System.out.println(list);
    }

    private static void updateList(List list){
//        list.remove(2);
        list.remove(new Integer(2));
    }
}
