import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex18 {

        public static double calcularPercentual(int votosJogador, int totalVotos){
            return (votosJogador*100.0)/totalVotos;
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] votos=new int[24];
        int totalVotos=0;

        System.out.println("Enquete:");
        System.out.println("Quem foi o melhor jogador?");

        while (true){
            System.out.println("Número do jogador (0=fim): ");
            int num=sc.nextInt();

            if(num==0){
                break;
            } else if (num >= 1 && num <=23) {
            votos[num]++;
            totalVotos++;
            }else{
                System.out.println("Informe um valor entre 1 e 23 ou 0 para sair!");
            }
        }
        if(totalVotos==0){
            System.out.println("Nenhum voto foi computado.");
            return;
        }

        System.out.println("\nResultado da votação:\n");
        System.out.println("Foram computados " + totalVotos + " votos.");
        System.out.printf("%-10s %-10s %-10s\n", "Jogador", "Votos", "%");

        int melhorJogador=0;
        int maxVotos=0;

        for (int i = 0; i <=23; i++) {
            if(votos[i]>0){
                double perc=calcularPercentual(votos[i],totalVotos);
                System.out.printf("%-10d %-10d %.1f%%\n",i,votos[i],perc);

                if(votos[i]>maxVotos){
                    maxVotos=votos[i];
                    melhorJogador=i;
                }
            }
        }
        double percMelhor=calcularPercentual(maxVotos,totalVotos);
        System.out.println("\nO melhor jogador foi o número " + melhorJogador +
                ", com " + maxVotos + " votos, correspondendo a " +
                String.format("%.1f", percMelhor) + "% do total de votos.");

        try(PrintWriter writer=new PrintWriter(new FileWriter("resultado_enquete.txt"))){
            writer.println("Resultado da votação:\n");
            writer.println("Foram computados " + totalVotos + " votos.");
            writer.printf("%-10s %-10s %-10s\n", "Jogador", "Votos", "%");

            for (int i = 1; i <= 23 ; i++) {
                if (votos[i]>0){
                    double perc=calcularPercentual(votos[i],totalVotos);
                    writer.printf("%-10d %-10d %.1f%%\n",i,votos[i],perc);
                }
            }
            writer.println("\nO melhor jogador foi o número "+melhorJogador+", com "+maxVotos+" votos, correspondendo a "+String.format("%.1f",percMelhor)+"% do total de votos.");
        }catch (IOException e){
            System.out.println("Erro ao gravar arquivo: "+e.getMessage());
        }
        sc.close();
    }
}
