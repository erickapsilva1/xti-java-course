package br.com.xti.network;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient extends JFrame {

    JTextField textToSend;
    Socket socket;
    PrintWriter printWriter;
    String name;

    public ChatClient(String name){
        super("Chat: " + name);
        this.name = name;

        textToSend = new JTextField();

        Font font = new Font("Serif", Font.PLAIN, 26);
        JButton jButton = new JButton("Send");
        jButton.setFont(font);
        textToSend.setFont(font);

        jButton.addActionListener(new SendListener());

        Container send = new JPanel();

        send.setLayout(new BorderLayout());
        send.add(BorderLayout.CENTER, textToSend);
        send.add(BorderLayout.EAST, jButton);

        getContentPane().add(BorderLayout.SOUTH, send);

        setupNetwork();

        setSize(500,90);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private class SendListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            printWriter.println(name + ": " + textToSend.getText());
            printWriter.flush();
            textToSend.setText("");
            textToSend.requestFocus();
        }
    }

    private void setupNetwork(){
        try {
            socket = new Socket("127.0.0.1", 5000);
            printWriter = new PrintWriter(socket.getOutputStream());
        }catch (Exception exception){

        }
    }

    public static void main(String[] args) {
        new ChatClient("Luna-Luna");
        new ChatClient("Nebbie");
    }
}
