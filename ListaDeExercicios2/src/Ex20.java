import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex20 {
    public static void main(String[] args) {
        String[] palavras={"java", "python", "ruby", "java", "c++", "java"};
        String remover="java";

        System.out.println("Antes: "+ Arrays.toString(palavras));

        List<String> lista=new ArrayList<>(Arrays.asList(palavras));
        lista.removeIf(p->p.equals(remover));

        String[] resultado=lista.toArray(new String[0]);
        System.out.println("Depois: "+Arrays.toString(resultado));

    }
}
