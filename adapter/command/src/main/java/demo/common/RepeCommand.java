package demo.common;

import lombok.extern.slf4j.Slf4j;

/**
 * @author ：林雾
 * @date ：2019/09/12
 * @description :
 */
@Slf4j
public class RepeCommand implements Command {
  private Receiver receiver = new RepeReceiver();

  public void execute() {
    log.info("重复命令...");
    receiver.action();
  }
}
