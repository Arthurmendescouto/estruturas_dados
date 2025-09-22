import java.util.Arrays;
import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite a quantidade de elementos do array: ");
        int n = sc.nextInt();

        int[] array = new int[n];
        System.out.println("Digite os elementos do array (em qualquer ordem):");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);
        System.out.println("Array ordenado: "+Arrays.toString(array));

        System.out.println("Digite o número a ser buscado: ");
        int alvo=sc.nextInt();

        int res=buscaBinaria(array,alvo);

        if(res==-1){
            System.out.println("Elemento não encontrado.");
        }else{
            System.out.println("Elemento encontrado na posição: "+res);
        }
        sc.close();
    }
    public static int buscaBinaria(int[] array, int alvo){
        int esquerda=0;
        int direita=array.length-1;

        while (esquerda<=direita){
            int meio=esquerda+(direita-esquerda)/2;
            if(array[meio]==alvo){
              return meio;
            } else if (array[meio]<alvo) {
                esquerda=meio+1;
            }else {
                direita=meio-1;

            }
        }
        return -1;
    }
}
