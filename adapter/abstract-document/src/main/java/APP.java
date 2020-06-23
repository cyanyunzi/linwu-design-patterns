import demo.Car;
import demo.HasModel;
import demo.HasParts;
import demo.HasPrice;
import demo.Part;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author ：林雾
 * @date ：2019/09/04
 * @description :
 */
@Slf4j
public class APP {
  private final Logger logger = LoggerFactory.getLogger(APP.class);

  public static void main(String[] args) {
    Car car = new Car();
    car.put(HasModel.MODEL,"car-model");
    car.put(HasPrice.PRICE,new BigDecimal(100));

    Part part1 = new Part();
    part1.put(HasModel.MODEL,"part1-model");
    part1.put(HasPrice.PRICE,new BigDecimal(10));

    Part part2 = new Part();
    part2.put(HasModel.MODEL,"part2-model");
    part2.put(HasPrice.PRICE,new BigDecimal(20));

    car.put(HasParts.PARTS, Arrays.asList(part1,part2));

    log.info("car model-> :{}",car.getModel().get());
    log.info("car price-> :{}",car.getPrice().get());

    Stream<Part> parts = car.getParts();
    parts.forEach(part->{
      log.info("part -------- start --------");
      log.info("part model:{}",part.getModel().get());
      log.info("part price:{}",part.getPrice().get());
      log.info("part -------- end --------");
    });
  }
}
