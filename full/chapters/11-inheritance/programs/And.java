public class And extends BinaryOperator {
    public And() { super("AND"); }

    public boolean getValue() {
        return getOperand1().getValue() && getOperand1().getValue();
    }
}