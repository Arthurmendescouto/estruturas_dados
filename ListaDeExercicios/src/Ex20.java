import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0, min100=0;
        double total=0,maior=0;

        System.out.println("Projeção de Gastos com Abono\n============================");

        while (true){
            System.out.println("Salário: ");
            double s=sc.nextDouble();
            if(s==0) break;

            double a=s*02;
            if(a<100){
                a=100;
                min100++;
            }
            total+=a;
            if(a>maior) maior=a;
            count++;
            System.out.printf("R$ %.2f - R$");
        }
        System.out.println("\nForam processados "+count+" colaboradores");
        System.out.printf("Total gasto com abonos: R$ %.2f\n",total);
        System.out.println("Valor mínimo pago a " + min100 + " colaboradores");
        System.out.printf("Maior valor de abono pago: R$ %.2f\n",maior);

        sc.close();
    }
}
