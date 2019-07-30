public class IterativeListSize {
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
    
    public int size() {
        Node current = head;
        int counter = 0;
        while(current != null) {
            current = current.next;
            counter++;
        }           
        return counter;
    }
}