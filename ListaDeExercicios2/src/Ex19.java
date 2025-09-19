import java.util.Arrays;

public class Ex19 {
    public static void main(String[] args) {
        String[] palavras={"java","Python","Ruby"};
        System.out.println("Antes: "+ Arrays.toString(palavras));

        for (int i = 0; i < palavras.length/2 ; i++) {
            String temp=palavras[i];
            palavras[i]=palavras[palavras.length-1-i];
            palavras[palavras.length-1-i]=temp;
        }
        System.out.println("Depois da inversão: "+Arrays.toString(palavras));
    }
}
