import java.util.Random;

public class Ex24 {
    public static void main(String[] args) {
        int lancamentos=100;
        int[] resultados=new int[lancamentos];
        int[] contadores=new int[6];

        Random random=new Random();
        for (int i = 0; i <lancamentos ; i++) {
            int valor=random.nextInt(6)+1;
            resultados[i]=valor;
            contadores[valor-1]++;
        }
        System.out.println("Resultado dos "+lancamentos+" lançamentos:");
        for (int i = 0; i <contadores.length ; i++) {
            System.out.println("Número "+(i+1)+": "+contadores[i]+" vezes");
        }
    }
}
