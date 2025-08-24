public class StaticStack implements StackOperations {
    private int topIndex;
    private Object[] data;

    public StaticStack(){
        this(12);
    }
    public StaticStack(int length){
        topIndex=-1;
        data=new Object[length];
    }
    @Override
    public void push(Object item){
        if(!isFull()){
            topIndex++;
        data[topIndex]=item;
        }else {
            System.err.println("A pilha está cheia!");
        }
    }
    public Object pop(){
        Object topData=null;
        if(!isEmpty()){
            topData=data[topIndex];
        data[topIndex]=null;
        topIndex--;
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
        return (data.length-1==topIndex);
    };
    public boolean isEmpty(){
        return (topIndex==-1);

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
