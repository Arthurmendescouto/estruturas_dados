import java.util.Scanner;

public class Ex26 {

    public static boolean isPrimo(int num){
        if(num<2){
            return false;
        }
        for (int i = 2; i <Math.sqrt(num) ; i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite quantos números primos você quer gerar: ");
        int n=sc.nextInt();

        int[] primos=new int[n];
        int count=0;
        int numero=2;

        while (count<n){
            if(isPrimo(numero)){
                primos[count]=numero;
                count++;
            }
            numero++;
        }

        System.out.println("Os "+n+"primeiros números primos são:");
        for (int i = 0; i <n ; i++) {
            System.out.println(primos[i]+" ");
        }

    }
}

