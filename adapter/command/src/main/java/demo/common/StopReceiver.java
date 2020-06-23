package demo.common;

import lombok.extern.slf4j.Slf4j;

/**
 * @author ：林雾
 * @date ：2019/09/12
 * @description :
 */
@Slf4j
public class StopReceiver implements Receiver {
  public void action() {
    log.info("停止 接收器...执行");
  }
}
