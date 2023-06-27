public class SymbolStack {
    private char[] symbols;
    private int size;
    
    public SymbolStack(int maxSize) { 
        symbols = new char[maxSize]; //<.>
        size = 0; //<.>
    }
    
    public void push( char symbol ) { symbols[size++] = symbol; } //<.>
    public void pop() { size--; } //<.>
    public char top() { return symbols[size - 1]; } //<.>
    public boolean isEmpty() { return size == 0; } //<.>
}
