package d3date;

import org.junit.Test;

/**
 * @author Eva   Email:
 * @Description JDK 8之前的时间和日期的API测试
 * @data 2023/2/13 17:13
 */
public class ASystem {
    //    1、System类中的currentTimeMillis()
    @Test
    public void test01(){
//        返回当前时间戳与1970年1月1日0时0分0秒之间以毫秒为单位的时间差。
//        时间戳
        long time = System.currentTimeMillis();
        System.out.println(time);
    }
}
