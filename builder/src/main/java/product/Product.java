package product;

import Item.Item;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ：林雾
 * @date ：2020/06/10
 * @description :
 */
@Slf4j
@Data
public class Product {
    private List<Item> items = new ArrayList<Item>();


    public void printItems() {
        for (Item item : items) {
            log.info("item=> name:[{}] price:[{}]", item.name(), item.price());
        }
    }

    public BigDecimal getTotalPrice() {
        BigDecimal totalPrice = items.stream().map(it -> it.price()).reduce(BigDecimal::add).orElse(BigDecimal.ZERO);
        log.info("item=> totalPrice:[{}]", totalPrice);
        return totalPrice;
    }

}
