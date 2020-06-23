package condition;

import expression.AbstractExpression;

import java.util.List;

/**
 * @author ：林雾
 * @date ：2020/06/22
 * @description :
 */
public class AndCondition implements Condition {
    @Override
    public String desc() {
        return "并且";
    }

    @Override
    public String value() {
        return "&&";
    }
}
