public class TermStack {
    private static class Node {
        public Term value;
        public Node next;
    }
    
    private Node head = null;

    public void push(Term value) {
        Node temp = new Node();
        temp.value = value;
        temp.next = head;
        head = temp;
    }

    public Term pop() {
        Term value = null;
        if (isEmpty())
            System.out.println("Can't pop empty stack!");
        else {
            value = head.value;
            head = head.next;
        }
        return value;
    }

    public Term top() {
        Term value = null;
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
