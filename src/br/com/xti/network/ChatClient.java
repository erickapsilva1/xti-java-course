package br.com.xti.network;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient extends JFrame {

    JTextField textToSend;
    Socket socket;
    PrintWriter printWriter;
    String name;
    JTextArea receivedText;
    Scanner scanner;

    private class ServerListener implements Runnable{

        @Override
        public void run() {
            try {
                String text;
                while ((text = scanner.nextLine()) != null) {
                    receivedText.append(text + "\n");
                }
            }catch (Exception exception){}
        }
    }

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

        receivedText = new JTextArea();
        receivedText.setFont(font);
        JScrollPane jScrollPane = new JScrollPane(receivedText);

        getContentPane().add(BorderLayout.SOUTH, send);
        getContentPane().add(BorderLayout.CENTER, jScrollPane);

        setupNetwork();

        setSize(500,500);
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
            scanner = new Scanner(socket.getInputStream());
            new Thread(new ServerListener()).start();
        }catch (Exception exception){

        }
    }

    public static void main(String[] args) {
        new ChatClient("Luna-Luna");
        new ChatClient("Nebbie");
    }
}
