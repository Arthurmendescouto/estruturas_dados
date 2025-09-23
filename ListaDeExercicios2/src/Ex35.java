import java.util.Arrays;

public class Ex35 {
    public static void main(String[] args) {
        int[] numeros={10,20,30,40};
        System.out.println("Antes: "+ Arrays.toString(numeros));

        int posicao=2;

        int[] novoArray=new int[numeros.length-1];

        for (int i = 0; i <posicao ; i++) {
            novoArray[i]=numeros[i];
        }
        for (int i = 0; i < novoArray.length ; i++) {
            novoArray[i]=numeros[i+1];
        }
        numeros=novoArray;

        System.out.println("Depois: "+Arrays.toString(numeros));
    }
}
