public class LinkedListWithTail {
    private static class Node {
        public String value;
        public Node next;
    }
 
    private Node head = null;
    private Node tail = null;
    private int size = 0;
    
    public void addFirst(String value) {
    	Node temp = new Node();
    	temp.value = value;
    	temp.next = head;
    	head = temp;
    	if( tail == null )
    		tail = head;
    	size++;
    }
    
    public void addLast(String value) {
    	Node temp = new Node();
    	temp.value = value;
    	temp.next = null;
    	if( tail == null )
    		head = tail = temp;
    	else 
    		tail.next = temp;
    	size++;    	
    }
    
    public int getSize() {
    	return size;
    }
    
    public void fillArray(String[] array) {    	
    	Node temp = head;
    	int position = 0;
    	while( temp != null ) {
    		array[position++] = temp.value;
    		temp = temp.next;
    	}   		
    }
}