package LoginandReg;

import javax.swing.*;

public class LoginPage {
    JFrame f;
    LoginPage(){
        f = new JFrame();
        JLabel Heading= new JLabel("Login Page");




        f.setBounds(0,0,800,600);
        f.setLayout(null);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new LoginPage();
    }
}
