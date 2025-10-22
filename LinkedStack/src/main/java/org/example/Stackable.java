package LinkedStack.src.main.java.org.example;

public interface Stackable<T> {

        void push(T data);
        T pop();
        T peek();
        void update(T item);

        boolean isFull();
        boolean isEmpty();
        String print();

}
