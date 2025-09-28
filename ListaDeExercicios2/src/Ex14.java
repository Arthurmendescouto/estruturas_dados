import java.util.Arrays;

public class Ex14 {
    public static void main(String[] args) {
        int[] numeros={10,15,8,40,22};
        Arrays.sort(numeros);
        System.out.println("Array em ordem crescente: ");
        for (int num: numeros){
            System.out.println(num+" ");
        }
    }
}
