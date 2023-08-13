package br.com.xti.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckControl extends JFrame {
    JTextField text;
    JCheckBox bold;
    JCheckBox italic;

    public CheckControl(){
        super();

        text = new JTextField("Text Sample", 12);
        text.setFont(new Font("Serif", Font.PLAIN, 26));

        bold = new JCheckBox("Bold");
        italic = new JCheckBox("Italic");

        bold.addItemListener(new CheckBoxListener());
        italic.addItemListener(new CheckBoxListener());

        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        container.add(text);
        container.add(bold);
        container.add(italic);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setVisible(true);

    }

    class CheckBoxListener implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent e) {
            if(bold.isSelected() && italic.isSelected()){
                text.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 26));
            } else if (bold.isSelected()) {
                text.setFont(new Font("Serif", Font.BOLD, 26));
            } else if (italic.isSelected()) {
                text.setFont(new Font("Serif", Font.ITALIC, 26));
            } else {
                text.setFont(new Font("Serif", Font.PLAIN, 26));
            }
        }
    }

    public static void main(String[] args) {
        new CheckControl();
    }
}
