package Aeronaves;

public abstract class Aeronave implements DistanciaVerificavel {
    protected String numeroRegistro;
    protected int autonomiaKm;

    public Aeronave(String numeroRegistro, int autonomiaKm) {
        this.numeroRegistro = numeroRegistro;
        this.autonomiaKm = autonomiaKm;
    }

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public int getAutonomiaKm() {
        return autonomiaKm;
    }

    public void setAutonomiaKm(int autonomiaKm) {
        this.autonomiaKm = autonomiaKm;
    }

    @Override
    public boolean validarTrecho(int distanciaKm){
        return distanciaKm <= autonomiaKm;
    }

}
