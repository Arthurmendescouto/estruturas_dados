import java.util.Arrays;

public class Ex33 {
    public static void main(String[] args) {
        int[] numeros={10,20,30,40};
        System.out.println("Antes: "+ Arrays.toString(numeros));

        int novoElemento=50;
        int[] novoArray=new int[numeros.length+1];

        for (int i = 0; i <numeros.length ; i++) {
         novoArray[i]=numeros[i];
        }

        novoArray[numeros.length]=novoElemento;

        numeros=novoArray;

        System.out.println("Depois: "+Arrays.toString(numeros));
    }
}
