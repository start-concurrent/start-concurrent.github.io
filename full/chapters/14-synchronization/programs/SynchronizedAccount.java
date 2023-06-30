public class SynchronizedAccount {
    private double balance = 0.0;   
    private int readers = 0;    

    public double getBalance() throws InterruptedException {
        double amount;      
        synchronized(this) {   //<.>
            readers++;
        }       
        amount = balance;      //<.>
        synchronized(this) {
            if(--readers == 0) //<.>
                notifyAll();   //<.>
        }       
        return amount;      
    }

    public void deposit(double amount) throws InterruptedException {
        changeBalance(amount);
        System.out.println("Deposited $" + amount + ".");
    }
    
    public boolean withdraw(double amount)
        throws InterruptedException {
        boolean success = changeBalance(-amount);
        if(success)
            System.out.println("Withdrew $" + amount + ".");
        else
            System.out.println("Failed to withdraw $" +
                amount + ": insufficient funds.");
        return success;
    }
    
    protected synchronized boolean changeBalance(double amount) //<.>
        throws InterruptedException {
        boolean success;    
        while(readers > 0) //<.>
			wait();         
        if(success = (balance + amount > 0)) //<.>
            balance += amount;      
        return success; 
    }
}
