package br.com.xti.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Events extends JFrame implements ActionListener {

    JButton button;

    public Events(){
        super("Events");

        button = new JButton("Click me");
        button.addActionListener(this);
        getContentPane().add(button);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Events();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Clicked");
        button.setText("Clicked");
    }
}
