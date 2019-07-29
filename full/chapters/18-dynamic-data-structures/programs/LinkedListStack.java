public class LinkedListStack implements Stack {
    private static class Node {
        public String value;
        public Node next;
    }
    
    private Node head = null; // <.>

    public void push(String value) { // <.>
        Node temp = new Node();
        temp.value = value;
        temp.next = head;
        head = temp;
    }

    public String pop() { // <.>
        String value = null;
        if(isEmpty())
            System.out.println("Can't pop empty stack!");
        else {
            value = head.value;
            head = head.next;
        }
        return value;
    }

    public String top() {
        String value = null;
        if(isEmpty())
            System.out.println("No top on an empty stack!");
        else
            value = head.value;
        return value;
    }

    public boolean isEmpty() {
        return head == null;
    }
}