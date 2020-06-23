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
public class YxMouseProduct implements MouseProduct {
    public String name() {
        return ThisEnum.YX_MOUSE.getDesc();
    }

    public BigDecimal price() {
        return new BigDecimal(ThisEnum.YX_MOUSE.getPrice());
    }
}
