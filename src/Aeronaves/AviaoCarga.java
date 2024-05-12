package Aeronaves;

public class AviaoCarga extends Aeronave{
    private float capacidadeCarga;

    public AviaoCarga(String numeroRegistro, int autonomiaKm){
        super(numeroRegistro, autonomiaKm);
    }

    public float getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(float capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public String toString() {
        return "Numero de registro: " + numeroRegistro + "\nCapacidade Carga: " + capacidadeCarga + "\nAutonomia: " + autonomiaKm;
    }

}
