package demo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：林雾
 * @date ：2019/09/25
 * @description :
 */
public class StrategyFactory {
    private static Map<Integer, Strategy> map = new HashMap<>();

    static {
        map.put(1,new Strategy1());
        map.put(2,new Strategy2());
    }

    public void execute(Integer type){
        Strategy strategy = map.get(type);
        if(strategy!=null){
            strategy.execute();
        }
    }
}
