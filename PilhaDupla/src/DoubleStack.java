public class DoubleStack implements DoubleStackOperation {
    private int topIndex1;
    private int topIndex2;
    private Object[] data;

    public DoubleStack(){
        this(12);
    }
    public DoubleStack(int length){
        topIndex1=-1;
        topIndex2=length;
        data=new Object[length];
    }
    @Override
    public void push1(Object item){
        if(!isFull1()){
            topIndex1++;
            data[topIndex1]=item;
        }else {
            System.err.println("A pilha está cheia!");
        }
    }
    public Object pop1(){
        Object topData=null;
        if(!isEmpty1()){
            topData=data[topIndex1];
            topIndex1--;
        }else {
            System.err.println("A pilha está vazia!");
        }
        return topData;
    };
    public Object peek1(){
        if(!isEmpty1()){
            return data[topIndex1];
        }else {
            System.err.println("A pilha está vazia!");
            return null;
        }

    };
    public void update1(Object item){
        if (!isEmpty1()){
            data[topIndex1]=item;
        }
        else {
            System.err.println("A pilha está vazia!");
        }

    }
    public boolean isFull1(){
        return (topIndex1==topIndex2-1);
    };
    public boolean isEmpty1(){
        return (topIndex1==-1);

    };
    public String print1(){
        String resultado="[";
        for (int i = topIndex1; i>=0; i--) {
            if (i==0){
                resultado+=data[i];
            }else{
                resultado += data[i]+",";
            }
        }
        return resultado+"]";
    };
//pilha2

@Override
public void push2(Object item){
    if(!isFull2()){
        topIndex2--;
        data[topIndex2]=item;
    }else {
        System.err.println("A pilha2 está cheia!");
    }
}
    public Object pop2(){
        Object topData=null;
        if(!isEmpty2()){
            topData=data[topIndex2];
            topIndex2++;
        }else {
            System.err.println("A pilha2 está vazia!");
        }
        return topData;
    };
    public Object peek2(){
        if(!isEmpty2()){
            return data[topIndex2];
        }else {
            System.err.println("A pilha2 está vazia!");
            return null;
        }

    };
    public void update2(Object item){
        if (!isEmpty2()){
            data[topIndex2]=item;
        }
        else {
            System.err.println("A pilha2 está vazia!");
        }

    }
    public boolean isFull2(){
        return isFull1();
    };
    public boolean isEmpty2(){
        return topIndex2==data.length;

    };
    public String print2(){
     String resultado="[";
        for (int i = topIndex2; i < data.length ; i++) {
         if (i== data.length-1){
            resultado+=data[i];
         }else{
            resultado+=data[i]+",";
         }
        }
        return resultado+"]";
    }


}
