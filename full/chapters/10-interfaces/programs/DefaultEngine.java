public interface DefaultEngine {    
    void start();
    int getRedline();
	
	default boolean tune() {
		System.out.println("Checking spark plugs...");
		return true;
	}
}