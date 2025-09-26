import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        final int tamanho_vetor=10;

        int[] vetorA = new int[tamanho_vetor];
        int[] vetorB = new int[tamanho_vetor];
        int[] vetorC = new int[tamanho_vetor];
        int[] vetorD = new int[tamanho_vetor * 3];

        Scanner sc=new Scanner(System.in);
        lerVetor(sc,vetorA,"A");
        lerVetor(sc,vetorB,"B");
        lerVetor(sc,vetorC,"C");

        System.out.println("\n--- Realizando Intercalação ---");
        for (int i = 0; i <tamanho_vetor ; i++) {
            int indiceD_Base=3*i;
            vetorD[indiceD_Base]=vetorA[i];
            vetorD[indiceD_Base+1]=vetorB[i];            vetorD[indiceD_Base+2]=vetorC[i];
        }
        System.out.println("\n--- Vetor D (Intercalado) ---");
        exibirVetor(vetorD);
        sc.close();


    }
    private static void lerVetor(Scanner s,int[] vetor,String nome){
        System.out.println("\n--- Leitura do Vetor "+nome+" (10 elementos) ---");
        for (int i = 0; i < vetor.length ; i++) {
            System.out.println("Digite o " + (i + 1) + "º elemento do Vetor "+nome+": ");
        vetor[i]=s.nextInt();
        }

    }
    private static void exibirVetor(int[] vetor){
        System.out.println("Vetor: [");
        for (int i = 0; i < vetor.length ; i++) {
            System.out.println(vetor[i]);
            if(i< vetor.length-1){
                System.out.println(", ");
            }
        }
        System.out.println("]");
    }
}

