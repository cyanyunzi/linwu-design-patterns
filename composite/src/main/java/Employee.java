import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：林雾
 * @date ：2020/06/16
 * @description :
 */
@Slf4j
@Data
public class Employee {
    private String title;
    private int salary;
    private List<Employee> list = new ArrayList<>();

    public boolean hasNext() {
        return list.size() > 0;
    }

    public void iterList() {
        log.info("Employee => title:[{}] salary:[{}]", this.getTitle(), this.getSalary());

        for (Employee employee : list) {
            if (employee.hasNext()) {
                employee.iterList();
            }else{
                log.info("Employee => title:[{}] salary:[{}]", employee.getTitle(), employee.getSalary());
            }
        }
    }


    public static Employee create(String title, int salary) {
        Employee employee = new Employee();
        employee.setTitle(title);
        employee.setSalary(salary);
        return employee;
    }
}
