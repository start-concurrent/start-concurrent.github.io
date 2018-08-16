public class GeometricSequence extends Sequence {
    public abstract int getNextValue() {
        number *= CONSTANT;
        return number;
    }
}