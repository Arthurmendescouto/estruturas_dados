import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        final int tamanho_vetor=5;

        int[] numeros=new int[tamanho_vetor];
        int soma=0;
        long multiplicacao=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("--- Leitura de 5 números Inteeiros ---");
        for (int i = 0; i <tamanho_vetor ; i++) {
            System.out.println("Digite o "+(i+1)+"º número inteiro: ");
            int numeroLido=sc.nextInt();
            numeros[i]=numeroLido;
            soma+=numeroLido;
            multiplicacao*=numeroLido;
        }
        sc.close();
        System.out.println("\\n--- Resultados ---");
        System.out.println("Os números digitados são: ");
        System.out.println("[");
        for (int i = 0; i <tamanho_vetor ; i++) {
            System.out.println(numeros[i]);
            if(i<tamanho_vetor-1){
                System.out.println(", ");
            }
        }
        System.out.println("]");
        System.out.println("A soma dos números é: "+soma);
        System.out.println("A multiplicação (produto) dos números é: "+multiplicacao);
    }
}
