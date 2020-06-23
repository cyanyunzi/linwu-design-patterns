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
public class PtKeyboardProduct implements KeyBoardProduct {
    public String name() {
        return ThisEnum.PT_KEYBOARD.getDesc();
    }

    public BigDecimal price() {
        return new BigDecimal(ThisEnum.PT_KEYBOARD.getPrice());
    }
}
