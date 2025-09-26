import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        final int num_meses = 12;

        double[] temperaturas = new double[num_meses];
        String[] nomesMeses = {
                "1 - Janeiro", "2 - Fevereiro", "3 - Março", "4 - Abril",
                "5 - Maio", "6 - Junho", "7 - Julho", "8 - Agosto",
                "9 - Setembro", "10 - Outubro", "11 - Novembro", "12 - Dezembro"
        };
        Scanner sc = new Scanner(System.in);
        double somaTemperaturas = 0;
        System.out.println("--- Digite a Temperatura Média de Cada Mês ---");
        for (int i = 0; i < num_meses; i++) {
            temperaturas[i] = sc.nextDouble();
            somaTemperaturas += temperaturas[i];
        }
        double mediaAnual = somaTemperaturas / num_meses;
        String mediaFormatada = String.format("%.2f", mediaAnual);
        System.out.println("\n=============================================");
        System.out.println("Média Anual de Temperatura: " + mediaFormatada + " °C");
        System.out.println("=============================================");
        System.out.println("\n--- Meses com Temperatura Acima da Média (" + mediaFormatada + " °C) ---");

        boolean houveMesAcima=false;
        for (int i = 0; i <num_meses ; i++) {
            if(temperaturas[i]>mediaAnual){
                String tempMesFormatada=String.format("%.2f",temperaturas[i]);
                System.out.println(nomesMeses[i]+" -> "+tempMesFormatada+" °C");
                houveMesAcima=true;
            }
        }
        if(!houveMesAcima){
            System.out.println("Nenhum mês teve temperatura média acima da média anual.");
        }
        sc.close();
    }
}
