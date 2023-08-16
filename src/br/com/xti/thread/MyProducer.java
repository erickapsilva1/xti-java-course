package br.com.xti.thread;

import java.util.Random;

public class MyProducer implements Runnable {

    private MyBridge bridge;

    public MyProducer(MyBridge bridge){
        this.bridge = bridge;
    }

    private Random random = new Random();

    @Override
    public void run() {
        int total = 0;
        for (int i=0; i<5; i++){
            try {
                Thread.sleep(random.nextInt(300));
                total += i;
                bridge.set(i);
                System.out.println("\t" + total);
            }catch (InterruptedException exception){}
        }
    }
}
