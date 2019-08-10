public class Vault {
	private boolean isOpen = false;
	private Loot loot = new Loot();
	public Loot getLoot() throws WatchmanException {
		if(Math.random() > 0.9)
			throw new WatchmanException();
		else if(isOpen)
			return loot;
		else
			return null;
	}
	
	public void open() throws LockPickFailException, WatchmanException {
		if(Math.random() > 0.9)
			throw new WatchmanException();
		else if(Math.random() > 0.75)
			throw new LockPickFailException();
		else
			isOpen = true;	
	}
}