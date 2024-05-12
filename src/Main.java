import Pessoal.Administrador;
import Pessoal.Pessoa;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        String cpf = sc.nextLine();
        String dataNascimento = sc.nextLine();
        String endereco = sc.nextLine();
        String telefone = sc.nextLine();
        String email = sc.nextLine();

        Administrador adm1= new Administrador(nome, cpf, dataNascimento, endereco, telefone, email);

    }
}
