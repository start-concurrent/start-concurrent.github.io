public class Or extends BinaryOperator {
    public Or() { super("OR"); }

    public boolean getValue() {
        return getOperand1().getValue() || getOperand1().getValue();
    }
}