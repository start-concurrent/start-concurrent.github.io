public class RightThread extends Thread {
    public void run() { 
        try {
			Thread.sleep(5); //<.>
			for(int i = 0; i < 10; i++) { 
				System.out.print("Right "); //<.>
				Thread.sleep(10); //<.>
			}
		}
        catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}