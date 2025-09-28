import java.util.Scanner;

    public class Ex06 {
        public static void main(String[] args) {

            final int NUM_ALUNOS = 10;
            final int NUM_NOTAS = 4;


            double[] mediasAlunos = new double[NUM_ALUNOS];


            int alunosAprovados = 0;


            Scanner scanner = new Scanner(System.in);

            System.out.println("--- Cálculo de Médias para " + NUM_ALUNOS + " Alunos ---");


            for (int i = 0; i < NUM_ALUNOS; i++) {
                double somaNotas = 0;
                System.out.println("\n--- Aluno " + (i + 1) + " ---");

                for (int j = 0; j < NUM_NOTAS; j++) {
                    System.out.print("Digite a nota " + (j + 1) + ": ");
                    double nota = scanner.nextDouble();

                    somaNotas += nota;
                }


                double media = somaNotas / NUM_NOTAS;


                mediasAlunos[i] = media;

                System.out.printf("Média calculada: %.2f%n", media);


                if (media >= 7.0) {
                    alunosAprovados++;
                }
            }

            scanner.close();

            System.out.println("\n==============================================");
            System.out.println("--- Resultados Finais ---");

            System.out.print("Vetor de Médias dos Alunos: [");
            for (int i = 0; i < NUM_ALUNOS; i++) {
                System.out.printf("%.2f", mediasAlunos[i]);
                if (i < NUM_ALUNOS - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");

            System.out.println("Número de alunos com média maior ou igual a 7.0: " + alunosAprovados);
            System.out.println("==============================================");
        }
    }

