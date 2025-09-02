public class Queue implements QueueInterface {

    private int head;
    private int tail;
    private Object[] data;

    public Queue() {
        this(12);
    }

    public Queue(int tamanho) {
        head = 0;
        tail = -1;
        data = new Object[tamanho];
    }

    public void enqueue(Object item) {
        if (!isFull()) {
            tail++;
            data[tail] = item;
        } else {
            System.err.println("Fila está cheia");
        }
    }

    public Object dequeue() {
        Object dadoRetornado = null;
        if (!isEmpty()) {
            dadoRetornado = data[head];
            head++;
        } else {
            System.err.println("Fila vazia");
        }
        return dadoRetornado;
    }

    public Object front() {
        Object dadoRetornado = null;
        if (!isEmpty()) {
            dadoRetornado = data[head];
        } else {
            System.err.println("Fila vazia");
        }
        return dadoRetornado;
    }

    @Override
    public void startUpdate(Object item) {
        if (!isEmpty()) {
            data[head] = item;
        } else {
            System.err.println("Fila vazia");
        }
    }

    public void endUpdate(Object item) {
        if(!isEmpty()){
            data[tail] = item;
        }
    }

    public boolean isFull() {
        return (tail == data.length - 1);
    }

    public boolean isEmpty() {
        return (head > tail);
    }

    public String print() {
        String resultado = "";
        for (int i = head; i <= tail; i++) {
            if (i == tail) {
                resultado += data[i];
            } else {
                resultado += data[i] + ", ";
            }
        }
        return resultado;
    }
}