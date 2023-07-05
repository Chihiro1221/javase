package com.test.study.Swing;

import javax.swing.*;
import java.awt.*;

public class DrawCircle extends JFrame {
    public MyPanel mp = null;

    public static void main(String[] args) {
        new DrawCircle();
    }

    public DrawCircle() {
        // 创建面板
        mp = new MyPanel();
        // 将面板添加到窗口
        this.add(mp);
        // 设置窗口大小
        this.setSize(600, 500);
        // 窗口关闭程序退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 显示
        this.setVisible(true);
    }
}

class MyPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);// 初始化
//        System.out.println("paint 被调用了...");
//        g.drawOval(10,10,50,50);
        g.setColor(new Color(136, 217, 226));
//        g.drawLine(10,10,100,100);
//        g.drawRect(10,10,200,200);
//       g.fillRect(10,10,200,200);
//        Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/food.jpeg"));
//        g.drawImage(image, 10, 10, this);
        g.fillRect(100,100,10,50);

        g.fillRect(130,100,10,50);

        g.fillRect(110,110,20,30);

        g.setColor(Color.RED);

        g.fillOval(115,120,10,10);

        g.fillRect(120,100,2,20);
    }
}
