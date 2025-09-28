import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] modelos=new String[5];
        double[] consumo=new double[5];
        double menorConsumo=0;
        int eco=0;

        System.out.println("Comparativo de Consumo de Combustível");
        for (int i = 0; i <5 ; i++) {
            System.out.println("Veículo "+(i+1));
            System.out.println("Nome: ");
            modelos[i]=sc.nextLine();
            System.out.println("Km por litro: ");
            consumo[i]=sc.nextDouble();
            sc.nextLine();
            if(i==0|| consumo[i]>consumo[eco]) eco=i;
        }
        System.out.println("\nRelatório Final");
        for (int i = 0; i <5 ; i++) {
            double litros=1000/consumo[i];
            double custo=litros*2.25;
            System.out.printf("%d -  %s - %.1f - %.1f litros - R$ %.2f\n",i+1,modelos[i],consumo[i],litros,custo);
        }
        System.out.println("\nO menor consumo é do "+modelos[eco]+".");
        sc.close();
    }
}
