import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite o tamanho do array:");
        int tamanho= sc.nextInt();

        int[] array=new int[tamanho];

        System.out.println("Digite os elementos do array: ");
        for (int i = 0; i <tamanho ; i++) {
            array[i]= sc.nextInt();
        }
        boolean palindromo=true;
        for(int i=0;i<tamanho/2;i++){
            if(array[i] !=array[tamanho-1-i]){
                palindromo=false;
                break;
            }
        }
        if(palindromo){
            System.out.println("O array é um palíndromo!");
        }else{
            System.out.println("O array não é um palindromo.");
        }
    }
}
