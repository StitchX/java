package shangguigu.foundation.pdpp.father;

public class Son extends Father {
    Son(){
        super.age = 18;
        super.name = "jiujiu";
//        super.id =
        super.setId("12eewd");

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
        super.walking(); //

    }
}
