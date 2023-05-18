package quizapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener{

    //String name;
    JButton back;
    
    About() {
        //this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel rules = new JLabel();
        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("Photos/user_icon_149329.png"));
        JLabel img1 = new JLabel(i2);
        img1.setBounds(200,80,400,410);
        add(img1);
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText("<html>"
                + "<b> Developers </b> <br>"
                + "<p> SOHAN MOHANTY </p>"
                + "<p>sohan2213.mnty@gmail.com</p>"
                + "</html>");
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back) {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new About();
    }
}