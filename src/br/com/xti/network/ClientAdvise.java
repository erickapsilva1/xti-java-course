package br.com.xti.network;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientAdvise {
    public static void main(String[] args) throws IOException {

        // 0 - 1023: already reserved
        Socket socket = new Socket("127.0.0.1", 5000);
        Scanner scanner = new Scanner(socket.getInputStream());
        System.out.println("Message from server: " + scanner.nextLine());
        scanner.close();
    }
}
