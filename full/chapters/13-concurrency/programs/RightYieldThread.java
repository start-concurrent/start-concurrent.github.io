public class RightYieldThread extends Thread {
    public void run() {         
        for(int i = 0; i < 10; i++) { 
            System.out.print("Right ");         
            Thread.yield();
        }
    }
}