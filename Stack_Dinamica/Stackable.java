package Stack_Dinamica;

public interface Stackable<T> {
        void push(T data);
        Object pop();
        Object peek();
        void update(T item);

        boolean isFull();
        boolean isEmpty();
        String print();

}
