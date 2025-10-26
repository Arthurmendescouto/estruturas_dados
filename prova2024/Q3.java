package prova2024;

public class Q3 {
    public String imprimirInicioParaPosicao(int posicao){
        String result = "";
        if(!isEmpty()){
        if (posicao >= 0 && posicao < numberElements) {
            String result += "[";
            int aux = head;
            for (int i = 0; i < posicao; i++) {
                result += data[aux];
                aux = next(aux);
                if(i!=numberElements-1){
                    result +=", ";
                }
            }
            result+="]";
        } else {
            System.out.println("Invalid Index");
        }
    } else {
        result = "[]";
    }
    return result;
    }

}
