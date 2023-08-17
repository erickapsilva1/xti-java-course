package br.com.xti.refined;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NestedClass extends JFrame {

    JButton jButton;

    public NestedClass(){
        super("Nested");

        jButton = new JButton("OK");
        jButton.addActionListener(new NestedListener());
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Anonymous class runs " + jButton.getText());
            }
        });

        getContentPane().add(jButton);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
    }

    public class NestedListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Nested class runs " + jButton.getText());
        }
    }

    public static void main(String[] args) {
        NestedClass window = new NestedClass();

        NestedClass.NestedListener listener = window.new NestedListener();
    }
}
