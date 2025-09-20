import java.util.Arrays;

public class Ex21 {
    public static void main(String[] args) {
        char[] caracteres={'j','a','c','n'};
        System.out.println("Antes:"+ Arrays.toString(caracteres));

        for (int i = 0; i < caracteres.length ; i++) {
            if(isVogal(caracteres[i])){
                caracteres[i]='*';
            }
        }
        System.out.println("Depois: "+Arrays.toString(caracteres));
    }
    public static boolean isVogal(char c){
        c=Character.toLowerCase(c);
        return c=='a'||c=='e'|| c=='i'|| c=='o' ||c=='u';
    }
}
