import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        final int tamanho_vetor = 10;

        int[] vetorA = new int[tamanho_vetor];
        int[] vetorB = new int[tamanho_vetor];
        int[] vetorC = new int[tamanho_vetor * 2];

        Scanner sc = new Scanner(System.in);

        System.out.println("--- Leitura do Vetor A (10 elementos) ---");
        for (int i = 0; i < tamanho_vetor; i++) {
            System.out.println("Digite o " + (i + 1) + "º elemento do Vetor A: ");
            vetorA[i] = sc.nextInt();
        }

        System.out.println("--- Leitura do Vetor B (10 elementos) ---");
        for (int i = 0; i < tamanho_vetor; i++) {
            System.out.println("Digite o " + (i + 1) + "º elemento do Vetor B: ");
            vetorB[i] = sc.nextInt();
        }
        for (int i = 0; i < tamanho_vetor; i++) {
            int indiceC_A = 2 * i;
            int indiceC_B = 2 * i + 1;
            vetorC[indiceC_A]=vetorA[i];
            vetorC[indiceC_B]=vetorB[i];
        }
        System.out.println("\n--- Vetor C (Intercalado) ---");
        System.out.println("Vetor C: [");
        for (int i = 0; i <vetorC.length ; i++) {
            System.out.println(vetorC[i]);
            if(i<vetorC.length-1){
                System.out.println(", ");
            }
        }
        System.out.println("]");
        sc.close();
    }
}
