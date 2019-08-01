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
    
    // Proxy method
    public int size() {
        return size(head);
    }
    
    private static int size(Node list) {
        if(list == null) 				// Base case
            return 0;   
        else
			return 1 + size(list.next);	// Recursive case
    }    
}