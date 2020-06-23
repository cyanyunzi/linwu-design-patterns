import java.util.ArrayList;

/**
 * @author ：林雾
 * @date ：2020/06/16
 * @description :
 */
public class APP {
    public static void main(String[] args) {
        Bottle bottle100 = new Bottle100();
        Bottle bottle200 = new Bottle200();

        Seasoning milk = new Milk();
        Seasoning sugar = new Sugar();


        Coffee.makeCoffee(bottle100,milk);
        Coffee.makeCoffee(bottle100,sugar);

        Coffee.makeCoffee(bottle200,milk);
        Coffee.makeCoffee(bottle200,sugar);


    }
}
