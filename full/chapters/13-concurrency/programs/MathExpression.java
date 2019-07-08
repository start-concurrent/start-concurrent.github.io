public class MathExpression { 
    public static void main (String[] args) {
        double K = 120, a = 1.2, t = 2;
        Thread1 thread1 = new Thread1(K, a, t);
        Thread2 thread2 = new Thread2(a, t);
        thread1.start(); // Start thread1
        thread2.start(); // Start thread2
        try { // Wait for both threads to complete
            thread1.join();
            thread2.join();
            System.out.println("Value of expression: " +
                    thread1.getValue()*thread2.getValue());
        }
        catch (InterruptedException e) {
            System.out.println("A thread didn't finish!");
        }        
    }
}
