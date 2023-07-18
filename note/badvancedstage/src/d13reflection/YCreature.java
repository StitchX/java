package d13reflection;

import java.io.Serializable;

/**
 * @author Eva   Email:
 * @Description
 * @data 2023/7/18 15:47
 */
public class YCreature<T> implements Serializable {
    private char gender;
    public double weight;
    private void breath(){
        System.out.println("生物呼吸");
    }

    public void eat(){
        System.out.println("生物吃东西");
    }
}
