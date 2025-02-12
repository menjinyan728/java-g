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
        //初始化界面
        initJFrame();

        //初始化菜单
        initJMenuBar();

        //让界面显示出来，建议写在最后
        this.setVisible(true);

    }

    private void initJMenuBar() {
        //创建整个的菜单对象
        JMenuBar jMenuBar = new JMenuBar();

        //创建菜单上面的两个选项的对象(功能 关于我们)
        JMenu functionJMenuBar = new JMenu("功能");
        JMenu aboutJMennBar = new JMenu("关于我们");

        //创建选项下面的条目对象
        JMenuItem replayItem = new JMenuItem("关于我们");
        JMenuItem reLoginItem = new JMenuItem("重新登录");
        JMenuItem closeItem = new JMenuItem("关闭游戏");

        JMenuItem acountItem = new JMenuItem("公众号");

        //修改每一个选项下面的条目添加到选项当中
        functionJMenuBar.add(replayItem);
        functionJMenuBar.add(reLoginItem);
        functionJMenuBar.add(closeItem);

        //将公众号添加到关于我们的里面
        aboutJMennBar.add(acountItem);

        //将菜单里面的两个选项添加到菜单当中
        jMenuBar.add(functionJMenuBar);
        jMenuBar.add(aboutJMennBar);

        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        //设置界面的宽高
        this.setSize(603, 688);

        //设置界面的标题
        this.setTitle("拼图单机版v1.0");

        //设置界面置顶
        this.setAlwaysOnTop(true);

        //设置界面居中
        this.setLocationRelativeTo(null);

        //设置游戏的关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
