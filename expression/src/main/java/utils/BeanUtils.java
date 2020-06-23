package utils;

import condition.AndCondition;
import condition.Condition;
import condition.OrCondition;
import expression.AbstractExpression;
import expression.Gt;
import expression.GtEq;
import lombok.extern.slf4j.Slf4j;
import req.WebRequest;

import java.util.*;

/**
 * @author ：林雾
 * @date ：2020/06/23
 * @description :
 */
@Slf4j
public class BeanUtils {
  private static Map<String, Class> conditionMap = new HashMap<>();
  private static Map<String, Class> expressionMap = new HashMap<>();

  public static List<List<WebRequest>> getList() {
    List<List<WebRequest>> list = new ArrayList<>();
    List<WebRequest> webs = new ArrayList<>();

    WebRequest web1 = new WebRequest();
    web1.setMin(1);
    web1.setMax(5);
    web1.setSort(1);
    web1.setCondition("or");
    web1.setExpression("<");
    webs.add(web1);

    WebRequest web2 = new WebRequest();
    web2.setMin(5);
    web2.setMax(10);
    web2.setSort(2);
    web2.setCondition("or");
    web2.setExpression("<");
    webs.add(web2);

    WebRequest web3 = new WebRequest();
    web3.setMin(10);
    web3.setMax(15);
    web3.setSort(3);
    //    web3.setCondition("and");
    web3.setExpression("<");
    webs.add(web3);

    list.add(webs);
    return list;
  }

  public static List<AbstractExpression> toExpression(List<List<WebRequest>> list) {
    List<AbstractExpression> result = new ArrayList<>();
    if (null == list || list.isEmpty()) {
      return result;
    }

    for (List<WebRequest> webs : list) {
      webs.sort(Comparator.comparingInt(req -> req.getSort()));

      Iterator<WebRequest> iterator = webs.iterator();

      AbstractExpression ex = null;
      while (iterator.hasNext()) {
        WebRequest web = iterator.next();
        if (ex == null) {
          ex = findExpression(web.getExpression());
          ex.setMin(web.getMin());
          ex.setMax(web.getMax());
          ex.setSort(web.getSort());
          ex.setNextCondition(findCondition(web.getCondition()));
          result.add(ex);
        } else {
          AbstractExpression nextEx = findExpression(web.getExpression());
          nextEx.setMin(web.getMin());
          nextEx.setMax(web.getMax());
          nextEx.setSort(web.getSort());
          nextEx.setNextCondition(findCondition(web.getCondition()));
          ex.setNextEx(nextEx);
          ex = nextEx;
        }
      }
    }
    return result;
  }

  static {
    initConditionMap();
    initExpressionMap();
  }

  public static void initConditionMap() {
    conditionMap.put("and", AndCondition.class);
    conditionMap.put("or", OrCondition.class);
  }

  public static void initExpressionMap() {
    expressionMap.put("<", Gt.class);
    expressionMap.put("<=", GtEq.class);
  }

  public static Condition findCondition(String condition) {
    if (condition == null || condition.isEmpty()) {
      return null;
    }

    Class clazz = conditionMap.get(condition);

    Condition o = null;
    try {
      o = (Condition) clazz.newInstance();
    } catch (Exception ex) {
      log.error("反射对象出错");
    }
    return o;
  }

  public static AbstractExpression findExpression(String expression) {
    if (expression == null || expression.isEmpty()) {
      throw new IllegalArgumentException("缺少表达式符号");
    }

    Class clazz = expressionMap.get(expression);

    AbstractExpression o = null;
    try {
      o = (AbstractExpression) clazz.newInstance();
    } catch (Exception ex) {
      log.error("反射对象出错");
    }
    return o;
  }
}
