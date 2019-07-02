public class Not extends UnaryOperator {
    public Not() { super("NOT"); }
    public boolean getValue() { return !getInput().getValue(); }
}