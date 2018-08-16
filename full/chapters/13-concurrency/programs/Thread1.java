public class Thread1 extends Thread {
    private double K, a, t, value;
 
    public Thread1(double K, double a, double t) {
        this.K = K;
        this.a = a;
        this.t = t;
    } 
    public void run() { value = 2*K*a*t; }
    public double getValue() { return value; }
}
