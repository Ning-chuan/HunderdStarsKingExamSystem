package test;

import view.LoginFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {
    public static void main(String[] args){
            new LoginFrame("荣耀之路");
//        JFrame frame = new JFrame("登录");//窗体
//        JPanel mainPanel = new JPanel();//面板
//        JLabel tileLabel = new JLabel("百星王者考试系统");
//        JLabel accountLabel = new JLabel("账号：");
//        JTextField accountField = new JTextField();
//        JLabel passwordLabel = new JLabel("密码：");
//        JPasswordField passwordField = new JPasswordField();
//
//        JButton loginButton = new JButton("登录");
//        JButton exitButton = new JButton("退出");
//
//        //设置每一个组件的位置 大小 字体 布局等等
//        //设置组件的位置----布局管理
//        // 边界式BorderLayout(JFrame) 流式FlowLayout(JPanel)
//        // 网格式GridLayout 自定义(null)
//        //设置panel的布局管理为自定义方式
//        mainPanel.setLayout(null);
//        //设置标题 大小 位置
//        tileLabel.setBounds(150,25,280,35);
//        tileLabel.setFont(new Font("微软雅黑",Font.TRUETYPE_FONT,34));
//        //设置 账号 密码 组件 大小 位置
//        accountLabel.setBounds(100,100,80,25);
//        accountLabel.setFont(new Font("微软雅黑",Font.TRUETYPE_FONT,24));
//        accountField.setBounds(185,100,280,30);
//        accountField.setFont(new Font("微软雅黑",Font.TRUETYPE_FONT,24));
//        //accountField.setBackground(Color.pink);
//        passwordLabel.setBounds(100,165,80,25);
//        passwordLabel.setFont(new Font("微软雅黑",Font.TRUETYPE_FONT,24));
//        passwordField.setBounds(185,165,280,30);
//        passwordField.setFont(new Font("微软雅黑",Font.TRUETYPE_FONT,24));
//        //passwordField.setBackground(Color.pink);
//        //设置登录和退出按钮的位置 大小
//        loginButton.setBounds(160,235,100,30);
//        loginButton.setFont(new Font("微软雅黑",Font.TRUETYPE_FONT,24));
//
//        exitButton.setBounds(330,235,100,30);
//        exitButton.setFont(new Font("微软雅黑",Font.TRUETYPE_FONT,24));
//
//        mainPanel.add(tileLabel);
//        mainPanel.add(accountLabel);
//        mainPanel.add(accountField);
//        mainPanel.add(passwordLabel);
//        mainPanel.add(passwordField);
//        mainPanel.add(loginButton);
//        mainPanel.add(exitButton);
//
//
//        frame.add(mainPanel);
//
//
//        frame.setBounds(680,330,580,360);
//        //frame.setResizable(false);
//        frame.setVisible(true);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//
//
//        //绑定事件监听器
//        //  构造方法私有的  构造方法公有的但是没有无参数的  抽象类或接口
//        ActionListener listener = new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                //获取用户输入的账号和密码
//                String account = accountField.getText();
//                String password = new String(passwordField.getPassword());
//                System.out.println(account+"--"+password);
//            }
//        };
//
//        loginButton.addActionListener(listener);
    }
}
