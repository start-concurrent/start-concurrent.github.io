public class RockGuitarist implements Guitarist {
    public void strumChord(Chord chord) {
        System.out.print("Totally wails on that " + chord.getName() + " chord!");
    }
    
    public void playMelody(Melody notes) {
        System.out.print("Burns through the notes " + notes.toString() +
			" like Jimmy Page!");
    }
}