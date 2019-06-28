public interface StaticGuitarist {
    void strumChord(Chord chord);
    void playMelody(Melody notes);
    
	static String nextNote(String note) {
		char letter = note.charAt(0);
		if(note.length() == 2) {
			if(note.charAt(1) == 'b')
				return "" + letter;
			else {
				switch(letter) {
				case 'B':
				case 'E':
					return letter + "#";
				case 'G':
					return "A";
				default:
					return "" + (letter + 1);
				}
			}
		}
		else {
			switch(letter) {
			case 'B':
			case 'E':
				return "" + (letter + 1);
			default:
				return letter + "#";
			}
		}	
	}
}