package req;

import lombok.Data;

/**
 * @author ：林雾
 * @date ：2020/06/23
 * @description :
 */
@Data
public class WebRequest {
  private int min, max;
  private int sort;
  private String condition;
  protected String expression;
}
