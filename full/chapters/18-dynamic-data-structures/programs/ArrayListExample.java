import java.util.ArrayList;

public class ArrayListExample extends Thread {
	private static ArrayList<String> list;

	public static void main(String[] args) {
		list = new ArrayList<String>(); // <1>
		
		Thread t1 = new ArrayListExample(); // <2>
		Thread t2 = new ArrayListExample();
		t1.start(); 
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) { e.printStackTrace(); }
		
		for (String s : list)
			System.out.println(s);
	}
	
	public void run() { // <3>
		for (int i = 0; i < 10; i++) {
			synchronized (list) { // <4>
				list.add(this.getName() + ": " + i);
			}
			try { Thread.sleep(1);	}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
