import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author ：林雾
 * @date ：2020/06/16
 * @description :
 */
@Slf4j
@Data
public class Coffee {
    private Bottle bottle;
    private Seasoning seasoning;

    public static void makeCoffee(Bottle bottle, Seasoning seasoning) {
        log.info("coffee => 容量:[{}] 调料:[{}]", bottle.capacity(), seasoning.desc());
    }
}
