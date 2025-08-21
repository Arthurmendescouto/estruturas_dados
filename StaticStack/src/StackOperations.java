public interface StackOperations {
    void push(Object data);
    Object pop();
    Object peek();
    void update();

    boolean isFull();
    boolean isEmpty();
    String print();
}