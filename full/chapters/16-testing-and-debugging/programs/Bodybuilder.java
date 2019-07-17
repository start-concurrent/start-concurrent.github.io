public class Bodybuilder {
    public int strength = 8;

    public boolean isStrongEnough(int strengthNeeded) {
        return strength >= strengthNeeded;
    }   

    public void setStrength(int value) { strength = value; }
}