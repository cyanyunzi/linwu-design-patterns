package demo;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author ：林雾
 * @date ：2019/09/03
 * @description :
 */
public interface HasParts extends Document{
  String PARTS = "parts";

  /**返回子组件列表
   * @return
   */
  default Stream<Part> getParts(){
    return children(PARTS);
  }
}
