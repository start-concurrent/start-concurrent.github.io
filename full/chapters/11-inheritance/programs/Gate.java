public class Gate {
    private String name;

    public Gate(String name) { this.name = name; }
    public String getName() { return name; }
    public String toString() {
        return getName() + ": " + getValue();
    }
    public boolean getValue() { return false; }
}