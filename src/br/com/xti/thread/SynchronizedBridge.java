package br.com.xti.thread;

public class SynchronizedBridge implements MyBridge {

    private int value = -1;

    private boolean busy;

    @Override
    public synchronized void set(int value) throws InterruptedException {
        while (busy){
            System.out.println("The bridge is full, Producer please wait.");
            wait();
        }
        System.out.print("Produced " + value);
        this.value = value;
        busy = true;
        notifyAll();
    }

    @Override
    public synchronized int get() throws InterruptedException {
        while (!busy){
            System.out.println("The bridge is free, Producer is waiting");
            wait();
        }
        System.err.print("Consumed " + value);
        busy = false;
        notifyAll();
        return value;
    }
}
