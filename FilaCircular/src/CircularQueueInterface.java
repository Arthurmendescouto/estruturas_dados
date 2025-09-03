public interface CircularQueueInterface {
    void enqueue(Object item);
    Object dequeue();
    Object front();
    void startUpdate(Object item);
    void endUpdate(Object item);
    boolean isFull();
    boolean isEmpty();
    String print();

}