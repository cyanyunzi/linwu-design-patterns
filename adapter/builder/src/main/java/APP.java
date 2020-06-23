import builder.ProductBuilder;
import product.Product;

/**
 * @author ：林雾
 * @date ：2020/06/10
 * @description :
 */
public class APP {
    public static void main(String[] args) {
        ProductBuilder builder = new ProductBuilder();

        Product product1 = builder.builderProductItem1();
        product1.getTotalPrice();
        product1.printItems();

        Product product2 = builder.builderProductItem2();
        product2.getTotalPrice();
        product2.printItems();
    }
}
