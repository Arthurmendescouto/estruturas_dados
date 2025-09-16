import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite o valor de N: ");
        int n=sc.nextInt();

        int[] quadrados=new int[n];

        for (int i = 0; i <n ; i++) {
            quadrados[i]=(i+1)*(i+1);
        }

        System.out.println("Quadrados de 1 até "+n+":");
        for (int i = 0; i <n ; i++) {
            System.out.println((i+1)+"^2= "+quadrados[i]);
        }
        sc.close();
        
    }
}
