package shangguigu;
/*
面向对象练习题：
定义类Student，包含三个属性，学号number(int)，年级state（int），成绩score（int）
创建20个学生对象，学号为1到20，年纪和成绩都由随机数确定。

问题一：打印出3年级（state值为3）的学生信息。
问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息

提示：
1）生成随机数：Math.random()，返回值类型double；
2）四舍五入取整，Math.round（double d),返回类型long
 */
public class ProjectThree {
    public static void main(String[] args) {
        Student[] stu1 = new Student[20];

        for (int i=0;i<stu1.length;i++){
            stu1[i] = new Student();  // 没写这一步，空指针了
            stu1[i].number = i+1;
            stu1[i].state = (int) (Math.random()*6+1);
            stu1[i].score = (int)(Math.random()*100);
        }

//        问题一：
        for (int i=0;i<stu1.length;i++){
            if (stu1[i].state == 3){
                stu1[i].print();
            }
        }

//        问题二：
        for (int j=0;j<stu1.length;j++){
//            不想写了
        }

    }

}

class Student{
    int number;
    int state;
    int score;

    void print(){
        System.out.println("学生:"+number+" 的年级是："+state+"，成绩为："+score);
    }
}
