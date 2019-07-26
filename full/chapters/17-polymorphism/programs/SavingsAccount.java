public class SavingsAccount extends BankAccount {
    public static final double MINIMUM = 1000;
    public static final double FEE = 25;
    protected final double RATE;

    public SavingsAccount(String name, double balance, double rate)
        throws InterruptedException {
        super(name, balance);
        RATE = rate;        
    }
    
    protected double getFee() { return FEE; }
    
    protected double getMinimum() { return MINIMUM; }
    
    protected synchronized void update() throws InterruptedException {
        super.update(); 
        int months = getMonthsPassed();
        for(int i = 0; i < months; i++) {
            if(getBalance() > 0)
                changeBalance(getBalance() * (1 + RATE/12));
            if(getBalance() < getMinimum())
                changeBalance(-getFee());
        }               
    }
}