import java.util.Calendar; //<.>

public abstract class BankAccount extends SynchronizedAccount { //<.>
    private String name;
    private Calendar lastAccess;
    private int monthsPassed = 0;

    public BankAccount(String name, double balance) throws InterruptedException {
        this.name = name;
        changeBalance(balance);
        lastAccess = Calendar.getInstance();        
    }
    
    public String getName() { return name; }
    
    protected Calendar getLastAccess() { return lastAccess; }
    
    protected int getMonthsPassed() { return monthsPassed; }

    public final double getBalance() throws InterruptedException {      
        update();       
        return super.getBalance();
    }
    
    public final void deposit(double amount) throws InterruptedException {
        update();
        super.deposit(amount);        
    }
    
    public final boolean withdraw(double amount) throws InterruptedException {
        update();       
        return super.withdraw(amount);
    }
    
    protected synchronized void update() throws InterruptedException {
        Calendar current = Calendar.getInstance();
        int months = 12*(current.get(Calendar.YEAR) -
			lastAccess.get(Calendar.YEAR)) + (current.get(Calendar.MONTH) -
			lastAccess.get(Calendar.MONTH));
        if(months > 0) {
			lastAccess = current;
			monthsPassed = months;
        }
    }
}   