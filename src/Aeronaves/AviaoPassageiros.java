package Aeronaves;

public class AviaoPassageiros extends Aeronave{
    private int capacidadePassageiros;

    public AviaoPassageiros(String numeroRegistro, int autonomiaKm) {
        super(numeroRegistro, autonomiaKm);
    }

    public int getNumeroPassageiros() {
        return capacidadePassageiros;
    }

    public void setNumeroPassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }

    @Override
    public String toString() {
        return "Numero de registro: " + numeroRegistro + "\nNumero de passageiros: " + capacidadePassageiros +"\nAutonomia: " + autonomiaKm;
    }
}
