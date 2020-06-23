import lombok.Data;

/**
 * @author ：林雾
 * @date ：2020/06/17
 * @description :
 */
@Data
public class LeaderChain extends AbsChain {
    @Override
    public void audit() {
        System.out.println("leader 审核");
    }
}
