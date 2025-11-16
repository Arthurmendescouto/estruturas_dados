package CarProject.dao.repository.list;

public interface DEQueable<T> {
    void beginEnqueue(T data);

    void endEnqueue(T data);//C

    void enqueue(T data);       //C

    T front();                  //R

    T rear();                   //R

    void beginUpdate(T data);   //U

    void endUpdate(T data);     //U

    T dequeue();                //D

    T beginDequeue();

    T endDequeue();             //D

    int size();

    boolean isEmpty();

    boolean isFull();

    String print();

    String printEndToBegin();
}
