import java.util.Arrays;

public class Ex34 {
    public static void main(String[] args) {
        int[] numeros={10,20,30,40};
        System.out.println("Antes: "+ Arrays.toString(numeros));

        int novoElemento=99;
        int posicao=2;

        int[] novoArray=new int[numeros.length+1];

        for (int i = 0; i <posicao ; i++) {
            novoArray[i]=numeros[i];
        }
        novoArray[posicao]=novoElemento;

        for (int i = posicao; i < numeros.length ; i++) {
            novoArray[i+1]=numeros[i];
        }

        numeros=novoArray;

        System.out.println("Depois: "+Arrays.toString(numeros));
    }
}
