package br.com.xti.thread;

public class BridgeTest {
    public static void main(String[] args) {

        MyBridge bridge = new UnsynchronizedBridge();

        new Thread(new MyProducer(bridge)).start();
        new Thread(new MyConsumer(bridge)).start();

    }
}
