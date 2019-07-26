public abstract class Sequence {
    protected int number;
    protected final int CONSTANT;
    
    public Sequence(int number, int constant) {
        this.number = number;
        CONSTANT = constant;
    }
    
    public abstract int getNextValue();
}