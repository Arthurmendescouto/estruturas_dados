public class Ex13 {
    public static void main(String[] args) {
        int[] original={10,15,42,81};
        int[] copia=new int[original.length];

        for (int i = 0; i < original.length ; i++) {
            copia[i]=original[i];
        }
        System.out.println("Array original: ");
        for (int num: original){
            System.out.println(num+" ");
        }
        System.out.println();

        System.out.println("Array copiado: ");
        for (int num: copia){
            System.out.println(num+" ");
        }
    }
}
