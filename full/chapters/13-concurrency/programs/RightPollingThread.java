public class RightPollingThread extends Thread {
    private LeftPollingThread left;
    private boolean done = false;   
    
    public void setLeft(LeftPollingThread left) {
        this.left = left;
    }
    
    public void run() { 
        for(int i = 0; i < 10; i++) {             
            while(!left.isDone());            
            left.setDone(false);            
            System.out.print("Right ");         
            done = true;
        }
    }
    
    public boolean isDone() { return done; }    
    public void setDone(boolean value) { done = value; }
}