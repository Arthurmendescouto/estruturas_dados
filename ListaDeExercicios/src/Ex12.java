import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        final int num_alunos = 30;

        int[] idades = new int[num_alunos];
        double[] alturas = new double[num_alunos];
        Scanner sc = new Scanner(System.in);
        double somaAlturas = 0;

        System.out.println("--- Leitura de Idades e Alturas (30 alunos) ---");
        for (int i = 0; i < num_alunos; i++) {
            System.out.println("\nAluno " + (i + 1) + ":");

            System.out.println("Digite a idade: ");
            idades[i] = sc.nextInt();

            System.out.println("Digite a altura em metros (ex: 1,75): ");
            alturas[i] = sc.nextDouble();
            somaAlturas += alturas[i];
        }
        double mediaAltura = somaAlturas / num_alunos;
        String mediaFormatada = String.format("%.2f", mediaAltura);
        System.out.println("\n-------------------------------------------");
        System.out.println("Média de Altura da turma: " + mediaFormatada + " metros");
        System.out.println("-------------------------------------------");

        int contadorAlunos = 0;
        for (int i = 0; i < num_alunos; i++) {
            boolean maisDeTreze = idades[i] > 13;
            boolean alturaAbaixoMedia = alturas[i] < mediaAltura;
            if (maisDeTreze && alturaAbaixoMedia) {
                contadorAlunos++;
            }
        }
        System.out.println("\nRESULTADO FINAL:");
        System.out.println("O número de alunos com mais de 13 anos E altura inferior à média é: " + contadorAlunos);
        sc.close();
    }
}
