package quizapp;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener{
    JButton btn1,btn2,btn3;
    JTextField fname;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        getContentPane().
        setLayout(null);
        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("Photos/down.png"));
        JLabel img1 = new JLabel(i2);
        img1.setBounds(40,40,80,90);
        add(img1);
        JLabel wrt = new JLabel("S");
        wrt.setBounds(360, 125, 520,110);
        wrt.setFont(new Font("Verdana",Font.ITALIC,130));
        wrt.setForeground(new Color(30,160,221));
        add(wrt);
        JLabel wrt1 = new JLabel("ip");
        wrt1.setBounds(443, 170, 520,83);
        wrt1.setFont(new Font("Verdana",Font.ITALIC,50));
        wrt1.setForeground(new Color(30,160,221));
        add(wrt1);
        JLabel wrt3 = new JLabel("S");
        wrt3.setBounds(660, 125, 520,110);
        wrt3.setFont(new Font("Verdana",Font.ITALIC,130));
        wrt3.setForeground(new Color(30,160,221));
        add(wrt3);
        JLabel wrt4 = new JLabel("olve");
        wrt4.setBounds(743, 170, 520,83);
        wrt4.setFont(new Font("Verdana",Font.ITALIC,50));
        wrt4.setForeground(new Color(30,160,221));
        add(wrt4);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Photos/Quiz_1.png"));
        JLabel img = new JLabel(i1);
        img.setBounds(0,-20,1150,500);
        add(img);
        JLabel wrt5 = new JLabel("Enter Your Name");
        wrt5.setBounds(445, 380, 520,83);
        wrt5.setFont(new Font("Verdana",Font.ITALIC,30));
        wrt5.setForeground(new Color(30,160,221));
        add(wrt5);
        fname  = new JTextField();
        fname.setBounds(425, 460, 300, 30);
        fname.setFont(new Font("Times New Roman", Font.PLAIN,20));
        add(fname);
        btn1 = new JButton("Start");
        btn2 = new JButton("About");
        btn3 = new JButton("Back");
        btn1.setBounds(425,500,130,30);
        btn1.addActionListener(this);
        btn2.setBounds(594,500,130,30);
        btn2.addActionListener(this);
        btn3.setBounds(510,550,130,30);
        btn3.addActionListener(this);
        add(btn1);
        add(btn2);
        add(btn3);
        setSize(1200, 700);
        setLocation(180, 50);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent sr){
        if(sr.getSource()==btn1){
            String name  = fname.getText();
            setVisible(false);
            new Quiz(name);
        }
        else if(sr.getSource()==btn2){
            new About();
        }
        else if(sr.getSource()==btn3){
            setVisible(false);
        }
    }
        
    public static void main(String args[]){
        new Login();
    }
}
