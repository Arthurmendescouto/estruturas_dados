import java.util.Arrays;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite o tamanho do array: ");
        int n=sc.nextInt();

        int[] array=new int[n];
        System.out.println("Digite os elementos do array");
        for (int i = 0; i <n ; i++) {
            array[i]=sc.nextInt();
        }
        for (int i = 0; i <n ; i++) {
            if(array[i]<0){
                array[i]=0;
            }
        }
        System.out.println("Array após substituir negativos por zero:");
        System.out.println(Arrays.toString(array));
        sc.close();
    }
}
