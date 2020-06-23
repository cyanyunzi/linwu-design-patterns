package demo.factory;

import demo.product.JxKeyboardProduct;
import demo.product.Product;
import demo.product.PtKeyboardProduct;
import demo.enusm.ThisEnum;

/**
 * @author ：林雾
 * @date ：2020/06/09
 * @description :
 */
public class KeyboardFactory extends AbstractFactory {

    @Override
    public Product getProduct(String type) {
        ThisEnum thisEnum = ThisEnum.valueOf(type);

        if (ThisEnum.JX_KEYBOARD.equals(thisEnum)) {
            return new JxKeyboardProduct();
        } else if (ThisEnum.PT_KEYBOARD.equals(thisEnum)) {
            return new PtKeyboardProduct();
        }

        throw new IllegalArgumentException("未知键盘类型");
    }


}
