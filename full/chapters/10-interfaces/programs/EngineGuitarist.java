public class EngineGuitarist implements DefaultGuitarist, DefaultEngine {
	public void strumChord(Chord chord) {
		System.out.println("Rumbles out " + chord.getName() + "!");
	}
	
	public void playMelody(Melody notes) {
		System.out.println("Plays " + notes.toString() + " revving at different RPMs!");
	}
	
	public void start() {
		System.out.println("*Crank*, *crank*, *vroooom!*");
	}
	
    public int getRedline() {
		return 7000;
	}
}