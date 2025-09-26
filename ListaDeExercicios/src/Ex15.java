import java.util.ArrayList;
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();

        double notaAtual;

        System.out.println("--- ANÁLISE DE NOTAS ---");
        System.out.println("Informe as notas dos alunos (digite -1 para encerrar a entrada de dados):");

        while (true) {
            System.out.print("Nota: ");

            if (sc.hasNextDouble()) {
                notaAtual = sc.nextDouble();
                if (notaAtual == -1) {
                    break;
                }
            } else {
                System.out.println("Entrada inválida...");
                sc.next();
            }
        }
        if(notas.isEmpty()){
            System.out.println("\nNenhuma nota foi informada. Encerrando o programa.");
            sc.close();
            return;
        }
        int quantidade=notas.size();

        double soma=0;
        double media=0;

        for (double nota:notas){
            soma+=nota;
        }
        media=soma/quantidade;
        System.out.println("\n-------------------------------------------");

        System.out.println("1. Quantidade de valores lidos: " + quantidade);

        System.out.print("2. Valores informados (ordem original): [");
        for (int i = 0; i <quantidade ; i++) {
            System.out.println(String.format("%.1f",notas.get(i)));
            if(i<quantidade-1){
                System.out.println(", ");
            }
        }
        System.out.println("]");

        System.out.println("3. Valores informados (ordem inversa):");
        for (int i = quantidade-1; i >=0 ; i--) {
            System.out.print(String.format("%.1f", notas.get(i)));
        }
        System.out.println("4. Soma dos valores: " + String.format("%.2f", soma));
        System.out.println("5. Média dos valores: " + String.format("%.2f", media));

        int acimaDaMedia=0;
        for(double nota: notas){
            if(nota>media){
                acimaDaMedia++;
            }
        }
        System.out.println("6. Quantidade de valores acima da média (" + String.format("%.2f", media) + "): " + acimaDaMedia);

        int abaixoDeSete=0;
        for (double nota:notas){
            if(nota<7.0){
                abaixoDeSete++;
            }
        }
        System.out.println("7. Quantidade de valores abaixo de 7.0: " + abaixoDeSete);
        System.out.println("-------------------------------------------");
        System.out.println("Programa encerrado. Análise de notas concluída.");

        sc.close();
    }
}
