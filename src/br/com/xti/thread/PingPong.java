package br.com.xti.thread;

public class PingPong extends Thread {

    String word;
    long time;

    public PingPong(String word, long time){
        this.word = word;
        this.time = time;
    }

    public void run(){
        for(int i = 0; i < 5; i++) {
            System.out.println(word);
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                return;
            }
        }
    }

    public static void main(String[] args) {

        new PingPong("ping", 1500).start();
        new PingPong("pong", 2000).start();

        System.out.println("See thread");
    }
}
