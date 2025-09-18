import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        int[] numeros= {10, 15, 8, 23, 42, 7, 18};
        Scanner sc=new Scanner(System.in);

        System.out.println("Digite um valor para procurar no array: ");
        int valor=sc.nextInt();

        boolean encontrado=false;

        for (int num:numeros){
            if(num==valor){
                encontrado=true;
                break;
            }
        }
        if(encontrado){
            System.out.println("O valor "+valor+" está presente no array");
        }else {
            System.out.println("O valor "+valor+" não está presente no array");
        }
        sc.close();
    }
}
