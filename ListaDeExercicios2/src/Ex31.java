import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int n = sc.nextInt();
        
        int[] array=new int[n];
        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < n; i++) {
            array[i]=sc.nextInt();
        }

        System.out.println("Digite quantas posições deseja rotacionar: ");
        int k=sc.nextInt();
        sc.close();
        k=k%n;

        for (int r = 0; r < k; r++) {
        int primeiro=array[0];
            for (int i = 0; i <n-1 ; i++) {
                array[i]=array[i+1];
            }
            array[n-1]=primeiro;
        }
        System.out.println("Array rotacionado: ");
        for(int num: array){
            System.out.println(num+" ");
        }
    }
}
