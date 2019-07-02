public class BinaryOperator extends Gate {
    private Gate operand1;
    private Gate operand2;

    public BinaryOperator(String name) { super(name); }
    public Gate getOperand1() { return operand1; }
    public Gate getOperand2() { return operand2; }
    public void setOperand1(Gate operand) { operand1 = operand; }
    public void setOperand2(Gate operand) { operand2 = operand; }
}