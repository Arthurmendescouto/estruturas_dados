public class Ex9 {
    public static void main(String[] args) {
        int[] numeros={10,15,8,23,42,7,18};
        int contPares=0;

        for (int num:numeros
        ) {
            if (num%2==0) {
                contPares++;
            }
        }
        System.out.println("Quantidade de números pares: "+ contPares);
    }
}