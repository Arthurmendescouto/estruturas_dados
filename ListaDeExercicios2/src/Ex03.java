import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de N: ");
        int n=sc.nextInt();

        int[] numeros=new int[n];

        for(int i=0;i<n;i++){
            numeros[i]=n-i;
        }

        System.out.println("Array em ordem inversa:");
        for (int i = 0; i <n ; i++) {
            System.out.println(numeros[i]+" ");
        }
        sc.close();
    }
}
