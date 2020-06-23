/**
 * @author ：林雾
 * @date ：2020/06/15
 * @description :
 */
public class FlyPig implements Pig, Fly {
    public void eat() {
        System.out.println("fly pig eat");
    }

    public void sleep() {
        System.out.println("适配行为");
        action();
        System.out.println("fly pig sleep");

    }

    public void action() {
        System.out.println("fly");
    }
}
