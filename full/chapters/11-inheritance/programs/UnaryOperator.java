public class UnaryOperator extends Gate {
    private Gate input;

    public UnaryOperator(String name) { super(name); }
    public void setInput(Gate input) { this.input = input; }
    public Gate getInput() { return input; }
}