package project.project3.service;
// 步骤10

import project.project3.domain.Employee;


/**
 * @Description 负责将Data中的数据封装到Employee[]
 * @author Eva   Email:
 * @version v1.0
 * @data 2023/1/4 16:05
 */
public class NameListService {
    private Employee[] employees;

    /**
     * 给employee及数组元素进行初始化。
     */
    public NameListService(){
        /*
        1. 根据项目提供的Data类构建相应大小的employee数组
        2. 再根据Data类中的数据构建不同的对象，包括Employee、Programmer、Desginer和
            Architect对象，以及相关联的Equipment子类的对象
        3. 将对象存于数组中
         */
        employees = new Employee[Data.EMPLOYEES.length];
    }

    public Employee[] getAllEmployees(){
        return null;
    }
//    public Employee getAllEmployees(int id) throws TeamException{
//        return null;
//    }
}
