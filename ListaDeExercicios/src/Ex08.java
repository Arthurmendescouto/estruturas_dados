import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        final int num_pessoas=5;
        int[] idades=new int[num_pessoas];
        double[] alturas=new double[num_pessoas];
        Scanner sc=new Scanner(System.in);
        System.out.println("--- Leitura de idade e altura para "+num_pessoas+" Pessoas ---");

        for (int i = 0; i <num_pessoas ; i++) {
            System.out.println("\n--- Pessoa "+(i+1)+" ---");

            System.out.println("Digite a idade: ");
            idades[i]=sc.nextInt();

            System.out.println("Digite a altura(ex: 1,75): ");
            alturas[i]=sc.nextDouble();
            }
        sc.close();
        System.out.println("\n==============================================");
        System.out.println("--- Dados na Ordem Inversa (da última pessoa para a primeira) ---");
        for (int i = num_pessoas; i >=0 ; i++) {
            System.out.println("Pessoa "+(i+1)+":");
            System.out.println(" Idade: "+idades[i]+" anos");
            System.out.printf(" Altura: %.2f metros%n",alturas[i]);
        }
        System.out.println("==============================================");

    }
    }
