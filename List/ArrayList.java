package List;

public class ArrayList implements Listable{
    private Object[] data;
    private int head;
    private int tail;
    private int numberElements;

    public ArrayList() {
        this(10);
    }
    public ArrayList(int length){
        data=new Object[length];
        head=0;
        tail=-1;
        numberElements=0;
    }

    @Override
    public void insert(Object index,int logicIndex){
      if(!isFull()){
          if (logicIndex>=0 && logicIndex <=numberElements{
              int physicalIndex=map(logicIndex);

              

          }
      }
    }
    @Override
    public void append(Object item){
        if(!isFull()){
            tail=next(tail);
            data[tail]=item;
            numberElements++;
        }else {
            System.err.println("A lista está cheia!");
        }
    }
    @Override
    public boolean isEmpty(){
        return numberElements==0;
    }
    @Override
    public boolean isFull(){
        return numberElements== data.length;
    }
    @Override
    public String print(){
        String result="";
        int aux =head;
        for (int i=0;i<numberElements;i++){
            result+=data[aux];
            aux=next(aux);
            if (i!=numberElements-1){
                result+=", ";
            }
        }
        return result;
    }
    @Override
    public void clear(){
        head=0;
        tail=-1;
        numberElements=0;
    }
    @Override
    public Object select(int logicIndex){
    Object itemAux=null;
    if(!isEmpty()){
        if((logicIndex>=0) && (logicIndex<numberElements)){
          int physicalIndex=map(logicIndex);
            itemAux=data[physicalIndex];
        }else{
            System.err.println("Indice Invalido!");
        }
    }else {
        System.err.println("Lista Vazia!");
    }
    return itemAux;

    }

    @Override
    public Object[] selectAll(){
        Object[] dataAux=null;
        if(!isEmpty()){
         dataAux=new Object[numberElements];
         int pointerAux=head;
            for (int i = 0; i < data.length ; i++) {
                dataAux[i]=pointerAux;
                pointerAux=next(pointerAux);
            }
        }else{
            System.err.println("Lista está vazia!");
        }
        return dataAux;
    }
    private int next(int index){
        return (data.length+index+1)% data.length;
    }
    private int map(int index){
        return (index+head)% data.length;
    }
}
