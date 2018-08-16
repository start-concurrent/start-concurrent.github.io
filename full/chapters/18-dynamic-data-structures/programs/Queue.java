public interface Queue {
    void enqueue(String value);
    String dequeue();
    String front();
    boolean isEmpty();
}