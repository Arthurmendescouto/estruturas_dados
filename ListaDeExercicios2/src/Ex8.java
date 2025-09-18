public class Ex8 {
    public static void main(String[] args) {
        int[] numeros={2,4,6,8,10};
        int multiplicador=3;
        System.out.println("Array original");
        for (int num:numeros
        ) {
            System.out.println(num+" ");
        }
        for (int i = 0; i < numeros.length ; i++) {
            numeros[i]*=multiplicador;
        }
        System.out.println("\n\nArray após multiplicação por"+multiplicador+":");
        for (int num:numeros
        ) {
            System.out.println(num+" ");
        }
    }

}