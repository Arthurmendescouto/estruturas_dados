import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] sistemas={"Windows Server", "Unix", "Linux", "Netware", "Mac OS", "Outro"};
        int[] votos=new int[6];
        int total=0;

        System.out.println("Informe os votos (1-6, 0 para encerrar):");
        while (true){
            int voto=sc.nextInt();
            if(voto==0) break;
            if(voto>=1 && voto<=6){
                votos[voto-1]++;
                total++;
            }
            else System.out.println("Valor inválido!");
        }
        System.out.printf("%-15s %-5s %s\n", "Sistema Operacional", "Votos", "%");
        System.out.println("------------------- ----- ---");

        int maxVotos=0, vencedor=0;
        for (int i = 0; i <6 ; i++) {
            double perc=(votos[i]*100.0)/total;
            System.out.printf("%-15s %-5d %.0f%%\n",sistemas[i],votos[i],perc);
            if(votos[i]>maxVotos){
                maxVotos=votos[i]; vencedor=i;
            }
        }
        System.out.println("------------------- -----");
        System.out.println("Total " + total);
        System.out.printf("\nO Sistema Operacional mais votado foi o %s, com %d votos, correspondendo a %.0f%%\n",
                sistemas[vencedor], maxVotos, (maxVotos*100.0)/total);
    }
}
