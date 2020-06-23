package demo.common;

import lombok.extern.slf4j.Slf4j;

/**
 * @author ：林雾
 * @date ：2019/09/12
 * @description :
 */
@Slf4j
public class StartCommand implements Command {
  private Receiver receiver = new StartReceiver();

  public void execute() {
    log.info("开始命令...");
    receiver.action();
  }
}
