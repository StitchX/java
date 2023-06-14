package d9collection;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Eva   Email:
 * @Description
 * @data 2023/6/14 14:49
 */
public class IProperties {
    /*
    1、工程下面新建一个resource bundle / file - 生成一个properties配置文件
    2、配置文件内容 = 左右不要有空格
     */

    @Test
    public void test01(){
        FileInputStream fis = null;
        try {
            Properties properties = new Properties();
            fis = new FileInputStream("jdbc.properties");
            properties.load(fis); // 加载流对应文件

            String name = properties.getProperty("name");
            String password = properties.getProperty("password");

            System.out.println("name = "+ name+",password="+password);

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (fis != null){
                try {
                    fis.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

    }
}
