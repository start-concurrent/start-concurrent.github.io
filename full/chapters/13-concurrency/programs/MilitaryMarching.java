public class MilitaryMarching {
    public static void main(String[] args) {
        LeftThread left = new LeftThread();
        RightThread right = new RightThread();
        left.start();
        right.start();
        try {
            left.join();
            right.join();
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }       
    }
}
