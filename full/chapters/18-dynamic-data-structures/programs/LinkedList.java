public class LinkedList {
    private static class Node {
        public String value;
        public Node next;
    }
 
    private Node head = null;
    private int size = 0;
    
    public void add(String value) {
        Node temp = new Node();
        temp.value = value;
        temp.next = head;
        head = temp;
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