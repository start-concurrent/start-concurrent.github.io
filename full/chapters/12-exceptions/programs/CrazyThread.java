public class CrazyThread extends Thread {
    private int value;
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++)
            new CrazyThread(i).start();
        throw new RuntimeException();
    }
    
    public CrazyThread(int value) {
        this.value = value;
    }
    
    public void run() {
        if(value == 7) {
            double sum = 0;
            for(int i = 1; i <= 1000000; i++)
                sum += Math.sin(i);
            System.out.println("Sum: " + sum);
        }
        else
            throw new RuntimeException();   
    }
}