package project.project3.junit;

import org.junit.Test;
import project.project3.domain.Employee;
import project.project3.service.NameListService;
import project.project3.service.TeamException;

/**
 * 步骤11 NameListService写完遍历元素之后
 * @author Eva   Email:
 * @Description 对NameListService类进行测试
 * @data 2023/1/5 11:09
 */
public class NameListServiceTest {

    @Test
    public void testGetAllEmployee(){
        NameListService service = new NameListService();
        Employee[] employees = service.getAllEmployees();
        for (int i=0;i<employees.length;i++){
            System.out.println(employees[i]);
        }
    }
    @Test
    public void testGetEmployee() throws TeamException {
        NameListService service = new NameListService();
        int id = 27;
        try {
            Employee employee = service.getEmployee(id);
            System.out.println(employee);
        }catch (TeamException e){
            System.out.println(e.getMessage());
        }

    }
}
