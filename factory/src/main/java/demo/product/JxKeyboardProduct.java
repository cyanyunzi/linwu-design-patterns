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
public class JxKeyboardProduct implements KeyBoardProduct {
    public String name() {
        return ThisEnum.JX_KEYBOARD.getDesc();
    }

    public BigDecimal price() {
        return new BigDecimal(ThisEnum.JX_KEYBOARD.getPrice());
    }
}
