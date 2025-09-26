import java.util.Scanner;




    public class Ex6 {
        public static void main(String[] args) {
            // Define o número total de alunos e de notas por aluno.
            final int NUM_ALUNOS = 10;
            final int NUM_NOTAS = 4;

            // Vetor para armazenar as médias finais de cada aluno.
            double[] mediasAlunos = new double[NUM_ALUNOS];

            // Contador para o número de alunos aprovados (média >= 7.0).
            int alunosAprovados = 0;

            // Objeto Scanner para ler a entrada do usuário (as notas).
            Scanner scanner = new Scanner(System.in);

            System.out.println("--- Cálculo de Médias para " + NUM_ALUNOS + " Alunos ---");

            // 1. Loop principal para percorrer todos os 10 alunos
            for (int i = 0; i < NUM_ALUNOS; i++) {
                double somaNotas = 0; // Variável para acumular a soma das notas do aluno atual
                System.out.println("\n--- Aluno " + (i + 1) + " ---");

                // Loop para ler as 4 notas do aluno atual
                for (int j = 0; j < NUM_NOTAS; j++) {
                    System.out.print("Digite a nota " + (j + 1) + ": ");
                    double nota = scanner.nextDouble();

                    // Adiciona a nota lida à soma
                    somaNotas += nota;
                }

                // 2. Cálculo e Armazenamento da Média
                // Calcula a média dividindo a soma total pelo número de notas
                double media = somaNotas / NUM_NOTAS;

                // Armazena a média calculada na posição 'i' do vetor mediasAlunos
                mediasAlunos[i] = media;

                System.out.printf("Média calculada: %.2f%n", media); // Imprime a média com 2 casas decimais

                // 3. Verificação de Aprovação
                // Verifica se a média é maior ou igual a 7.0
                if (media >= 7.0) {
                    alunosAprovados++; // Incrementa o contador de aprovados
                }
            }

            // Fecha o Scanner
            scanner.close();

            // 4. Impressão dos Resultados Finais
            System.out.println("\n==============================================");
            System.out.println("--- Resultados Finais ---");

            // Imprime o vetor de médias
            System.out.print("Vetor de Médias dos Alunos: [");
            for (int i = 0; i < NUM_ALUNOS; i++) {
                System.out.printf("%.2f", mediasAlunos[i]);
                if (i < NUM_ALUNOS - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");

            // Imprime o número final de alunos aprovados
            System.out.println("Número de alunos com média maior ou igual a 7.0: " + alunosAprovados);
            System.out.println("==============================================");
        }
    }

