package shangguigu.foundation.pdpp.son;

import shangguigu.foundation.pdpp.father.Father;

public class Son extends Father {
    Son(){

    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("子类 吃");
    }

    @Override
    protected void reading() {
        super.reading();
        System.out.println("子类 读");
    }

    private void working(){
//        return super.working();  // 无法调用，覆盖
    }
    void walking(){
//        super.walking(); // 无法调用，覆盖

    }
}
