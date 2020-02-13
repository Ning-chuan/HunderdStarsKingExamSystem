package view;

import service.UserService;
import util.BaseFrame;
import util.MySpring;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends BaseFrame {
    public LoginFrame(){
        this.init();
    }
    public LoginFrame(String title){
        super(title);
        this.init();
    }


    private JPanel mainPanel = new JPanel();//面板
    private JLabel tileLabel = new JLabel("百星王者考试系统");
    private JLabel accountLabel = new JLabel("账号：");
    private JTextField accountField = new JTextField();
    private JLabel passwordLabel = new JLabel("密码：");
    private JPasswordField passwordField = new JPasswordField();

    private JButton loginButton = new JButton("登录");
    private JButton exitButton = new JButton("退出");
    @Override
    protected void setFontAndSoOn() {
        mainPanel.setLayout(null);
        //设置标题 大小 位置
        tileLabel.setBounds(150,25,280,35);
        tileLabel.setFont(new Font("微软雅黑",Font.TRUETYPE_FONT,34));
        //设置 账号 密码 组件 大小 位置
        accountLabel.setBounds(100,100,80,25);
        accountLabel.setFont(new Font("微软雅黑",Font.TRUETYPE_FONT,24));
        accountField.setBounds(185,100,280,30);
        accountField.setFont(new Font("微软雅黑",Font.TRUETYPE_FONT,24));
        //accountField.setBackground(Color.pink);
        passwordLabel.setBounds(100,165,80,25);
        passwordLabel.setFont(new Font("微软雅黑",Font.TRUETYPE_FONT,24));
        passwordField.setBounds(185,165,280,30);
        passwordField.setFont(new Font("微软雅黑",Font.TRUETYPE_FONT,24));
        //passwordField.setBackground(Color.pink);
        //设置登录和退出按钮的位置 大小
        loginButton.setBounds(160,235,100,30);
        loginButton.setFont(new Font("微软雅黑",Font.TRUETYPE_FONT,24));

        exitButton.setBounds(330,235,100,30);
        exitButton.setFont(new Font("微软雅黑",Font.TRUETYPE_FONT,24));
    }

    @Override
    protected void addElement() {
        mainPanel.add(tileLabel);
        mainPanel.add(accountLabel);
        mainPanel.add(accountField);
        mainPanel.add(passwordLabel);
        mainPanel.add(passwordField);
        mainPanel.add(loginButton);
        mainPanel.add(exitButton);
    }

    @Override
    protected void addListener() {
        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //1.获取用户输入的账号和密码
                //  从登录窗口上的组件内获取   文本框  密码框
                String account = accountField.getText();
                String password = new String(passwordField.getPassword());
                //2.调用之前Service层的登录方法
                UserService service = MySpring.getBean("service.UserService");
                String result = service.login(account,password);
                //3.判定最终的结果
                if(result.equals("登录成功")){
                    LoginFrame.this.setVisible(false);//将登录窗口隐藏
                    //弹出新的考试界面
                    new ExamFrame(account+"的考试页面");
                }else{
                    //弹出一个警告框 告诉登录失败啦
                    JOptionPane.showMessageDialog(LoginFrame.this,result);
                    //设置文本框和密码框的值为空
                    accountField.setText("");
                    passwordField.setText("");
                }
            }
        };
        loginButton.addActionListener(listener);//观察者模式
    }

    @Override
    protected void setFrameSelf() {
        this.add(mainPanel);


        this.setBounds(680,330,580,360);
        //frame.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
