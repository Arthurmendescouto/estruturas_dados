import java.util.Arrays;
import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayOriginal = {10, 20, 30, 40, 50};
        System.out.println("Array original: ");
        for (int num:arrayOriginal){
            System.out.println(num+ " ");
        }
        System.out.println();
        System.out.println("Informe o novo elemento: ");
        int novoElemento=sc.nextInt();

        System.out.println("Informe a posição para inserção (0 a "+ arrayOriginal.length+"): ");
        int posicao= sc.nextInt();

        if(posicao<0||posicao>arrayOriginal.length){
            System.out.println("Posição inválida!");
            sc.close();
            return;
        }

        int[] novoArray=new int[arrayOriginal.length+1];
        for (int i = 0,j=0; i <novoArray.length ; i++) {
            if(i==posicao){
                novoArray[i]=novoElemento;
            }else {
                novoArray[i]=arrayOriginal[j];
                j++;
            }
        }
        System.out.println("Novo array: ");
        for (int num: novoArray){
            System.out.println(num+" ");
        }
        sc.close();

    }
}
