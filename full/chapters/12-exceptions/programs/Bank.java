public class Bank {
	private boolean alarm = true;
	private Vault vault = new Vault();
	
	public Vault findVault() throws WatchmanException {
		if(Math.random() > .9)
			throw new WatchmanException();
		else if(Math.random() > .25)
			return vault;
		else
			return null;
	}
	
	public void disableAlarm() throws BurglarAlarmException, WatchmanException {
		if(Math.random() > .5)
			throw new BurglarAlarmException();
		else if(Math.random() > .9)
			throw new WatchmanException();
		else if(Math.random() > .25)
			alarm = false;
	}
	
	public void breakIn() throws BurglarAlarmException, LockPickFailException, WatchmanException {
		if(alarm)
			throw new BurglarAlarmException();
		else if(Math.random() > .9)
			throw new WatchmanException();
		else if(Math.random() > .75)
			throw new LockPickFailException();
	}
}