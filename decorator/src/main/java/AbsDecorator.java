import lombok.Data;

/**
 * @author ：林雾
 * @date ：2020/06/16
 * @description :
 */
@Data
public abstract class AbsDecorator implements Component {
    private Component component;

    public void desc() {
        this.befor();
        component.desc();
        this.after();
    }

    public abstract void befor();

    public abstract void after();
}
