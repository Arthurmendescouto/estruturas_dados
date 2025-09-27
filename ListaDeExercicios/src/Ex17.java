import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int num_saltos = 5;

        String nomeAtleta;
        double[] distancias = new double[num_saltos];
        String[] nomesSaltos={"Primeiro", "Segundo", "Terceiro", "Quarto", "Quinto"};

        System.out.println("--- COMPETIÇÃO DE SALTO EM DISTÂNCIA ---");

        while (true){
            System.out.print("\nDigite o nome do atleta (ou tecle Enter para sair): ");
            nomeAtleta=sc.nextLine().trim();
            if(nomeAtleta.isEmpty()){
                break;
            }
            System.out.println("Atleta: "+nomeAtleta);

            double somaDistancias = 0;


            for (int i = 0; i < num_saltos; i++) {
                System.out.print("Informe a distância do " + nomesSaltos[i] + " Salto (em metros): ");
if(sc.hasNextDouble()){
    distancias[i]=sc.nextDouble();
    somaDistancias+=distancias[i];
}else{
    System.out.println("Entrada inválida. Por favor, digite um número.");
    distancias[i]=0.0;
    sc.next();
    i--;
    continue;
}
            }
            sc.nextLine();

            double mediaSaltos=somaDistancias/num_saltos;
            String mediaFormatada = String.format("%.2f", mediaSaltos);

            System.out.println("\n--- RESULTADO FINAL DE " + nomeAtleta.toUpperCase() + " ---");
            System.out.println("Atleta: " + nomeAtleta);

            for (int i = 0; i <num_saltos ; i++) {
                System.out.println(nomesSaltos[i]+" Salto: "+String.format("%.2f",distancias[i])+" m");
            }
            System.out.println("Média dos Saltos: " + mediaFormatada + " m");
            System.out.println("----------------------------------------------");
        }
        System.out.println("\nCompetição encerrada. Até a próxima!");
        sc.close();
    }
}

