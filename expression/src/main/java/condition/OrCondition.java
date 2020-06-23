package condition;

/**
 * @author ：林雾
 * @date ：2020/06/22
 * @description :
 */
public class OrCondition implements Condition {

    @Override
    public String desc() {
        return "或者";
    }

    @Override
    public String value() {
        return "||";
    }
}
