import demo.StrategyFactory;

/**
 * @author ：林雾
 * @date ：2019/09/25
 * @description :
 */
public class APP {
    public static void main(String[] args) {
        StrategyFactory factory = new StrategyFactory();
        factory.execute(1);
        factory.execute(2);
    }
}
