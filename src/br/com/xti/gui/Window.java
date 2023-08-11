package br.com.xti.gui;

import javax.swing.*;

public class Window extends JFrame {

    public Window(){

        super("My Window");

        JButton button = new JButton("Click");

        getContentPane().add(button);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {

        new Window();

    }
}
