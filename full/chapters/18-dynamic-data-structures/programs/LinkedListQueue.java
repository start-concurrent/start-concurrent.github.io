public class LinkedListQueue implements Queue {
    private static class Node {
        public String value;
        public Node next;
    }
    
    private Node head = null;
    private Node tail = null;    
    
    public void enqueue(String value) {
        Node temp = new Node();
        temp.value = value;
        temp.next = null;        
        if(isEmpty())
            head = temp;
        else          
            tail.next = temp;
		tail = temp;            
    }
    
    public String dequeue() { 
        String value = null;
        if(isEmpty())
            System.out.println("Can't dequeue an empty queue!");
        else {
            value = head.value;
            head = head.next;
            if(head == null)
                tail = null;
        }
        return value;
    }
    
    public String front() {
        String value = null;
        if(isEmpty())
            System.out.println("No front on an empty queue!");
        else
            value = head.value;
        return value;
    }
    
    public boolean isEmpty() {
        return head == null;
    }
}
