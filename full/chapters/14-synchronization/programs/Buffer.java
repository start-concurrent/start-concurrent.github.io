public class Buffer {
    public final static int SIZE = 10;
    private Object[] objects = new Object[SIZE];    
    private int count = 0;
    
    public synchronized void addItem(Object object) throws InterruptedException { //<.>
        while(count == SIZE) //<.>
            wait();     
        objects[count] = object;
        count++;
        notifyAll();         //<.>
    }
    
    public synchronized Object removeItem() throws InterruptedException { //<.>
        while(count == 0)    //<.>
            wait();
        count--;
        Object object = objects[count];     
        notifyAll();         //<.>
        return object;
    }
}
