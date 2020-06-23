/**
 * @author ：林雾
 * @date ：2020/06/16
 * @description :
 */
public class APP {
    public static void main(String[] args) {
        Component c1 = new Component1();
        Component c2 = new Component2();

        AbsDecorator decorator1 = new ConcreateDecorator1();
        decorator1.setComponent(c1);
        decorator1.desc();

        decorator1.setComponent(c2);
        decorator1.desc();

        AbsDecorator decorator2 = new ConcreateDecorator2();
        decorator2.setComponent(c1);
        decorator2.desc();

        decorator2.setComponent(c2);
        decorator2.desc();
    }
}
