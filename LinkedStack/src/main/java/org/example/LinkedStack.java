package LinkedStack.src.main.java.org.example;

import java.util.NoSuchElementException;

/**
 * Implementação de uma pilha dinâmica duplamente encadeada genérica.
 * Esta classe implementa uma pilha que pode armazenar elementos de qualquer tipo,
 * utilizando uma estrutura de nós duplamente encadeados.
 *
 * @param <T> o tipo dos elementos armazenados na pilha
 * @author Arthur Mendes Couto
 * @version 1.1
 * @since 2025-06-04
 */
public class LinkedStack<T> implements Stackable<T> {
    /**
     * Ponteiro para o topo da pilha
     */

    private DoubleNode<T> topPointer;
    /**
     * Quantidade atual de elementos
     */
    private int numberElements;
    /**
     * Tamanho máximo da pilha
     */
    private int maxElements;

    /**
     * Construtor padrão que cria uma pilha com capacidade para 10 elementos.
     */
    public LinkedStack() {
        this(10);
    }

    public LinkedStack(int maxElements) {

    }

    /**
     * Retorna o elemento do topo da pilha sem removê-lo.
     *
     * @return o elemento do topo
     * @throws NoSuchElementException se a pilha estiver vazia
     */
    @Override

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Pilha Vazia!");
        }
        return topPointer.getData();
    }

    /**
     * Adiciona um elemento ao topo da pilha.
     *
     * @param data o elemento a ser adicionado
     * @throws NoSuchElementException se a pilha estiver cheia
     */
    @Override
    public void push(T data) {
        if (isFull()) {
            throw new NoSuchElementException("Stack is full!");
        }
        DoubleNode<T> newNode = new DoubleNode<>();
        newNode.setData(data);
        topPointer.setNext(newNode);
        newNode.setPrevious(topPointer);
        topPointer = newNode;
        numberElements++;
    }

    /**
     * Remove e retorna o elemento do topo da pilha.
     *
     * @return o elemento removido do topo
     * @throws NoSuchElementException se a pilha estiver vazia
     */
    @Override
    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty!");
        }
        T auxData = topPointer.getData();
        numberElements--;
        topPointer = topPointer.getPrevious();
        if (!isEmpty()) {
            topPointer.setNext(null);
        }
        return auxData;

    }

    @Override
    public void update(T newData) {
        if (isEmpty()) {
            throw new NoSuchElementException("Pilha Vazia!");
        }
        topPointer.setData(newData);

    }

    @Override
    public boolean isFull() {
        return (numberElements == maxElements);
    }

    @Override
    public boolean isEmpty() {
        return (numberElements == 0);
    }

    @Override
    public String print() {
        String resultado = "[";
        DoubleNode<T> ponteiroAux = topPointer;
        for (int i = 0; i < numberElements; i++) {
            resultado +=ponteiroAux.getData();
            if(!(i==numberElements-1)){
                resultado+=", ";
            }
            ponteiroAux=ponteiroAux.getPrevious();
        }
        return resultado+"]";
    }

}

