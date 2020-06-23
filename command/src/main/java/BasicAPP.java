import demo.common.Command;
import demo.common.CommandInvoke;
import demo.common.RepeCommand;
import demo.common.StartCommand;
import demo.common.StopCommand;

/**
 * @author ：林雾
 * @date ：2019/09/12
 * @description :
 */
public class BasicAPP {

  public static void main(String[] args) {
    Command startCommand = new StartCommand();
    Command repeCommand = new RepeCommand();
    Command stopCommand = new StopCommand();

    CommandInvoke invoke = new CommandInvoke();
    invoke.invoke(startCommand);
    invoke.invoke(repeCommand);
    invoke.invoke(stopCommand);

  }
}
