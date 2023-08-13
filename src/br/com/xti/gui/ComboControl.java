package br.com.xti.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Objects;

public class ComboControl extends JFrame implements ItemListener {

    JComboBox<String> combo;
    JLabel label;
    ImageIcon[] imageIcons = {
            new ImageIcon(Objects.requireNonNull(getClass().getResource("pics/java1.png"))),
            new ImageIcon(Objects.requireNonNull(getClass().getResource("pics/java2.png"))),
            new ImageIcon(Objects.requireNonNull(getClass().getResource("pics/java3.png"))),
            new ImageIcon(Objects.requireNonNull(getClass().getResource("pics/java4.png")))
    };

    public ComboControl(){
        super("Photo Album");

        Container container = getContentPane();

        combo = new JComboBox<String>();
        combo.setFont(new Font("Serif", Font.PLAIN, 26));
        combo.addItem("Java 1");
        combo.addItem("Java 2");
        combo.addItem("Java 3");
        combo.addItem("Java 4");
        combo.addItemListener(this);

        label = new JLabel(imageIcons[0]);

        container.add(BorderLayout.NORTH, combo);
        container.add(BorderLayout.CENTER, label);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new ComboControl();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getStateChange() == ItemEvent.SELECTED){
            label.setIcon(imageIcons[combo.getSelectedIndex()]);
        }
    }
}
