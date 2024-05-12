package Modulo;
import Aeronaves.DistanciaVerificavel;
import Pessoal.Cliente;

import java.util.Date;

public class Reserva {
    private int id;
    private DistanciaVerificavel distanciaVerificavel;
    private Cliente cliente;
    private String origem;
    private String destino;
    private String dataViagem;

    public Reserva(DistanciaVerificavel distanciaVerificavel, Cliente cliente, String origem, String destino, String dataViagem) {
        this.distanciaVerificavel = distanciaVerificavel;
        this.cliente = cliente;
        this.origem = origem;
        this.destino = destino;
        this.dataViagem = dataViagem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DistanciaVerificavel getDistanciaVerificavel() {
        return distanciaVerificavel;
    }

    public void setDistanciaVerificavel(DistanciaVerificavel distanciaVerificavel) {
        this.distanciaVerificavel = distanciaVerificavel;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDataViagem() {
        return dataViagem;
    }

    public void setDataViagem(String dataViagem) {
        this.dataViagem = dataViagem;
    }
}
