package br.com.xti.network;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChatServer {

    List<PrintWriter> writerList = new ArrayList<>();

    public ChatServer(){
        ServerSocket serverSocket;
        try {
            serverSocket = new ServerSocket(5000);
            while (true) {
                Socket socket = serverSocket.accept();
                new Thread(new ClientListener(socket)).start();
                PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
                writerList.add(printWriter);
            }
        } catch (Exception exception){}
    }

    private void forwardToAll(String text){
        for(PrintWriter printWriter : writerList){
            try {
                printWriter.println(text);
                printWriter.flush();
            }catch (Exception exception){}
        }
    }

    private class ClientListener implements Runnable{
        Scanner scanner;
        public ClientListener(Socket socket){
            try {
                scanner = new Scanner(socket.getInputStream());
            }catch (IOException exception){ }
        }

        @Override
        public void run() {
            try {
                String text;
                while ((text = scanner.nextLine()) != null) {
                    System.out.println(text);
                    forwardToAll(text);
                }
            }catch (Exception exception){}
        }
    }
    public static void main(String[] args) {
        new ChatServer();
    }
}
