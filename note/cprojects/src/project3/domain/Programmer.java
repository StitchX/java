package project3.domain;
// 步骤七
import project3.service.Status;

public class Programmer extends Employee{
    private int memberId; // 开发团队中的id
    private Equipment equipment;
    private Status status = Status.FREE;

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id,name,age,salary);
        this.equipment = equipment;
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

    @Override
    public String toString() {
        return getDetail()+"\t\t"+"程序员" +
                "\t" + status + " \t\t\t\t\t\t" +equipment.getDescription();
    }

    public String getDetailsForTeam(){
        return memberId +"/"+getId()+" \t"+getName()+" \t"+getAge()+" \t\t"+getSalary()+"\t\t"+"程序员";
    }
}
