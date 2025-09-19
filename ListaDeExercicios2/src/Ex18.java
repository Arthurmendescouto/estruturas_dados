public class Ex18 {
    public static void main(String[] args) {
        int[] array1 = {2, 4, 6, 8, 10};
        int[] array2 = {1, 3, 4, 5, 7, 9};
        if(array1.length != array2.length){
            System.out.println("Os arrays devem ter o mesmo tamanho!");
            return;
        }
        int[] resultado=new int[array1.length];
        for(int i=0;i<array1.length;i++){
            resultado[i]=array1[i]*array2[i];
        }
        System.out.println("Array resultante da multiplicação:");
        for (int valor:resultado){
            System.out.println(valor+" ");
        }
    }
}
