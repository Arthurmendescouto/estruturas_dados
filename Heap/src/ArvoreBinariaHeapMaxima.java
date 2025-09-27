public class ArvoreBinariaHeapMaxima {
    private Object[] data;
    int tail;

    public ArvoreBinariaHeapMaxima() {
        this(15);
    }

    public ArvoreBinariaHeapMaxima(int length) {
        data = new Object[length];
        tail = -1;
    }

    public int parent(int son) {
        return (son - 1) / 2;
    }

    public int leftSon(int son) {
        return (son * 2) + 1;
    }

    public int rightSon(int son) {
        return (son * 2) + 2;
    }

    public void enqueue(Object data) {
        Object temp = null;
        if (isFull()) {
            System.err.println("Heap is full!");
        } else {
            tail++;
            this.data[tail] = data;
            heapifyUp(tail);
        }

    }


    private void swap(int index1, int index2) {
        Object temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }

    private void heapifyUp(int index) {
        int temp = parent(index);
        while ((Integer) data[index] > (Integer) data[temp]) {
            swap(index, temp);
            index = temp;
            temp = parent(index);
        }
    }

    private void heapifyDown(int index) {
        int leftSon = leftSon(index);
        int rightSon = rightSon(index);

        while(leftSon<tail || rightSon<tail && (Integer)data[leftSon]<(Integer)data[tail]||(Integer)data[rightSon]<(Integer)data[tail]){
            if(leftSon<tail && (Integer)data[leftSon]>(Integer)data[rightSon]){
                swap(index,leftSon);
                index=leftSon;
            }else{
                swap(index,rightSon);
                index=rightSon;
            }
            leftSon=leftSon(index);
            rightSon=rightSon(index);

        }

    }


    public boolean isEmpty() {
        return tail == -1;
    }

    public boolean isFull() {
        return tail == data.length - 1;
    }
}
