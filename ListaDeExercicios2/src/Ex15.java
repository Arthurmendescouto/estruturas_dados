import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Ex15 {
    public static void main(String[] args) {
        Integer[] numeros=new Integer[10];
        Random rand=new Random();

        for (int i = 0; i < numeros.length ; i++) {
            numeros[i]=rand.nextInt(100);
        }
        System.out.println("Array original: ");
        for (int num:numeros){
            System.out.println(num+" ");
        }
        System.out.println();
        Arrays.sort(numeros, Collections.reverseOrder());
        System.out.println("Array em ordem decrescente: ");
        for (int num:numeros){
            System.out.println(num+ " ");
        }
    }
}
