public class NumberedThread extends Thread {
    private int value;

    public NumberedThread(int input) { value = input; }
    
    public void run() {
        System.out.println("Thread " + value);
    }
}
