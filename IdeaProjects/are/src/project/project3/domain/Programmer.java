package project.project3.domain;
// 步骤七
import project.project3.service.Status;

public class Programmer extends Employee{
    private int memberId;
    private Equipment equipment;
    private Status status;

    public Programmer(int id, String name, int age, double salary,  Equipment equipment) {
        super(id,name,age,salary);
        this.memberId = memberId;
        this.equipment = equipment;
        this.status = status;
    }
    public Programmer() {
        super();
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
