public class LeftYieldThread extends Thread {
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.print("Left ");
            System.out.print("Left ");
            System.out.print("Left ");              
            Thread.yield();         
            System.out.println("Left");                 
        }
    }
}