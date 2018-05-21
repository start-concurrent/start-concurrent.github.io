import java.io.Serializable;

public class BaseballPlayer implements Serializable {
	private int homeRuns;
	private int RBI;
	private float battingAverage;
	
	public BaseballPlayer( int homeRuns, int RBI, float battingAverage ) {
		this.homeRuns = homeRuns;
		this.RBI = RBI;
		this.battingAverage = battingAverage;
	}
	
	public int getHomeRuns() { return homeRuns; } 
	public int getRBI() { return RBI; }
	public float getBattingAverage() { return battingAverage; }
}