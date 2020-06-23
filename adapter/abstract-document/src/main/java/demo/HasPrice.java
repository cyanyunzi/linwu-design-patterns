package demo;

import java.math.BigDecimal;
import java.util.Optional;

/**
 * @author ：林雾
 * @date ：2019/09/03
 * @description :
 */
public interface HasPrice extends Document{
  String PRICE = "PRICE";

  default Optional<BigDecimal> getPrice(){
    return Optional.ofNullable((BigDecimal) get(PRICE));
  }
}
