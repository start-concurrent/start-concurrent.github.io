public class ArithmeticSequence extends Sequence {
    public abstract int getNextValue() {
        number += CONSTANT;
        return number;
    }
}