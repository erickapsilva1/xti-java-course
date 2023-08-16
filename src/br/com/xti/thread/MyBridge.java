package br.com.xti.thread;

public interface MyBridge {

    public void set(int value) throws InterruptedException;
    public int  get() throws InterruptedException;

}
