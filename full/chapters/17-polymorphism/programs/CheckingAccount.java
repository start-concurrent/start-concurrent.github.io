public class CheckingAccount extends BankAccount {
    public static final double FEE = 10;
    
    public CheckingAccount(String name, double balance)
        throws InterruptedException {
        super(name, balance);             
    }
    
    protected synchronized void update() throws InterruptedException {
        super.update();
        changeBalance(-getFee()*getMonthsPassed());
    }
    
    protected double getFee() { return FEE; }
}