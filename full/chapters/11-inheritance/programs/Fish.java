import java.awt.*;

public class Fish {
    protected Color color = Color.GRAY;
    private double location = 0.0;
    private double energy = 100.0;
    private boolean alive = true;
    
    public Color getColor() { return color; }
    public double getLocation() { return location; }
    public boolean isAlive() { return alive; }
    
    public void swim() {
        if(alive) {
            location += 0.5;
            energy -= 0.25;
        }
        if(energy <= 0.0)
            die();
    }
    
    public void feed() { energy = 100.0; }
    public void die() { alive = false; }
}
