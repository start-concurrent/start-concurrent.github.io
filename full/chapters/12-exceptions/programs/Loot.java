public class Loot {
	private double weight = Math.random() * 1000.0;
	
	public void carryAway() throws LootTooHeavyException, WatchmanException {
		if(Math.random() > 0.9)
			throw new WatchmanException();
		else if(weight > 300.0)
			throw new LootTooHeavyException();
	}
}