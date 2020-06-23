package expression;

/**
 * @author ：林雾
 * @date ：2020/06/23
 * @description :
 */
public class GtEq extends AbstractExpression {
  @Override
  public boolean isMatch(int userBuyCount) {
    return userBuyCount >= min && userBuyCount <= max;
  }

  @Override
  public String desc() {
    return "小于等于";
  }

  @Override
  public String value() {
    return "<=";
  }

  @Override
  public String display() {
    return String.format("%s %s %s", min, value(), max);
  }
}
