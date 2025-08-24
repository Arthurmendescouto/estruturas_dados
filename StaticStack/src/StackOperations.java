public interface StackOperations {
    void push(Object data);
    Object pop();
    Object peek();
    void update(Object item);

    boolean isFull();
    boolean isEmpty();
    String print();
}