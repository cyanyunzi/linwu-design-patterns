package demo.common;

/**
 * @author ：林雾
 * @date ：2019/09/20
 * @description :
 */
public class CommandInvoke {
  public void invoke(Command command){
    command.execute();
  }
}
