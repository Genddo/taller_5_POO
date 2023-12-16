package domain;

public class Robot {
    private String numeroSerie;
    private ParteRobot cabeza;
    private ParteRobot cuerpo;
    private ParteRobot brazos;
    private ParteRobot piernas;
    private int puntosDefensa;
    private int danioAtaque;
    private int puntosVidaBase;

    public int getPuntosDefensa() {
        return puntosDefensa;
    }

    public void setPuntosDefensa(int puntosDefensa) {
        this.puntosDefensa = puntosDefensa;
    }

    public int getDanioAtaque() {
        return danioAtaque;
    }

    public void setDanioAtaque(int danioAtaque) {
        this.danioAtaque = danioAtaque;
    }

    public int getPuntosVidaBase() {
        return puntosVidaBase;
    }

    public void setPuntosVidaBase(int puntosVidaBase) {
        this.puntosVidaBase = puntosVidaBase;
    }

    public Robot() {

    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public ParteRobot getCabeza() {
        return cabeza;
    }

    public ParteRobot getCuerpo() {
        return cuerpo;
    }

    public ParteRobot getBrazos() {
        return brazos;
    }

    public ParteRobot getPiernas() {
        return piernas;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public void setCabeza(ParteRobot cabeza) {
        this.cabeza = cabeza;
    }

    public void setCuerpo(ParteRobot cuerpo) {
        this.cuerpo = cuerpo;
    }

    public void setBrazos(ParteRobot brazos) {
        this.brazos = brazos;
    }

    public void setPiernas(ParteRobot piernas) {
        this.piernas = piernas;
    }
}
