import java.util.Arrays;

public class Ex17 {
    public static void main(String[] args) {
        int[] array1={1,2,3,4,5};
        int[] array2={2,4,5,1,20};
        int[] array3={1,2,3,4,5};

        System.out.println("array1 e array2 são iguais? "+ Arrays.equals(array1,array2));
        System.out.println("array1 e array2 são iguais? "+ Arrays.equals(array1,array3));
    }
}
