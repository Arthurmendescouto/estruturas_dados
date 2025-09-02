
public class Main {
    public static void main(String[] args) {
        Queue fila = new Queue();
        fila.enqueue("1");
        System.out.println(fila.front());
        fila.enqueue("2");
        fila.enqueue("3");
        System.out.println(fila.dequeue());
        fila.startUpdate("4");
        fila.endUpdate("5");
        System.out.println(fila.print());

    }
}