public class ObjectStack {
    private static class Node {
        public Object value;
        public Node next;
    }
    
    private Node head = null;

    public void push(Object value) {
        Node temp = new Node();
        temp.value = value;
        temp.next = head;
        head = temp;
    }

    public Object pop() {
        Object value = null;
        if(isEmpty())
            System.out.println("Can't pop empty stack!");
        else {
            value = head.value;
            head = head.next;
        }
        return value;
    }

    public Object top() {
        Object value = null;
        if(isEmpty())
            System.out.println("Can't get top of empty stack!");
        else
            value = head.value;
        return value;
    }

    public boolean isEmpty() {
        return head == null;
    }
}