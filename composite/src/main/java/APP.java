import java.util.List;

/**
 * @author ：林雾
 * @date ：2020/06/16
 * @description :
 */
public class APP {
    public static void main(String[] args) {
        Employee coder1 = Employee.create("Coder1", 100);
        Employee coder2 = Employee.create("Coder2", 200);
        Employee coder3 = Employee.create("Coder3", 300);

        Employee manager1 = Employee.create("manager1", 1000);
        manager1.getList().add(coder1);

        Employee manager2 = Employee.create("manager2", 2000);
        manager2.getList().add(coder2);

        Employee manager3 = Employee.create("manager3", 3000);
        manager3.getList().add(coder3);

        Employee ceo = Employee.create("CEO", 10000);
        ceo.getList().add(manager1);
        ceo.getList().add(manager2);
        ceo.getList().add(manager3);

        ceo.iterList();
    }

}
