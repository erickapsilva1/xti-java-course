package br.com.xti.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TextAreaControl extends JFrame implements ActionListener {
    JTextArea textArea;
    public TextAreaControl(){
        super("Text Editor");

        textArea = new JTextArea();
        textArea.setFont(new Font("Serif", Font.PLAIN, 26));

        JButton jButton = new JButton("Open File");
        jButton.setFont(new Font("Serif", Font.PLAIN, 26));
        jButton.addActionListener(this);

        JScrollPane scrollPane = new JScrollPane(textArea);

        Container container = getContentPane();
        container.add(BorderLayout.NORTH, jButton);
        container.add(BorderLayout.CENTER, scrollPane);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new TextAreaControl();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.showOpenDialog(this);
        File file = jFileChooser.getSelectedFile();
        try{
            Path path = Paths.get(file.getAbsoluteFile().toURI());
            String userFile = new String(Files.readAllBytes(path));
            textArea.setText(userFile);

        }catch (Exception error){
            JOptionPane.showMessageDialog(this, "Something went wrong... Sorry.");
        }
    }
}
