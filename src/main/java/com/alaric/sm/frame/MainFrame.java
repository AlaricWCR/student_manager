package com.alaric.sm.frame;

import javax.swing.*;

/**
 * @ClassName MainFrame
 * @Description TODO
 * @Author Alaric
 * @Date 2020/11/23
 **/
public class MainFrame extends JFrame {
    private JPanel mainPanel;
    private JButton departmentBtn;
    private JButton classBtn;
    private JButton studentBtn;
    private JButton rewardBtn;

    public MainFrame() {
        this.setTitle("MainFrame");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);
    }

    public static void main (String[] args) {
        new MainFrame();
    }
}
