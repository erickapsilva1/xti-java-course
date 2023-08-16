package br.com.xti.thread;

public class JointAccount {
    private int balance = 100;

    public int getBalance(){
        return this.balance;
    }

    public synchronized void withdraw(int amount, String client){
        if(amount <= this.balance){
            int originalBalance = this.balance;
            System.out.println(client + " will withdraw.");
            try {
                System.out.println(client + " waiting...");
                Thread.sleep(1000); // waiting processing
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            this.balance -= amount;
            String message = client + " withdrew " + amount +
                    "  ---> [Original Balance = " + originalBalance +
                    ", Actual Balance = "+ this.balance + "]";
            System.out.println(message);
        }else{
            System.out.println("Account balance is insufficient.");
        }
    }
}
