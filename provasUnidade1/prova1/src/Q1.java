import java.time.LocalDate;

public interface Q1 {
    Reserva reserva(Passageiro passageiro,
                    String origem, String destino, LocalDate dataVoo, LocalDate horário, ClassePassagem classePassagem);

    boolean adicionar(Reserva reserva);

    boolean remover(Passagereiro passagereiro);





}
