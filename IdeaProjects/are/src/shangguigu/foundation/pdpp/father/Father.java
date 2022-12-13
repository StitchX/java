package shangguigu.foundation.pdpp.father;

public class Father {
    public String name;
    private String id;
    int age;

    protected double height;

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }

    public Father(){

    }
    public Father(String name,int age, String id){
        this.age = age;
        this.name = name;
        this.id = id;
    }
    public void eat(){
        System.out.println("公有，吃");
    }
    protected void reading(){
        System.out.println("保护，读书");
    }
    private void working(){
        System.out.println("私有，工作");
    }
    void walking(){
        System.out.println("缺省，走路");
    }

}
