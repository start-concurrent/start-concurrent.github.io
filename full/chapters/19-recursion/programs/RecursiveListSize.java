public class RecursiveListSize {
    private static class Node {
        public String value;
        public Node next;
    }
 
    private Node head = null;   
    
    public void add(String value) {
    	Node temp = new Node();
    	temp.value = value;
    	temp.next = head;
    	head = temp;    	
    }
    
    //proxy method
    public int size() {
    	return size( head );
    }
    
    private static int size(Node list) {
    	if( list == null ) //base case
    		return 0;    	
    	//recursive case
    	return 1 + size( list.next );
    }    
}