import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de n: ");
        int n = sc.nextInt();

        int[] numeros = new int[n];
        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();
        }
        Set<Integer> conjunto = new LinkedHashSet<>();
        for (int num : numeros) {
            conjunto.add(num);
        }

        int[]semDuplicados=new int[conjunto.size()];
        int i=0;
        for (int num:conjunto){
            semDuplicados[i++]=num;
        }
        System.out.println("Array sem elementos repetidos: ");
        for(int num:semDuplicados){
            System.out.println(num+ " ");
        }
        sc.close();

    }
}
