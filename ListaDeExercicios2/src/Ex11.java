public class Ex11 {
    public static void main(String[] args) {
        int[] numeros = {10, 15, 8, 23, 42, 7, 18};
        int soma=0;
        for(int num:numeros){
            soma+=num;
        }
        double media=(double) soma/numeros.length;
        System.out.println("Média dos elementos: "+media);

    }
}
