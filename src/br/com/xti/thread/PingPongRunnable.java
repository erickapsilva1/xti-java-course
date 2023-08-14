package br.com.xti.thread;

public class PingPongRunnable implements Runnable {

    String word;
    long time;

    public PingPongRunnable(String word, long time){
        this.word = word;
        this.time = time;
    }

    public void run(){
        for(int i = 0; i < 15; i++) {
            System.out.println(word);
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                return;
            }
        }
    }

    public static void main(String[] args) {

        Runnable ping = new PingPongRunnable("ping", 1500);
        Runnable pong = new PingPongRunnable("ping", 2000);

        new Thread(ping, "ping").start();
        new Thread(pong, "pong").start();

        System.out.println("See thread");
    }
}
