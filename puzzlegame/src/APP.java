import menjinyan.ui.GameJFrame;
import menjinyan.ui.LoginJFrame;
import menjinyan.ui.RegisterJFrame;

import javax.swing.*;

public class APP {
    public static void main(String[] args) {
        /*
        表示程序的启动入口
        如果我们想要开启一个界面，就创建谁的对象就可以了
         */
        new LoginJFrame();
        new RegisterJFrame();
        new GameJFrame();
    }
}
