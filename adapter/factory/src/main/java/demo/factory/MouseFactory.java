package demo.factory;

import demo.product.*;
import demo.enusm.ThisEnum;

/**
 * @author ：林雾
 * @date ：2020/06/09
 * @description :
 */
public class MouseFactory extends AbstractFactory {

    @Override
    public Product getProduct(String type) {
        ThisEnum thisEnum = ThisEnum.valueOf(type);

        if (ThisEnum.WX_MOUSE.equals(thisEnum)) {
            return new WxMouseProduct();
        } else if (ThisEnum.YX_MOUSE.equals(thisEnum)) {
            return new YxMouseProduct();
        }

        throw new IllegalArgumentException("未知鼠标类型");
    }


}
