package Pessoal;

import Aeronaves.DistanciaVerificavel;

import java.util.Date;

public class Cliente extends Pessoa {
    public Cliente(String nome, String cpf, String dataNascimento , String endereco, String telefone , String email) {
        super(nome, cpf, dataNascimento, endereco, telefone, email);
    }
    public void fazerReserva(DistanciaVerificavel distanciaVerificavel, String origem, String destino, Date dataVigem){

    }

}
