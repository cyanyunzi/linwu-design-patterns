package demo;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author ：林雾
 * @date ：2019/09/03
 * @description :
 * 抽象接口
 */
public interface Document{

  /**存放组件到属性表MAP
   * @param key
   */
  void put(String key,Object part);

  /**从属性表MAP获取组件
   * @param key
   * @return
   */
  Object get(String key);

  /**从属性表MAP获取子组件列表
   * @param key
   * @param <T>
   * @return
   */
  <T> Stream<T> children(String key);
}
