package menjinyan.ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    /*
    loginJFrame 表示的是登录界面
    以后再有和登录界面相关的代码，都写在这里
     */

    public LoginJFrame() {
        /*
        在创建登录界面的时候，同时给这个界面去设置一些信息
        比如:宽高，直接展示出来
         */
        this.setSize(488, 430);

        //设置界面的标题
        this.setTitle("拼图登录界面");

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
