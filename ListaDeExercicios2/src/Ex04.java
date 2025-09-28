import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Quantos números você quer inserir?");
        int n=sc.nextInt();

        int[] numeros=new int[n];

        for (int i = 0; i <n ; i++) {
            System.out.println("Digite o número "+ (i+1)+": ");
            numeros[i]= sc.nextInt();
        }

        int maior=numeros[0];
        int menor=numeros[0];
        for (int i = 1; i <n ; i++) {
            if (numeros[i]>maior){
                maior=numeros[i];
            }
            if(numeros[i]<menor){
                menor=numeros[i];
            }

        }
        System.out.println("\nMaior número: " + maior);
        System.out.println("Menor número: " + menor);

        sc.close();
    }
}
