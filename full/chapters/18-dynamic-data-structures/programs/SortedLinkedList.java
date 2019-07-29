public class SortedLinkedList {
    private static class Node {
        public String value;
        public Node next;
    }
 
    private Node head = null;
    private Node tail = null;
    private int size = 0;
    
    public void add(String value) {
        Node temp = new Node();
        temp.value = value;
        temp.next = null;
        
        if(head == null) // Empty list <.>
            head = tail = temp;
        else if(value.compareTo(head.value) < 0) { // Insert at beginning <.>
            temp.next = head;
            head = temp;            
        }
        else { // Insert at middle or end <.>
            Node previous = head;
            Node current = head.next;
            
            while(current != null && value.compareTo(current.value) >= 0) {
                previous = current;
                current = current.next;
            }
            
            previous.next = temp;
            temp.next = current;
            
            if(current == null) // Inserting at end of list <.>
                tail = temp;
        }
        size++;
    }
    
    public int size() {
        return size;
    }
    
    public void fillArray(String[] array) {     
        Node temp = head;
        int position = 0;
        while(temp != null) {
            array[position++] = temp.value;
            temp = temp.next;
        }           
    }
}