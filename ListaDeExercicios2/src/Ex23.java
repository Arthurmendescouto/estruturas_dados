import java.util.Arrays;

public class Ex23 {
    public static void main(String[] args) {
        int[] array1={1,2,3,4};
        int[] array2={5,6,7};

        int[] novoArray=new int[array1.length+array2.length];
        for (int i = 0; i <array1.length; i++) {
        novoArray[i]=array1[i];
        }
        for (int i = 0; i <array1.length; i++) {
            novoArray[array1.length+i]=array2[i];
        }
        System.out.println("Novo array: ");
        for (int num: novoArray){
            System.out.println(num+" ");
        }
    }
}
