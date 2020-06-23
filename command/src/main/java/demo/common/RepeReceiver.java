package demo.common;

import lombok.extern.slf4j.Slf4j;

/**
 * @author ：林雾
 * @date ：2019/09/12
 * @description :
 */
@Slf4j
public class RepeReceiver implements Receiver {

  public void action() {
    log.info("重复 接收器...执行");
  }
}
