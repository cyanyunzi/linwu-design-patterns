package Item;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author ：林雾
 * @date ：2020/06/10
 * @description :
 */
public class Item2 implements Item {
    @Override
    public String name() {
        return "组件2";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal("2");
    }
}
