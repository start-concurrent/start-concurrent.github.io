public class GeometricSequence extends Sequence {
	public GeometricSequence(int firstTerm, int ratio) {
		super(firstTerm, ratio);
	}
	
    public int getNextValue() {
        number *= CONSTANT;
        return number;
    }
}