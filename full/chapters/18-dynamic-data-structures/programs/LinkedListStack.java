public class LinkedListStack implements Stack {
    private static class Node {
        public String value;
        public Node next;
    }
    
    private Node head = null; // <1>

    public void push(String value) { // <2>
        Node temp = new Node();
        temp.value = value;
        temp.next = head;
        head = temp;
    }

    public String pop() { // <3>
        String value = null;
        if (isEmpty())
            System.out.println("Can't pop empty stack!");
        else {
            value = head.value;
            head = head.next;
        }
        return value;
    }

    public String top() {
        String value = null;
        if (isEmpty())
            System.out.println("No top on an empty stack!");
        else
            value = head.value;
        return value;
    }

    public boolean isEmpty() {
        return head == null;
    }
}