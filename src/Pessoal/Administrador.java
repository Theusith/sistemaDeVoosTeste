package Pessoal;
import Modulo.Reserva;


public class Administrador extends Pessoa{
    private String matricula;

    public Administrador(String nome, String cpf, String dataNascimento, String endereco, String telefone, String email){
        super(nome, cpf, dataNascimento, endereco, telefone, email);
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void cadastrarAviaoCarga(){}

    public void cadastrarAviaoPassageiros(){}

    public void cadastrarHelicoptero(){}

    public void cadastrarVoo(){}

    public void alterarVoo(){}

    public void cadastrarNovoFuncionario(){}

    public void removerFuncionario(){}

    public void editarReserva(Reserva reserva, String origem, String destino, String dataViagem) {
        // Verifica se a reserva existe
        if (reserva != null) {
            // Modifica as informações da reserva conforme necessário
            reserva.setOrigem(origem);
            reserva.setDestino(destino);
            reserva.setDataViagem(dataViagem);
            // Outras operações de edição, se necessário
            System.out.println("Reserva editada com sucesso.");
        } else {
            System.out.println("Reserva não encontrada.");
        }
    }
}
