import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double[] notas=new double[4];
        double soma=0;

        System.out.println("Digite 4 notas:");
        for (int i = 0; i <notas.length ; i++) {
         notas[i]= sc.nextDouble();
         soma+=notas[i];
        }
        double media=soma/ notas.length;

        System.out.println("\nNotas digitadas:");
        for (double nota:notas) {
            System.out.println(nota+" ");
        }
        System.out.println("\nMédia"+media);
        sc.close();
    }
}
