import java.util.ArrayList;

public class ArrayListExample extends Thread {
    private ArrayList<String> list;

    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> list = new ArrayList<String>(); // <.>
        
        Thread t1 = new ArrayListExample(list); // <.>
        Thread t2 = new ArrayListExample(list);
        t1.start(); 
        t2.start();

		t1.join();
		t2.join();
        
        for(String text: list) //<.>
            System.out.println(text);
    }
	
	public ArrayListExample(ArrayList<String> list) {
		this.list = list; 				//<.>
	}
    
    public void run() { 
        for(int i = 0; i < 10; i++) { 	// <.>
            synchronized(list) { 		// <.>
                list.add(this.getName() + ": " + i);
            }
            try { 
				Thread.sleep(1); 		//<.>
			}
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}