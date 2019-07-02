public interface DefaultGuitarist {    
    void strumChord(Chord chord);
    void playMelody(Melody notes);
	
	default boolean tune() {
		System.out.println("Tuning guitar...");
		return true;
	}
}