public class ArithmeticSequence extends Sequence {
	public ArithmeticSequence(int firstTerm, int difference) {
		super(firstTerm, difference);
	}	
	
    public int getNextValue() {
        number += CONSTANT;
        return number;
    }
}