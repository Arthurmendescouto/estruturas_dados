package prova2024;

import java.time.LocalDate;
import java.util.spi.CalendarDataProvider;

public interface Q1 {
    public void criarReserva(int numQuarto, LocalDate dataInicioRes,LocalDate dataFimDaReserva, double ValorPago);
    public Reserva adicionarReserva(Reserva reserva);

    public Reserva[] listarReservas();
    public Reserva visualizarReserva(Reserva reserva);
    public Reserva deletarReserva(Reserva reserva);
    public void atualizarReserva(Reserva reserva,Reserva novaReserva);
}
