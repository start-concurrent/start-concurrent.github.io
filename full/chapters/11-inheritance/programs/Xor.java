public class Xor extends BinaryOperator {
    public Xor() { super("XOR"); }

    public boolean getValue() {
        return getOperand1().getValue() ^ getOperand1().getValue();
    }
}