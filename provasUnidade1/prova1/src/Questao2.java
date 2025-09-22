public class Questao2 {
    public static void main(String[] args) {

    }
    public interface Operations{
        void push();
        String pop();
        String peak();
        boolean isFull();
        boolean isEmpty();
        void decToBin(String data);
    }
    public class Stack implements Operations{
        public void decToBin(String data){
        int dividendo=Integer.parseInt(data);
        int resto=dividendo%2;
        int quociente=dividendo/2;
        }
    }
}
