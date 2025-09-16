import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite quantos números você deseja armazenar no Array");
        int tamanho=sc.nextInt();
        int[] array=new int[tamanho];
        System.out.println("Digite o valor que será adicionado");
        for (int i = 0; i <tamanho ; i++) {
            array[i]=sc.nextInt();
        }
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Posição "+i+":"+array[i]);
        }
    }
}
