import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] contadores=new int[9];
        double vendasBrutas=0;

        System.out.println("--- ANÁLISE DE SALÁRIOS DE VENDEDORES ---");
        System.out.println("Digite as vendas brutas de cada vendedor (-1 para encerrar):");
    while (true){
        System.out.println("Vendas Brutas do vendedor (ou -1 para sair): $");

        if(scanner.hasNextDouble()){
            vendasBrutas=scanner.nextDouble();
            if(vendasBrutas==-1){
                break;
            }
            double salario=200.00+(0.09*vendasBrutas);

            int indice=(int)(salario/100)-2;

            if(indice>=8){
                indice=8;
            }
            if(indice<0){
                System.out.println("ERRO: Salário calculado abaixo de $200. Ignorando este registro.");
                continue;
            }
            contadores[indice]++;
            System.out.println("Salário calculado: $"+String.format("%.2f",salario));
        }else{
            System.out.println("Entrada inválida. Por favor, digite um número.");
            scanner.next();
        }
    }
        System.out.println("\n=============================================");
        System.out.println("       RELATÓRIO DE FAIXAS SALARIAIS");
        System.out.println("=============================================");

        for (int i = 0; i < contadores.length-1 ; i++) {
            int valorInicial=(i+2)*100;
            System.out.printf("$%d - $d:\t%d vendedores\n",valorInicial,valorInicial+99,contadores[i]);
        }
        System.out.printf("$1000 em diante:\t%d vendedores\n",contadores[8]);
        System.out.println("=============================================");
        scanner.close();
    }
}
