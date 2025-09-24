import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        char[] caracteres=new char[10];
        int contadorConsoantes=0;

        System.out.println("Digite 10 caracteres (letras):");

        for (int i = 0; i < caracteres.length; i++) {
            caracteres[i]=sc.next().charAt(0);

            if(Character.isLetter(caracteres[i]) && !isVogal(caracteres[i])){
                contadorConsoantes++;
            }
        }
        System.out.println("\nForam lidas "+contadorConsoantes+" consoantes:");
        for (char c:caracteres){
            if(Character.isLetter(c) && !isVogal(c)){
                System.out.println(c+" ");
            }
        }
        sc.close();
    }
    private static boolean isVogal(char c){
        c=Character.toLowerCase(c);
        return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
    }
}
