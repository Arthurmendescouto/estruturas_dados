import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double[] numeros=new double[10];

        System.out.println("Digite 10 números reais:");
        for (int i = 0; i < numeros.length ; i++) {
            numeros[i]=sc.nextDouble();
        }
        System.out.println("\nNúmeros na ordem inversa:");
        for (int i = numeros.length-1; i >=0 ; i--) {
            System.out.println(numeros[i]+" ");
        }
        sc.close();
    }
}
