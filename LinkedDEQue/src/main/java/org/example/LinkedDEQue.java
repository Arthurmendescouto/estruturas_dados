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
        DoubleNode<T> temp=new DoubleNode<>();
        temp.setData(data);
        if(!isEmpty()){
            head.setPrevious(temp);
        }else {
            tail=temp;
        }
        temp.setNext(head);
    head=temp;
    amount++;
    }

    public void endEnqueue(T data) {
        if(isFull()) {
            throw new NoSuchElementException("Fila Cheia!");
        }
        DoubleNode<T> temp=new DoubleNode<>();
        temp.setData(data);
        if(!isEmpty()){
            tail.setNext(temp);
        }else{
            head=temp;
        }
        temp.setPrevious(tail);
        tail=temp;
        amount++;

    }

    public void beginUpdate(T data) {
if(isEmpty()){
    throw new NoSuchElementException("Fila cheia!");
}
head.setData(data);
    }

    public void endUpdate(T data) {
        if(isEmpty()){
            throw new NoSuchElementException("Fila cheia!");
        }
        tail.setData(data);
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
        String res = "[";
        DoubleNode<T> nodeAux=head;
        for (int i = 0; i < amount; i++) {
            res += nodeAux.getData();
            if (i != amount - 1) {
                res += ", ";
            }
            nodeAux=nodeAux.getNext();
        }
        return res+"]";
    }

    public String printFront() {
        String res = "[";
        DoubleNode<T> nodeAux=tail;
        for (int i = 0; i < amount; i++) {
            res += nodeAux.getData();
            if (i != amount - 1) {
                res += ", ";
            }
            nodeAux=nodeAux.getPrevious();
        }
        return res+"]";
    }

    public T front() {
        if(isEmpty()){
            throw new NoSuchElementException("Fila vazia!");
        }
        return head.getData();
    }

    public T rear() {
        if(isEmpty()){
            throw new NoSuchElementException("Fila vazia!");
        }
        return tail.getData();
    }

    public boolean isEmpty() {
        return (amount==0);
    }

    public boolean isFull() {
        return (amount==capacity);
    }

}