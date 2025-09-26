import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] perguntas={
                "Telefonou para a vítima? (S/N): ",
                "Esteve no local do crime? (S/N): ",
                "Mora perto da vítima? (S/N): ",
                "Devia para a vítima? (S/N): ",
                "Já trabalhou com a vítima? (S/N): "
        };
        int contadorRespostasPositivas=0;
        System.out.println("--- INTERROGATÓRIO ---");
        System.out.println("Responda 'S' para Sim e 'N' para Não.");

        for (int i = 0; i < perguntas.length ; i++) {
            System.out.println(perguntas[i]);
            String resposta=scanner.next().toUpperCase();

            if(resposta.equals("S")){
                contadorRespostasPositivas++;
            }
        }
        System.out.println("\n--- CLASSIFICAÇÃO ---");

        if(contadorRespostasPositivas==5){
            System.out.println("A pessoa é classificada como: **ASSASSINA**");
        } else if (contadorRespostasPositivas>=3) {
            System.out.println("A pessoa é classificada como: **CÚMPLICE**");
        } else {
            System.out.println("A pessoa é classificada como: **INOCENTE**");
        }
        System.out.println("Total de respostas 'Sim': " + contadorRespostasPositivas);
        scanner.close();

    }
}
