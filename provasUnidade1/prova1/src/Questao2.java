/*public class Questao2 {
    public String decToBin(String data) {
        int dividendo = Integer.parseInt(data);
        if (dividendo == 0) {return "0"; }

        Empilhavel pilha = new PilhaEstatica(32);
        while (dividendo != 0) {
            int resto = dividendo % 2;
            int quociente = dividendo / 2;
            dividendo = quociente;
            pilha.empilhar(resto);
        }
        return pilha.imprimir();
    }

    public static void main(String[] args) {
        Questao3 q3 = new Questao3();
        System.out.println(q3.decToBin("10"));
        System.out.println(q3.decToBin("255"));
        System.out.println(q3.decToBin("35"));
    }
}*/