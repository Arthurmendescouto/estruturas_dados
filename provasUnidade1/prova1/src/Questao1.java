import java.time.LocalDate;
import java.time.LocalTime;

public class Questao1 {
    public static void main(String[] args) {
        List listaDePassagens=new List(12);

        Passagem p1 = new Passagem("Arthur", "BH", "SP",
                LocalDate.of(2025, 12, 25), LocalTime.of(13, 20, 00), TipoPassagem.ECONOMICA);
        Passagem p2 = new Passagem("Pedro", "RJ", "BA",
                LocalDate.of(2025, 11, 12),
                LocalTime.of(9, 0),
                TipoPassagem.EXECUTIVA);

        Passagem p3 = new Passagem("Lucas", "MG", "RS",
                LocalDate.of(2025, 12, 1),
                LocalTime.of(18, 45),
                TipoPassagem.PRIMEIRA_CLASSE);

        listaDePassagens.reservarPassagem(p1);
        listaDePassagens.reservarPassagem(p3);
        System.out.println(listaDePassagens.passagensCompradas());
        listaDePassagens.reservarPassagem(p2);
        System.out.println(listaDePassagens.passagensCompradas());
        listaDePassagens.cancelarPassagem("arthur");
        System.out.println(listaDePassagens.passagensCompradas());




    }
}

interface Operations {
    void reservarPassagem(Passagem p);

    Passagem cancelarPassagem(String nome);

    String passagensCompradas();

    boolean isFull();

    boolean isEmpty();
}

enum TipoPassagem {
    ECONOMICA,
    EXECUTIVA,
    PRIMEIRA_CLASSE
}

class Passagem {
    private String nome;
    private String origem;
    private String destino;
    private LocalDate dataVoo;
    private LocalTime horario;
    private TipoPassagem classeDaPassagem;

    public Passagem(String nome, String origem, String destino, LocalDate dataVoo, LocalTime horario, TipoPassagem classeDaPassagem) {
        this.nome = nome;
        this.origem = origem;
        this.destino = destino;
        this.dataVoo = dataVoo;
        this.horario = horario;
        this.classeDaPassagem = classeDaPassagem;
    }

    public String getNome() {
        return nome;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public LocalDate getDataVoo() {
        return dataVoo;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public TipoPassagem getClasseDaPassagem() {
        return classeDaPassagem;
    }
    @Override
    public String toString() {
        return "Passagem{" +
                "nome='" + nome + '\'' +
                ", origem='" + origem + '\'' +
                ", destino='" + destino + '\'' +
                ", dataVoo=" + dataVoo +
                ", horario=" + horario +
                ", classeDaPassagem=" + classeDaPassagem +
                '}';
    }
}

class List implements Operations {
    Passagem[] data;
    int numberElements;

    public List() {
        this(10);
    }

    public List(int capacidade) {
        data = new Passagem[capacidade];
        numberElements = 0;
    }

    public void reservarPassagem(Passagem p) {
        if (isFull()) {
            System.out.println("Não sobrou passagens para registrar!");
        } else {
            data[numberElements] = p;
            numberElements++;
        }
    }

    public Passagem cancelarPassagem(String nome) {
        if (isEmpty()) {
            System.out.println("Não existem passagens para cancelar.");
        } else {
            for (int i = 0; i < numberElements; i++) {
                if (data[i].getNome().equalsIgnoreCase(nome)) {
                    Passagem passagemRemovida = data[i];
                    for (int j = i; j < numberElements - 1; j++) {
                        data[j] = data[j + 1];
                    }
                    numberElements--;
                    return passagemRemovida;
                }
            }
        }
        return null;
    }

    public String passagensCompradas() {
        if(isEmpty()){
            System.out.println("Não existem passagens compradas");
        }
        String passagensCompradas="";
        for (int i = 0; i <numberElements ; i++) {
            passagensCompradas+=data[i].toString()+"\n";
        }
        return passagensCompradas;
    }

    @Override
    public boolean isFull() {
        return numberElements == data.length;
    }

    @Override
    public boolean isEmpty() {
        return numberElements == 0;
    }
}
