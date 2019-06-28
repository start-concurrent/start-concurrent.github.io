public class ClassicalGuitarist implements Guitarist {
    public void strumChord(Chord chord) {
        System.out.print("Delicately voices a " + chord.getName() + " chord.");      
    }
    
    public void playMelody(Melody notes) {
        System.out.print("Plucks the melodic line " + notes.toString() +
			" with the skill of John Williams.");     
    }
}