public class Thread2 extends Thread {
    private double a, t, value;
    
    public  Thread2(double a, double t) {
        this.a = a;
        this.t = t;
    }
    public void run() { value = Math.exp(-a*t*t); }
    public double getValue() { return value; }
}