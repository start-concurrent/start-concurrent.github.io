public abstract class Animal {
    private boolean alive = true;
    private boolean happy = true;
    private final boolean warmblooded;
    
    public Animal( boolean warmblooded ) {      
        this.warmblooded = warmblooded;
    }   
        
    public boolean isHappy() { return happy; }  
    
    public void setHappy( boolean value ) { happy = value; }        
    
    public boolean isAlive() { return alive; }  
    
    public void die() { alive = false; }    
}