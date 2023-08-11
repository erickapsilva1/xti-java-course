package br.com.xti.gui;

import javax.swing.*;
import java.awt.*;

public class Layouts2 extends JFrame {

    public Layouts2(){
        super("My Layout 2");

        Container container = getContentPane();
        Container container1 = new JPanel();

        container.setLayout(new BorderLayout());

        container1.setLayout(new GridLayout(4,1));
        container1.add(new JButton("Ok"));
        container1.add(new JButton("Cancel"));
        container1.add(new JButton("Setup..."));
        container1.add(new JButton("Help"));

        container.add(BorderLayout.CENTER, new JButton("Center"));
        container.add(BorderLayout.EAST, container1);

/*        container.setLayout(new BorderLayout(5,5));
        container.add(BorderLayout.NORTH, new JButton("N"));
        container.add(BorderLayout.SOUTH, new JButton("S"));
        container.add(BorderLayout.CENTER, new JButton("C"));
        container.add(BorderLayout.EAST, new JButton("E"));
        container.add(BorderLayout.WEST, new JButton("W"));*/

//        container.setLayout(new GridLayout(2, 3)); // lines and columns
//        container.add(new JButton("1"));
//        container.add(new JButton("2"));
//        container.add(new JButton("3"));
//        container.add(new JButton("4"));
//        container.add(new JButton("5"));
//        container.add(new JButton("6"));



        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Layouts2();
    }
}
