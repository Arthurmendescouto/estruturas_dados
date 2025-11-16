package LinkedDEQue.src.main.java.org.example;


import CarProject.dao.repository.list.DEQueable;

import java.util.NoSuchElementException;


public class LinkedDEQue<T> implements DEQueable<T> {
    private int amount;
    private int capacity;
    private DoubleNode<T> head;
    private DoubleNode<T> tail;

    private DoubleNode<T> headPointer;

    private DoubleNode<T> tailPointer;

    /** Tamanho máximo da ED */
    private int length;

    /**
     * Construtor padrão que cria uma fila com capacidade para 10 elementos.
     */
    public LinkedDEQue() {
        this(10);
    }

    /**
     * Construtor que cria uma fila com capacidade personalizada.
     *
     * @param length a capacidade máxima da fila
     */
    public LinkedDEQue(int length) {
        headPointer = null;
        tailPointer = null;
        amount = 0;
        this.length = length;
    }

    /**
     * Remove e retorna um elemento do início da fila.
     *
     * @return o elemento removido do início da fila
     * @throws NoSuchElementException se a fila estiver vazia
     */
    @Override
    public T dequeue() {
        if(isEmpty()) {
            throw new NoSuchElementException("Fila Vazia!");
        }
        T data = headPointer.getData();
        headPointer = headPointer.getNext();
        amount--;
        if (!isEmpty()) {
            headPointer.setPrevious(null);
        } else {
            headPointer = null;
            tailPointer = null;
        }
        return data;
    }
    @Override
    public T beginDequeue() {
        return dequeue();
    }

    /**
     * Remove e retorna um elemento do fim da fila.
     *
     * @return o elemento removido do fim da fila
     * @throws NoSuchElementException se a fila estiver vazia
     */
    @Override
    public T endDequeue() {
        if(isEmpty()) {
            throw new NoSuchElementException("Fila Vazia!");
        }
        T data = tailPointer.getData();
        tailPointer = tailPointer.getPrevious();
        amount--;
        if (!isEmpty()) {
            tailPointer.setNext(null);
        } else {
            headPointer = null;
            tailPointer = null;
        }
        return data;
    }

    /**
     * Adiciona um elemento ao início da fila.
     *
     * @param data o elemento a ser adicionado
     * @throws java.util.NoSuchElementException se a fila estiver cheia
     */
    @Override
    public void beginEnqueue(T data) {
        if (isFull()) {
            throw new NoSuchElementException("Pilha Cheia!");
        }
        DoubleNode<T> tempNode = new DoubleNode<T>(data);
        tempNode.setData(data);

        if (!isEmpty()) {
            headPointer.setPrevious(tempNode);
        } else {
            tailPointer = tempNode;
        }

        tempNode.setNext(headPointer);
        headPointer = tempNode;
        amount++;
    }

    @Override
    public void endEnqueue(T data) {
        if (isFull()) {
            throw new NoSuchElementException("Fila Cheia!");
        }
        DoubleNode<T> tempNode = new DoubleNode<T>(data);
        tempNode.setData(data);

        if (!isEmpty()) {
            tailPointer.setNext(tempNode);
        } else {
            headPointer = tempNode;
        }

        tempNode.setPrevious(tailPointer);
        tailPointer = tempNode;
        amount++;
    }
    /**
     * Adiciona um elemento ao fim da fila.
     *
     * @param data o elemento a ser adicionado
     * @throws NoSuchElementException se a fila estiver cheia
     */
    @Override
    public void enqueue(T data) {
        if (isFull()) {
            throw new NoSuchElementException("Pilha Cheia!");
        }
        DoubleNode<T> tempNode = new DoubleNode<T>(data);
        tempNode.setData(data);

        if (!isEmpty()) {
            tailPointer.setNext(tempNode);
        } else {
            headPointer = tempNode;
        }

        tempNode.setPrevious(tailPointer);
        tailPointer = tempNode;
        amount++;
    }

    /**
     * Retorna o elemento do início da fila sem removê-lo.
     *
     * @return o elemento do início
     * @throws NoSuchElementException se a fila estiver vazia
     */
    @Override
    public T front() {
        if(isEmpty()) {
            throw new NoSuchElementException("Fila Vazia!");
        }
        return headPointer.getData();
    }

    /**
     * Retorna o elemento do fim da fila sem removê-lo.
     *
     * @return o elemento do fim
     * @throws java.util.NoSuchElementException se a fila estiver vazia
     */
    @Override
    public T rear() {
        if(isEmpty()) {
            throw new NoSuchElementException("Fila Vazia!");
        }
        return tailPointer.getData();
    }

    /**
     * Atualiza o elemento do início da fila.
     *
     * @param data o novo elemento
     * @throws NoSuchElementException se a fila estiver vazia
     */
    @Override
    public void beginUpdate(T data) {
        if(isEmpty()) {
            throw new NoSuchElementException("Fila Vazia!");
        }
        headPointer.setData(data);
    }

    /**
     * Atualiza o elemento do fim da fila.
     *
     * @param data o novo elemento
     * @throws NoSuchElementException se a fila estiver vazia
     */
    @Override
    public void endUpdate(T data) {
        if(isEmpty()) {
            throw new NoSuchElementException("Fila Vazia!");
        }
        tailPointer.setData(data);
    }

    /**
     * Verifica se a fila está cheia.
     *
     * @return true se a fila estiver cheia, false caso contrário
     */
    @Override
    public boolean isFull() {
        return (amount == length);
    }

    /**
     * Verifica se a fila está vazia.
     *
     * @return true se a fila estiver vazia, false caso contrário
     */
    @Override
    public boolean isEmpty() {
        return (amount == 0);
    }

    /**
     * Retorna uma representação em string da fila do início para o final.
     * Os elementos são separados por vírgula e delimitados por colchetes.
     *
     * @return string representando a fila do início para o final
     */
    @Override
    public String print() {
        String result = "";
        DoubleNode<T> auxNode = headPointer;
        for (int i = 0; i < amount; i++) {
            result += auxNode.getData();
            if (i != amount-1) {
                result +=  ",";
            }
            auxNode = auxNode.getNext();
        }
        return "[" + result + "]";
    }

    /**
     * Retorna uma representação em string da fila do fim para o início.
     * Os elementos são separados por vírgula e delimitados por colchetes.
     *
     * @return string representando a fila do fim para o início
     */
    @Override
    public String printEndToBegin() {
        String result = "";
        DoubleNode<T> auxNode = tailPointer;
        for (int i = 0; i < amount; i++) {
            result += auxNode.getData();
            if (i != amount-1) {
                result +=  ",";
            }
            auxNode = auxNode.getPrevious();
        }
        return "[" + result + "]";
    }
    public int size() {
        return amount;
    }
}