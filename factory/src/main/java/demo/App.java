package demo;

import demo.enusm.ThisEnum;
import demo.factory.AbstractFactory;
import demo.producer.FactoryProducer;
import demo.product.Product;
import lombok.extern.slf4j.Slf4j;


/**
 * @author ：林雾
 * @date ：2020/06/09
 * @description :
 */

@Slf4j
public class App {

    public static void main(String[] args) {
        AbstractFactory keyboardFactory = FactoryProducer.getFactory("键盘工厂");

        Product k1 = keyboardFactory.getProduct(ThisEnum.JX_KEYBOARD.getType());
        log.info("name:[{}] price:[{}]",k1.name(),k1.price());

        Product k2 = keyboardFactory.getProduct(ThisEnum.PT_KEYBOARD.getType());
        log.info("name:[{}] price:[{}]",k2.name(),k2.price());


        AbstractFactory mouseFactory = FactoryProducer.getFactory("鼠标工厂");

        Product m1 = mouseFactory.getProduct(ThisEnum.YX_MOUSE.getType());
        log.info("name:[{}] price:[{}]",m1.name(),m1.price());

        Product m2 = mouseFactory.getProduct(ThisEnum.WX_MOUSE.getType());
        log.info("name:[{}] price:[{}]",m2.name(),m2.price());
    }
}
