package LinkedDEQue.src.main.java.org.example;


import java.util.NoSuchElementException;


public class LinkedDEQue<T> implements Queueable<T> {
    private int amount;
    private int capacity;
    private DoubleNode<T> head;
    private DoubleNode<T> tail;

    public LinkedDEQue() {
        this(10);
    }

    public LinkedDEQue(int capacity) {
        this.amount = 0;
        this.capacity = capacity;
        this.head = null;
        this.tail = null;
    }

    public void beginEnqueue(T data) {
        if(isFull()) {
            throw new NoSuchElementException("Fila Cheia!");
        }
        
    }

    public void endEnqueue(T data) {

    }

    public void beginUpdate(T data) {

    }

    public void endUpdate(T data) {

    }


    public T beginDequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Fila vazia!");
        }
        amount--;
        T auxData = head.getData();
        head = head.getNext();
        if (isEmpty()) {
            head.setPrevious(null);
        } else {
            tail = null;
        }
        return auxData;
    }

    public T endDequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Fila vazia!");
        }
        amount--;
        T auxData = tail.getData();
        tail = tail.getPrevious();
        if (!isEmpty()) {
            tail.setNext(null);
        } else {
            head = null;
        }

        return auxData;
    }

    public String printRear() {
        String res = "";
        for (int i = 0; i < amount; i++) {
            res += auxPointer.getData();
            if (i != amount - 1) {
                res += ", ";
            }
        }
    }

    public String printFront() {

    }

    public T front() {
    }

    public T rear() {
    }

    public boolean isEmpty() {
    }

    public boolean isFull() {
    }

}