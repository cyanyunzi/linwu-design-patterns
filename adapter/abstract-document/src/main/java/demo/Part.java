package demo;

import java.util.Map;

/**
 * @author ：林雾
 * @date ：2019/09/03
 * @description :
 */
public class Part extends AbstractDocument implements HasModel,HasPrice{
  public Part() {
    super();
  }

  public Part(Map<String, Object> properties) {
    super(properties);
  }
}
