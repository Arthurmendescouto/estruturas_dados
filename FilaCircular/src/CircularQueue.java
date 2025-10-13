public class CircularQueue implements CircularQueueInterface {

    private int head;
    private int tail;
    private Object[] data;
    private int numberOfElements;

    public CircularQueue() {
        this(12);
    }

    public CircularQueue(int tamanho) {
        head = 0;
        tail = -1;
        data = new Object[tamanho];
        numberOfElements=0;
    }

    public void enqueue(Object item) {
        if (!isFull()) {
            tail=next(tail);
            data[tail] = item;
            numberOfElements++;
        } else {
            System.err.println("Fila está cheia");
        }
    }

    public Object dequeue() {
        Object dadoRetornado = null;
        if (!isEmpty()) {
            dadoRetornado = data[head];
            head=next(head);
            numberOfElements--;
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
        }else{
            System.err.println("A pilha está vazia!");
        }
    }

    public boolean isFull() {
        return (numberOfElements== data.length);
    }

    public boolean isEmpty() {
        return (numberOfElements==0);
    }

    public String print() {
        String resultado = "[";
        int pointerAux=head;
        for (int i = 0; i < numberOfElements; i++) {
        resultado +=data[pointerAux];
            if (i != numberOfElements-1) {
                resultado +=",";
                pointerAux=next(pointerAux);
            }
        }
        return resultado+ "]";
    }
    public int next(int pointer){
    return (pointer+1)%data.length;
    };
}