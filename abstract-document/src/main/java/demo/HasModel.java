package demo;

import java.math.BigDecimal;
import java.util.Optional;

/**
 * @author ：林雾
 * @date ：2019/09/03
 * @description :
 */
public interface HasModel extends Document{
  String MODEL = "model";

  default Optional<String> getModel(){
    return Optional.ofNullable((String) get(MODEL));
  }
}
