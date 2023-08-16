package br.com.xti.thread;

public class BridgeTest2 {
    public static void main(String[] args) {
        MyBridge bridge = new SynchronizedBridge();

        new Thread(new MyProducer(bridge)).start();
        new Thread(new MyConsumer(bridge)).start();
    }
}
