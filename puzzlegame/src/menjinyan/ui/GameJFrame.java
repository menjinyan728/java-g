package menjinyan.ui;

import javax.swing.*;

public class GameJFrame extends JFrame {
    /*
    JFrame 界面；窗体
    子类呢? 也表示界面；窗体
    规定:GameJFrame这个界面表示的是游戏的主界面
    以后游戏相关的所有逻辑都写在这个类中
     */
    public GameJFrame() {
        this.setSize(603, 688);
        this.setVisible(true);

    }
}
