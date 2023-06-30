public class LeftThread extends Thread {
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.print("Left ");  //<.>
            System.out.print("Left ");
            System.out.print("Left ");
            try { Thread.sleep(10); }  // <.>
            catch(InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Left"); //<.>
        }
    }
}
