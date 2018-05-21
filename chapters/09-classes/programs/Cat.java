public class Cat {
	private int lives = 9;
	
	public boolean useCuriosity() {			
		if( lives > 1 ) { /*@\label{life check}@*/
			lives--;
			System.out.println("Down to life " + lives);
			return true;
		}
		else {
			System.out.println("No more lives left!");
			return false;
		}
	}	
}
