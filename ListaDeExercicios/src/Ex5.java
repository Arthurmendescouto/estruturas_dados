import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        int[] vetorPrincipal=new int[20];

        int[] vetorPar=new int[20];
        int[] vetorImpar=new int[20];

        int countPar=0;
        int countImpar=0;

        Scanner sc=new Scanner(System.in);

        System.out.println("--- Leitura de 20 números ---");

        for (int i = 0; i <20 ; i++) {
            System.out.println("Digite o "+(i+1)+"º número inteiro: ");

        int numeroLido=sc.nextInt();
        vetorPrincipal[i]=numeroLido;

        if(numeroLido%2==0){
            vetorPar[countPar]=numeroLido;
            countPar++;
        }else{
            vetorImpar[countImpar]=numeroLido;
            countImpar++;
        }
        }
        sc.close();
        System.out.println("\n--- Resultados ---");
        imprimir
    }
    public static  void imprimirVetor(String titulo, int[] vetor, int tamanhoReal){
        System.out.println("\n"+titulo+":");
        System.out.println("[");
        for (int i = 0; i <tamanhoReal ; i++) {
            System.out.println(vetor[i]);
            if(i<tamanhoReal-1){
                System.out.println(", ");
            }
        }
        System.out.println("]");
    }
}
