public interface QueueInterface {
    void enqueue(Object data);
    Object dequeue();
    Object front();
    boolean isFull();
    boolean isEmpty();
    String print();
}