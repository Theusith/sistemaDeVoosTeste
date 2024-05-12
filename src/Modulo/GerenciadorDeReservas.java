package Modulo;
import java.util.ArrayList;

public class GerenciadorDeReservas {
    private ArrayList<Reserva> reservas;

    public GerenciadorDeReservas() {
        this.reservas = new ArrayList<>();
    }

    public void adicionarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public void removerReserva(Reserva reserva) {
        reservas.remove(reserva);
    }

    public Reserva buscarReservaPorId(int id) {
        for (Reserva reserva : reservas) {
            if (reserva.getId() == id) {
                return reserva;
            }
        }
        return null; // Reserva não encontrada
    }

    // Outros métodos de manipulação de reservas, conforme necessário

    public void exibirReservas() {
        for (Reserva reserva : reservas) {
            System.out.println(reserva);
        }
    }
}

