public class ArvoreBinariaHeapMaxima {
    private Object[] data;
    int tail;

    public ArvoreBinariaHeapMaxima(Object[] data) {
        this.data = data;
        this.tail = -1;
    }

    public ArvoreBinariaHeapMaxima(int length) {
        data=new Object[length];
        tail=-1;
    }

    public void inserir(Object data){
        if (isFull()) {
            System.err.println("Heap Cheia!");
        }
    }
}
