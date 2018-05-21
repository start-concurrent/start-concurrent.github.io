import java.util.ArrayList;

public class ArrayListExample extends Thread {
	private static ArrayList<String> list;

	public static void main(String[] args) {
		Thread t1 = new ArrayListExample();
		Thread t2 = new ArrayListExample();

		list = new ArrayList<String>();

		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) { e.printStackTrace(); }
		
		for (String s : list)
			System.out.println(s);
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			synchronized (list) {/*@\label{aleSync}@*/
				list.add(this.getName() + ": " + i);
			}
			try { Thread.sleep(1);	}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
