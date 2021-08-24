package LoginandReg;

import javax.swing.*;
import java.awt.*;

public class LoginPage {
    JFrame f;
    Font font1,font2,font3;
    JPanel p;

    LoginPage(){
        f = new JFrame("Login Page");


        p = new JPanel();
        p.setBounds(0,0,800,600);
        p.setBackground(Color.gray);
        p.setLayout(null);
        p.setVisible(true);
        f.add(p);

        font1 = new Font("Cambria",Font.BOLD,50);




        JLabel Heading= new JLabel("Login Credential");
        Heading.setBounds(200,20,600,60);
        Heading.setFont(font1);
        p.add(Heading);

        JLabel UserName = new JLabel("User Name");




        f.setBounds(0,0,800,600);
        f.setLayout(null);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new LoginPage();
    }
}
