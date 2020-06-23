package builder;

import Item.Item;
import Item.Item1;
import Item.Item2;
import product.Product;

/**
 * @author ：林雾
 * @date ：2020/06/10
 * @description :
 */
public class ProductBuilder {
    public Product builderProductItem1() {
        Product result = new Product();
        Item item = new Item1();
        result.getItems().add(item);
        return result;
    }

    public Product builderProductItem2() {
        Product result = new Product();
        Item item = new Item2();
        result.getItems().add(item);
        return result;
    }
}
