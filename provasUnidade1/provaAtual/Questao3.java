package provasUnidade1.provaAtual;


public class Questao3{
    private static  long counter;
    private long prioridade;
    long priorityAdjustment(int risk){
        long incremento=999_999-counter;
        counter++;
        return risk*1_000_000+incremento;
    }
    public void setPriority(int risk){
        this.prioridade=priorityAdjustment(risk);
    }
}

















/*
public class Questao3 {
    long priority;
    long counter=0;
    long priorityAdjustment(int risk){
        long incremento=999_999-counter;
        counter++;
        return risk*1_000_000+incremento;
    }
    setPriority(int risk){
        this.priority=priorityAdjustment(risk);
    }
}
*/
