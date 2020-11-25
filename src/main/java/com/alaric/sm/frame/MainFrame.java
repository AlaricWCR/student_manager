package com.alaric.sm.frame;

import com.alaric.sm.entity.Department;
import com.alaric.sm.factory.ServiceFactory;

import javax.swing.*;
import java.awt.*;
import java.util.List;

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

    private void showDepartments() {
        //移除原有数据
        departmentPanel.removeAll();
        //从service层获取到所有院系西列表
        List<Department> departmentList = ServiceFactory.getDepartmentServiceInstance().selectAll();
        //获取总数
        int len = departmentList.size();
        //根据院系总数算出行数 （每行放4个）
        int row = len % 4 == 0 ? len / 4 : len / 4 + 1;
        //创建一个网络布局，每行4列，指定水平和垂直间距
        GridLayout gridLayout = new GridLayout(row , 4, 15, 15);
        departmentPanel.setLayout(gridLayout);
        for (Department department : departmentList) {
            //给每个院系对象创建一个面板
            JPanel depPanel = new JPanel();
            //设置合适大小
            depPanel.setPreferredSize(new Dimension(200,200));
            //将原系名称设置给面板标题
            depPanel.setBorder(BorderFactory.createTitledBorder(department.getDepartmentName()));
            //新建一个JLabel标签，用来放置院系logo，并指定大小
            JLabel logoLabel = new JLabel("<htme><img src='" + department.getLogo() + "'width = 200 height = 200/></html>");
            //图标标签加入院系内容面板
            depPanel.add(logoLabel);
            //院系面板加入主题内容面板
            departmentPanel.add(depPanel);
            //刷新主题内容面板
            departmentPanel.revalidate();
        }
    }


}
