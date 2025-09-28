import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] defeitos = new int[4];
        int total = 0;

        System.out.println("Digite o número de identificação e o código do defeito (0 encerra):");
        while (true){
            int id=sc.nextInt();
            if(id==0) break;
            int cod=sc.nextInt();
            if(cod>=1 && cod <=4){
                defeitos[cod-1]++;
                total++;
            }
        }
        System.out.println("\nQuantidade de mouses: " + total);
        System.out.println("\nSituação\t\t\tQuantidade\tPercentual");

        String[] nomes={
                "1- necessita da esfera",
                "2- necessita de limpeza",
                "3- necessita troca do cabo ou conector",
                "4- quebrado ou inutilizado"
        };
        for (int i = 0; i <4 ; i++) {
            double perc=total>0? defeitos[i]*100.0/total : 0;
            System.out.printf("%-35s %-10d %.0f%%\n",nomes[i],defeitos[i],perc);
        }
sc.close();
    }
}
