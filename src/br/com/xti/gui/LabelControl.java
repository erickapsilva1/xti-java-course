package br.com.xti.gui;

import javax.swing.*;
import java.awt.*;

public class LabelControl extends JFrame {

    public LabelControl(){
        super("Label");

        Container container = getContentPane();

        JLabel jLabel = new JLabel("Label Test");
        jLabel.setToolTipText("This is a tool tip");

        Font font = new Font("serif", Font.BOLD | Font.ITALIC, 28);
        JLabel jLabel1 = new JLabel("Fancy Text");
        jLabel1.setFont(font);
        jLabel1.setForeground(Color.ORANGE);

        ImageIcon imageIcon = new ImageIcon(getClass().getResource("pics/light-bulb.png"));
        JLabel picture = new JLabel(imageIcon);

        container.setLayout(new FlowLayout());
        container.add(jLabel);
        container.add(jLabel1);
        container.add(picture);

        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new LabelControl();
    }
}
