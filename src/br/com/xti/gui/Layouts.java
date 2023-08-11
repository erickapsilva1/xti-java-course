package br.com.xti.gui;

import javax.swing.*;
import java.awt.*;

public class Layouts extends JFrame {

    public Layouts(){
        super("Layouts");

        Container container = getContentPane();
        //BorderLayout borderLayout = new BorderLayout();
        //container.setLayout(borderLayout);

        /*container.add(BorderLayout.NORTH, new JButton("1"));
        container.add(BorderLayout.SOUTH, new JButton("2"));
        container.add(BorderLayout.CENTER, new JButton("3"));
        container.add(BorderLayout.EAST, new JButton("4"));
        container.add(BorderLayout.WEST, new JButton("5"));*/

        FlowLayout flowLayout = new FlowLayout();
        container.setLayout(flowLayout);

        container.add(new JButton("A"));
        container.add(new JButton("B"));
        container.add(new JButton("C"));
        container.add(new JButton("D"));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Layouts();
    }
}
