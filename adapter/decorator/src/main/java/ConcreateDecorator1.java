/**
 * @author ：林雾
 * @date ：2020/06/16
 * @description :
 */
public class ConcreateDecorator1 extends AbsDecorator {
    @Override
    public void befor() {
        System.out.println("ConcreateDecorator1 befor");
    }

    @Override
    public void after() {
        System.out.println("ConcreateDecorator1 after");

    }
}
