import expression.AbstractExpression;
import req.WebRequest;
import utils.BeanUtils;

import java.util.List;

/**
 * @author ：林雾
 * @date ：2020/06/18
 * @description :
 */
public class APP {

  public static void main(String[] args) throws Exception {
    List<List<WebRequest>> list = BeanUtils.getList();
    List<AbstractExpression> expressions = BeanUtils.toExpression(list);

    for (AbstractExpression ex : expressions) {
      ex.printAll();
      System.out.println(ex.isAllMatch(2));
    }
  }
}
