import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("n deve ser maior que 0");
        } else {
            int[] lucas = new int[n];

            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    lucas[i] = 2;
                } else if (i == 1) {
                    lucas[i] = 1;
                } else {
                    lucas[i] = lucas[i - 1] + lucas[i - 2];
                }
            }
            System.out.println("Sequência de Lucas: ");
            for (int i = 0; i < n; i++) {
                System.out.println(lucas[i] + " ");
            }
        }
    }
}
