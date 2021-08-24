package LoginandReg;

import javax.swing.*;
import java.awt.*;

public class LoginPage {
    JFrame f;
    Font font1,font2,font3;
    JPanel p;
    ImageIcon image;

    LoginPage(){
        font1 = new Font("Cambria",Font.BOLD,50);
        font2 = new Font("Californian FB",Font.PLAIN,20);
        f = new JFrame("Login Page");

        //Panel
        p = new JPanel();
        p.setBounds(0,0,800,600);

        JLabel background;
        image = new ImageIcon("resource/background.jpg");
        background = new JLabel("",image,JLabel.CENTER);
        background.setBounds(0,0,800,600);
        p.add(background);
        p.setLayout(null);
        p.setVisible(true);
        f.add(p);

        JLabel Heading= new JLabel("Login Credential");
        Heading.setBounds(200,20,600,60);
        Heading.setFont(font1);
        p.add(Heading);









        f.setBounds(0,0,800,600);
        f.setLayout(null);
        f.setVisible(true);



    }

    public static void main(String[] args) {
        new LoginPage();
    }
}
