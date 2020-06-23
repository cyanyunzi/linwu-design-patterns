package demo.common;

import lombok.extern.slf4j.Slf4j;

/**
 * @author ：林雾
 * @date ：2019/09/12
 * @description :
 */
@Slf4j
public class StopCommand implements Command {
  private Receiver receiver = new StopReceiver();

  public void execute() {
    log.info("停止命令...");
    receiver.action();
  }
}
