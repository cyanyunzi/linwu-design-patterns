package demo.product;

import demo.enusm.ThisEnum;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * @author ：林雾
 * @date ：2020/06/09
 * @description :
 */
@ToString
public class WxMouseProduct implements MouseProduct {
    public String name() {
        return ThisEnum.WX_MOUSE.getDesc();
    }

    public BigDecimal price() {
        return new BigDecimal(ThisEnum.WX_MOUSE.getPrice());
    }
}
