package anomalous.anomalous.menu;

import jdk.nashorn.internal.objects.annotations.Getter;

/**
 * 菜单
 * @author zhoumin
 * @create 2018-07-11 15:22
 */
public class Menu {
    private BasicButton[] button;

    public BasicButton[] getButton() {
        return button;
    }

    public void setButton(BasicButton[] button) {
        this.button = button;
    }
}
