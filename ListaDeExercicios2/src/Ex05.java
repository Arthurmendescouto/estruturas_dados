import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[20];
        int[] pares = new int[20];
        int[] impares = new int[20];
        int contPar = 0, contImpar = 0;

        System.out.println("Digite 20 números inteiros:");
        for (int i = 0; i < 20; i++) {
            numeros[i] = sc.nextInt();
            if (numeros[i] % 2 == 0) {
                pares[contPar] = numeros[i];
                contPar++;
            }else{
                impares[contImpar]=numeros[i];
                contImpar++;
            }
        }

        System.out.print("\nVetor completo: [");
        for (int i = 0; i < numeros.length ; i++) {
            if(i<numeros.length-1){
                System.out.print(numeros[i]+", ");
            }else {
                System.out.print(numeros[i]);
            }
        }
        System.out.print("]");

        System.out.print("\nVetor par: [");
        for (int i = 0; i < contPar ; i++) {
            if(i<contPar-1){
                System.out.print(pares[i]+", ");
            }else {
                System.out.print(pares[i]);
            }
        }
        System.out.print("]");

        System.out.print("\nVetor ímpar: [");
        for (int i = 0; i < contImpar ; i++) {
            if(i<contImpar-1){
                System.out.print(impares[i]+", ");
            }else {
                System.out.print(impares[i]);
            }
        }
        System.out.print("]");

        sc.close();
    }
}
