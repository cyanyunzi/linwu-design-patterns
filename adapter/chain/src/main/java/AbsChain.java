import lombok.Data;

/**
 * @author ：林雾
 * @date ：2020/06/17
 * @description :
 */
@Data
public abstract class AbsChain {
    private AbsChain prev;
    private AbsChain next;
    private String currentLevel;

    public void execute(String currentLevel) {
        if (currentLevel.equals(currentLevel)) {
            this.audit();
        } else {
            next.execute(currentLevel);
        }
    }

    public abstract void audit();
}
