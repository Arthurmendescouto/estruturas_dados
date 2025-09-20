import java.util.Arrays;

public class Ex22 {
    public static void main(String[] args) {
        char[] caracteres={'j','b','c'};
        System.out.println("Array: "+Arrays.toString(caracteres));

        int contador=0;
        System.out.print("As vogais que aparecem são: ");

        for (char c:caracteres){
            if(isVogal(c)){
                System.out.print(c+" ");
                contador++;
            }
        }
        System.out.println();
        System.out.println("Número de vogais: "+contador);
    }
    public static boolean isVogal(char c){
        c=Character.toLowerCase(c);
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
}
