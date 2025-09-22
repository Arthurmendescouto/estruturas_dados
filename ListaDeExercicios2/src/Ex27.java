import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite um número n: ");
        int n=scanner.nextInt();

        ArrayList<Integer> perfeitos=new ArrayList<>();

        for (int i = 1; i <n ; i++) {
            if(isPerfect(i)){
                perfeitos.add(i);
            }
        }
        System.out.println("Números perfeitos menores que "+n+": "+perfeitos);
        scanner.close();
    }
    public static boolean isPerfect(int num){
        int soma=0;
        for (int i = 1; i <=num/2 ; i++) {
        if(num% i==0){
            soma+=i;
        }
    }
        return soma==num;
    }
}
