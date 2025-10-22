package LinkedDEQue.src.main.java.org.example;

public interface Queueable<T> {
    void beginEnqueue(T item);

    void endEnqueue(T item);

    T beginDequeue();

    T endDequeue();

    void beginUpdate(T item);

    void endUpdate(T item);

    T front();

    T rear();

    boolean isEmpty();

    boolean isFull();

    String printRear();

    String printFront();
}
