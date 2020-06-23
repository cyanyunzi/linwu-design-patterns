package demo.producer;

import demo.factory.AbstractFactory;
import demo.factory.KeyboardFactory;
import demo.factory.MouseFactory;

/**
 * @author ：林雾
 * @date ：2020/06/09
 * @description :
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String factoryType) {
        if ("键盘工厂".equals(factoryType)) {
            return new KeyboardFactory();
        }

        if ("鼠标工厂".equals(factoryType)) {
            return new MouseFactory();
        }
        throw new IllegalArgumentException("未知工厂类型");
    }
}
