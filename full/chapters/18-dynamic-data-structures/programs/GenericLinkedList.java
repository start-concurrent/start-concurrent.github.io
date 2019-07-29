public class GenericLinkedList<T> {
    private static class Node<T> {
        public T value;
        public Node<T> next;
    }
 
    private Node<T> head = null;
    private int size = 0;
    
    public void add(T value) {
        Node<T> temp = new Node<T>();
        temp.value = value;
        temp.next = head;
        head = temp;
        size++;
    }
    
    public int size() {
        return size;
    }
    
    public void fillArray(T[] array) {      
        Node<T> temp = head;
        int position = 0;
        while(temp != null) {
            array[position++] = temp.value;
            temp = temp.next;
        }           
    }
}