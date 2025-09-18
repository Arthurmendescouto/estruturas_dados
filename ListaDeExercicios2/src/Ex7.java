public class Ex7 {
    public static void main(String[] args) {
        int[] numeros={5,8,12,3,7,9,4};
        int soma=0;
        for (int i = 0; i < numeros.length ; i+=2) {
            soma+=numeros[i];
        }

        System.out.println("A soma dos elementos nas posições pares é: "+soma);
    }
}