package menjinyan.ui;

import javax.swing.*;

public class RegisterJFrame extends JFrame {
    /*
    以后和注册相关的代码都写在这个界面中
     */
    public RegisterJFrame() {
        this.setSize(488, 500);

        //设置界面的标题
        this.setTitle("拼图注册界面");

        //设置界面置顶
        this.setAlwaysOnTop(true);

        //设置界面居中
        this.setLocationRelativeTo(null);

        //设置游戏的关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //让界面显示出来，建议写在最后
        this.setVisible(true);
    }
}
