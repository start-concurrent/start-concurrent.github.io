public class Output extends UnaryOperator {
    public Output(int i) { super("OUTPUT " + i); }
    public boolean getValue() { return getInput().getValue(); }
}