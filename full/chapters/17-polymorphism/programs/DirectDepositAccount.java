import java.util.Calendar;
public class DirectDepositAccount extends CheckingAccount {
    protected Calendar lastDirectDeposit;
    
    public DirectDepositAccount(String name, double balance)
        throws InterruptedException {
        super(name, balance);
        lastDirectDeposit = Calendar.getInstance();
    }
    
    public double getFee() {        
        Calendar current = Calendar.getInstance();
        int months = 12*(current.get(Calendar.YEAR) -
        lastDirectDeposit.get(Calendar.YEAR)) +
        (current.get(Calendar.MONTH) -
        lastDirectDeposit.get(Calendar.MONTH));
        if(months <= 1)
            return 0;
        else
            return super.getFee();
    }
    
    public void directDeposit(double amount) throws InterruptedException {
        deposit(amount);
        lastDirectDeposit = Calendar.getInstance();
    }
}