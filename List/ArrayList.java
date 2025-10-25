package List;

public class ArrayList implements Listable {
    private Object[] data;
    private int head;
    private int tail;
    private int numberElements;

    public ArrayList() {
        this(10);
    }

    public ArrayList(int length) {
        data = new Object[length];
        head = 0;
        tail = -1;
        numberElements = 0;
    }

    @Override
    public void insert(int index, Object item) {
        if (isFull()) {
            System.out.println("List is full!");
            return;
        }
        if (index < 0 || index > numberElements) {
            System.err.println("Invalided Index");
            return;
        }
        if (index < numberElements / 2) {
            int physicalIndex = map(index);
            int aux = head;
            for (int i = 0; i < index; i++) {
                data[prior(aux)] = data[aux];
                aux = next(aux);
            }
            data[physicalIndex] = item;
            head = prior(head);
        } else {
            int physicalIndex = map(index);
            int aux = tail;
            for (int i = 0; i < numberElements - index; i++) {
                data[next(aux)] = data[aux];
                aux = prior(aux);
            }
            data[physicalIndex] = item;
            tail = next(tail);
        }
        numberElements++;
    }

    @Override
    public Object delete(int index) {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return null;

        }
        if (index < 0 || index >= numberElements) {
            System.err.println("Invalided Index");
            return null;
        }
        int physicalIndex = map(index);
        Object removedElement=data[physicalIndex];
        int aux = physicalIndex;
        if (index < data.length / 2) {
            for (int i = 0; i <index ; i++) {
                data[aux]=data[prior(aux)];
                aux=prior(aux);
                head=next(head);
            }
        } else {
            for (int i = 0; i < numberElements - index - 1; i++) {
                data[aux] = data[next(aux)];
                aux = next(aux);
            }
            tail = prior(tail);
        }
        numberElements--;
        return removedElement;
    }

    @Override
    public void append(Object item) {
        if (!isFull()) {
            tail = next(tail);
            data[tail] = item;
            numberElements++;
        } else {
            System.err.println("A lista está cheia!");
        }
    }

    @Override
    public void update(int index, Object item) {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return;
        }
        if (index < 0 || index >= numberElements) {
            System.err.println("Invalid Index");
            return;
        }
        int physicalIndex = map(index);
        data[physicalIndex] = item;
    }

    @Override
    public boolean isEmpty() {
        return numberElements == 0;
    }

    @Override
    public boolean isFull() {
        return numberElements == data.length;
    }

    @Override
    public String print() {
        String result = "";
        int aux = head;
        for (int i = 0; i < numberElements; i++) {
            result += data[aux];
            aux = next(aux);
            if (i != numberElements - 1) {
                result += ", ";
            }
        }
        return result;
    }

    @Override
    public void clear() {
        head = 0;
        tail = -1;
        numberElements = 0;
    }

    @Override
    public Object select(int logicIndex) {
        Object itemAux = null;
        if (!isEmpty()) {
            if ((logicIndex >= 0) && (logicIndex < numberElements)) {
                int physicalIndex = map(logicIndex);
                itemAux = data[physicalIndex];
            } else {
                System.err.println("Indice Invalido!");
            }
        } else {
            System.err.println("Lista Vazia!");
        }
        return itemAux;

    }

    @Override
    public Object[] selectAll() {
        Object[] dataAux = null;
        if (!isEmpty()) {
            dataAux = new Object[numberElements];
            int pointerAux = head;
            for (int i = 0; i < numberElements; i++) {
                dataAux[i] = data[pointerAux];
                pointerAux = next(pointerAux);
            }
        } else {
            System.err.println("Lista está vazia!");
        }
        return dataAux;
    }

    private int next(int index) {
        return (data.length + index + 1) % data.length;
    }

    private int prior(int index) {
        return (data.length + index - 1) % data.length;
    }

    private int map(int index) {
        return (index + head) % data.length;
    }
}
