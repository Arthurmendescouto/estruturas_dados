package LinkedList;

public class DoubleNode<T> {

    /** O dado armazenado no nó */
    private T dado;

    /** Referência para o nó anterior */
    private DoubleNode<T> prior;

    /** Referência para o próximo nó */
    private DoubleNode<T> next;

    /**
     * Retorna o dado armazenado no nó.
     *
     * @return o dado do nó
     */

    public T getDado() {
        return dado;
    }
    /**
     * Define o dado a ser armazenado no nó.
     *
     * @param dado o novo dado
     */
    public void setDado(T dado) {
        this.dado = dado;
    }
    /**
     * Retorna a referência para o nó anterior.
     *
     * @return o nó anterior
     */
    public DoubleNode<T> getPrior() {
        return prior;
    }

    /**
     * Define a referência para o nó anterior.
     *
     * @param prior o novo nó anterior
     */
    public void setPrior(DoubleNode<T> prior) {
        this.prior = prior;
    }
    /**
     * Retorna a referência para o próximo nó.
     *
     * @return o próximo nó
     */
    public DoubleNode<T> getNext() {
        return next;
    }
    /**
     * Define a referência para o próximo nó.
     *
     * @param next o novo próximo nó
     */
    public void setNext(DoubleNode<T> next) {
        this.next = next;
    }
}