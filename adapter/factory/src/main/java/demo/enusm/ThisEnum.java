package demo.enusm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

/**
 * @author ：林雾
 * @date ：2020/06/09
 * @description :
 */
@Getter
@AllArgsConstructor
public enum ThisEnum {
    YX_MOUSE("YX_MOUSE", "有线鼠标", "10"),
    WX_MOUSE("WX_MOUSE", "无线鼠标", "10"),

    JX_KEYBOARD("JX_KEYBOARD", "机械键盘", "200"),
    PT_KEYBOARD("PT_KEYBOARD", "普通键盘", "100"),

    ;

    private String type;
    private String desc;
    private String price;

}
