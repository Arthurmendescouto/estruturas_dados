public class PilhaInvertida implements InvertedStackOperations {
    private int topIndex;
    private Object[] data;

    public PilhaInvertida(){
        this(12);
    }
    public PilhaInvertida(int length){
        topIndex=length;
        data=new Object[length];
    }
    @Override
    public void push(Object item){
        if(!isFull()){
            topIndex--;
            data[topIndex]=item;
        }else {
            System.err.println("A pilha está cheia!");
        }
    }
    public Object pop(){
        Object topData=null;
        if(!isEmpty()){
            topData=data[topIndex];
            topIndex++;
        }else {
            System.err.println("A pilha está vazia!");
        }
        return topData;
    };
    public Object peek(){
        if(!isEmpty()){
            return data[topIndex];
        }else {
            System.out.println("A pilha está vazia!");
            return null;
        }

    };
    public void update(Object item){
        if (!isEmpty()){
            data[topIndex]=item;
        }
        else {
            System.out.println("A pilha está vazia!");
        }

    }
    public boolean isFull(){
        return (topIndex==0);
    };
    public boolean isEmpty(){
        return (topIndex== data.length);

    };
    public String print(){
        String resultado="[";
        for (int i = topIndex; i>=0; i--) {
            if (i==0){
                resultado+=data[i];
            }else{
                resultado += data[i]+",";
            }
        }
        return resultado+"]";
    };

}