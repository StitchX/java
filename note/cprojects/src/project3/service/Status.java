package project3.service;
// 步骤六: 枚举
public class Status {
    private final String NAME;
    private Status(String name){
        this.NAME = name;
    }

    public String getNAME() {
        return NAME;
    }

    public static final Status FREE = new Status("FREE");
    public static final Status BUSY = new Status("BUSY");
    public static final Status VOCATION = new Status("VOCATION");

    @Override
    public String toString() {
        return NAME ;
    }
}
