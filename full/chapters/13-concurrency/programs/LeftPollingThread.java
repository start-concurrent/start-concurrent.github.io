public class LeftPollingThread extends Thread {
    private RightPollingThread right;
    private boolean done = false;
    
    public void setRight(RightPollingThread right) {
        this.right = right;
    }

    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.print("Left ");
            System.out.print("Left ");
            System.out.print("Left ");          
            done = true;            
            while(!right.isDone());           
            right.setDone(false);                     
            System.out.println("Left");                 
        }
    }
    
    public boolean isDone() { return done; }    
    public void setDone(boolean value) { done = value; }
}