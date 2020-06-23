package demo.factory;

import demo.product.Product;

/**
 * @author ：林雾
 * @date ：2020/06/09
 * @description :
 */
public abstract class AbstractFactory {
    public abstract Product getProduct(String type);
}
