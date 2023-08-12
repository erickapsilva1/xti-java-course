package br.com.xti.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlTest extends JFrame implements ActionListener {

    JButton ok, cancel;
    JTextField login;
    JPasswordField password;

    public ControlTest(){
        super("Texts and Passwords");

        ok = new JButton("Ok");
        cancel = new JButton("Cancel");
        login = new JTextField();
        password = new JPasswordField();

        cancel.addActionListener(new ButtonCancelListener());
        ok.addActionListener(new ButtonOkListener());

        Container container = getContentPane();
        container.setLayout(new GridLayout(3,2));
        container.add(new JLabel("Login: "));
        container.add(login);
        container.add(new JLabel("Password: "));
        container.add(password);
        container.add(ok);
        container.add(cancel);

        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new ControlTest();
    }

    class ButtonOkListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String s = "login: " + login.getText()
                    + "\npassword: " + new String(password.getPassword());
            JOptionPane.showMessageDialog(null, s);
        }
    }

    class ButtonCancelListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            login.setText("");
            password.setText("");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
