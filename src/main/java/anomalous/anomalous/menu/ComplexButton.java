package anomalous.anomalous.menu;


/**
 * 父按钮
 * @author zhoumin
 * @create 2018-07-11 15:24
 */
public class ComplexButton extends BasicButton {
    private BasicButton[] sub_button;

    public BasicButton[] getSub_button() {
        return sub_button;
    }

    public void setSub_button(BasicButton[] sub_button) {
        this.sub_button = sub_button;
    }
}
