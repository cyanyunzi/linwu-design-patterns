package demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author ：林雾
 * @date ：2019/09/03
 * @description :
 */
@AllArgsConstructor
@NoArgsConstructor
public class AbstractDocument implements Document {

  /**
   * 组件存放属性表 MAP
   */
  private Map<String, Object> properties = new HashMap<>();

  @Override
  public void put(String key, Object part) {
    properties.put(key, part);
  }

  @Override
  public Object get(String key) {
    return properties.get(key);
  }

  @Override
  public <T> Stream<T> children(String key) {
    //获取属性表中的 主键列表
    Optional<List<T>> any = Stream.of(get(key)).map(el -> (List<T>) el)
        .filter(part -> part != null).findAny();
    return any.isPresent() ? any.get().stream() : Stream.empty();
  }
}
