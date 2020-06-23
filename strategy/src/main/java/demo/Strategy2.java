package demo;

import lombok.extern.slf4j.Slf4j;

/**
 * @author ：林雾
 * @date ：2019/09/25
 * @description :
 */
@Slf4j
public class Strategy2 implements Strategy {
    @Override
    public void execute() {
        log.info("Strategy2");
    }
}
