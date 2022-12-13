package shangguigu.foundation;
// 练习：将对象作为参数传递给方法

public class ProjectFour {

}


class Circle{
    double radius;
    double findArea(){
        return Math.PI*radius*radius;
    }
}

class PassObject{
    void printAreas(Circle c,int time){
        for (int i=1;i<time;i++){
            c.radius = i;
            c.findArea();
        }
    }
}
