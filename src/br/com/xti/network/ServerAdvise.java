package br.com.xti.network;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerAdvise {
    public static void main(String[] args) throws IOException {

        ServerSocket server = new ServerSocket(5000);
        while(true){
            Socket socket = server.accept();
            try(PrintWriter printWriter = new PrintWriter(socket.getOutputStream())) {
                printWriter.println("Learn Java and be hire!");
            }
        }

    }
}
