import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        int[] numeros={10,14,232,52,33};
        Scanner sc=new Scanner(System.in);

        System.out.println("Digite o valor a ser procurado: ");
        int valor=sc.nextInt();
        int index=-1;

        for (int i = 0; i < numeros.length ; i++) {
            if(numeros[i]==valor){
                index=i;
                break;
            }
        }
        System.out.println("Índice da primeira ocorrência: "+index);
        sc.close();
    }
}
