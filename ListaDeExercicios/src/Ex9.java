import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        final int tamanho_vetor=10;
        int[] vetorA=new int[tamanho_vetor];

        long somaQuadrados=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("--- Leitura de 10 números inteiros ---");

        for (int i = 0; i <tamanho_vetor ; i++) {
            System.out.println("Digite o "+(i+1)+"º número inteiro: ");
            int numeroLido=sc.nextInt();
            vetorA[i]=numeroLido;

            long quadrado=(long) numeroLido*numeroLido;
            somaQuadrados+=quadrado;
        }
        sc.close();
        System.out.println("\n--- Resultados ---");

        System.out.println("Vetor A lido: [");
        for (int i = 0; i <tamanho_vetor ; i++) {
            System.out.println(vetorA[i]);
            if(i<tamanho_vetor-1){
                System.out.println(", ");
            }
        }
        System.out.println("]");
        System.out.println("A soma dos quadrados dos elementos do vetor é: "+somaQuadrados);
    }
}
