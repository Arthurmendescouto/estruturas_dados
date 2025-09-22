import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite o valor de n: ");
        int n= sc.nextInt();
        if(n<=0){
            System.out.println("n deve ser maior que 0");
        }else {
            int[] fibonacci=new int[n];

            for (int i = 0; i <n ; i++) {
              if(i==0){
                  fibonacci[i]=0;
              }else if(i==1){

              }else{
                  fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
              }
            }
            System.out.println("Sequência de Fibonacci: ");
            for (int i = 0; i <n ; i++) {
                System.out.println(fibonacci[i]+" ");
            }
        }
        sc.close();

    }
}
