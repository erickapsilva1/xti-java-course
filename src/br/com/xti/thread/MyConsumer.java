package br.com.xti.thread;

import java.util.Random;

public class MyConsumer implements Runnable {

    private MyBridge bridge;

    public MyConsumer(MyBridge bridge){
        this.bridge = bridge;
    }

    private Random random = new Random();

    @Override
    public void run() {
        int total = 0;
        for (int i=0; i<5; i++){
            try {
                Thread.sleep(random.nextInt(300));
                total += bridge.get();
                System.err.println("\t" + total);
            }catch (InterruptedException exception){}
        }
    }
}
