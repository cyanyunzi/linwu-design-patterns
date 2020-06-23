package expression;

import condition.AndCondition;
import condition.Condition;
import condition.OrCondition;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ：林雾
 * @date ：2020/06/23
 * @description :
 */
@Data
public abstract class AbstractExpression {
  /** 数值 */
  protected int min, max;

  /** 表达式所处排序 */
  protected int sort;

  /** 与下一表达式连接条件 */
  protected Condition nextCondition;

  /** 下一表达式 */
  protected AbstractExpression nextEx;

  /**
   * 当前表达式是否匹配
   *
   * @return
   */
  public void checkMinMax() {
    if (min > max) {
      String msg = String.format("min:%s max:%s min>max", min, max);
      throw new IllegalArgumentException(msg);
    }
  }

  public abstract boolean isMatch(int userBuyCount);

  public abstract String desc();

  public abstract String value();

  public abstract String display();

  public void printAll() {
    List<String> list = new ArrayList<>();
    showDisplay(list);
    String collect = list.stream().collect(Collectors.joining());
    System.out.println(collect);
  }

  public void showDisplay(List<String> list) {
    list.add(display());
    if(nextCondition!=null){
      list.add(nextCondition.value());

      if(nextEx!=null){
        nextEx.showDisplay(list);
      }
    }
  }

  public boolean isAllMatch(int userBuyCount) {
    checkMinMax();

    boolean currentMatch = isMatch(userBuyCount);

    // 是否有连接下一个表达式
    if (nextCondition == null) {
      return currentMatch;
    }

    if (nextCondition instanceof AndCondition) {
      // 与的关系,继续判断下一条件
      checkNextEx();

      boolean nextMatch = nextEx.isAllMatch(userBuyCount);
      return nextMatch && currentMatch;
    }

    if (nextCondition instanceof OrCondition) {
      // 或的关系,继续判断下一条件
      checkNextEx();

      boolean nextMatch = nextEx.isAllMatch(userBuyCount);
      return nextMatch || currentMatch;
    }

    return false;
  }

  public void checkNextEx() {
    if (nextEx == null) {
      String msg = String.format("表达式有连接对象:%s,但是没有下一个表达式", nextCondition.value());
      throw new IllegalArgumentException(msg);
    }
  }
}
