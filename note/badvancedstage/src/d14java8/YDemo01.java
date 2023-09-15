package d14java8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Eva   Email:
 * @Description
 * @data 2023/9/15 11:22
 */
public class YDemo01 {
    public static List<YDemo02> getEmployees(){
        List<YDemo02> list = new ArrayList<>();
        list.add(new YDemo02(1001,"马化腾",34,6000.38));
        list.add(new YDemo02(1002,"马云",30,9856.12));
        list.add(new YDemo02(1003,"刘强东",40,6789.54));
        list.add(new YDemo02(1004,"雷军",35,6437.38));
        list.add(new YDemo02(1005,"李彦宏",20,9786.65));
        list.add(new YDemo02(1006,"任正非",50,7543.33));

        return list;
    }


}
