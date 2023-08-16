package br.com.xti.thread;

public class JointAccountTest implements Runnable {
    JointAccount account = new JointAccount();

    public static void main(String[] args) {

        JointAccountTest goToShop = new JointAccountTest();

        new Thread(goToShop, "Dad").start();
        new Thread(goToShop, "Mom").start();
        new Thread(goToShop, "Daughter").start();
        new Thread(goToShop, "Baby Sister").start();

    }

    @Override
    public void run() {
        String client = Thread.currentThread().getName();
        for(int i=0; i<5; i++) {
            account.withdraw(20, client);
            if (account.getBalance() < 0) {
                System.out.println("Run out!");
            }
        }
    }
}
