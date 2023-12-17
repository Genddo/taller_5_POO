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

    /**
     * getter de los puntos de defensa
     * @return
     */
    public int getPuntosDefensa() {
        return puntosDefensa;
    }

    /**
     * setter de los puntos de defensa
     * @param puntosDefensa
     */
    public void setPuntosDefensa(int puntosDefensa) {
        this.puntosDefensa = puntosDefensa;
    }

    /**
     * getter de los puntos de ataque
     * @return
     */
    public int getDanioAtaque() {
        return danioAtaque;
    }

    /**
     * setter de los puntos de ataque
     * @param danioAtaque
     */
    public void setDanioAtaque(int danioAtaque) {
        this.danioAtaque = danioAtaque;
    }

    /**
     * getter de los puntos de vida
     * @return
     */
    public int getPuntosVidaBase() {
        return puntosVidaBase;
    }

    /**
     * setter de los puntos de vida
     * @param puntosVidaBase
     */
    public void setPuntosVidaBase(int puntosVidaBase) {
        this.puntosVidaBase = puntosVidaBase;
    }

    /**
     * constructor vacío, ya que se utilizará el patrón de diseño builder
     */
    public Robot() {}

    /**
     * getter del numero de serie
     * @return
     */
    public String getNumeroSerie() {
        return numeroSerie;
    }

    /**
     * getter de la cabeza
     * @return
     */
    public ParteRobot getCabeza() {
        return cabeza;
    }

    /**
     * getter del cuerpo
     * @return
     */

    public ParteRobot getCuerpo() {
        return cuerpo;
    }

    /**
     * getter de los brazos
     * @return
     */

    public ParteRobot getBrazos() {
        return brazos;
    }

    /**
     * getter de las piernas
     * @return
     */

    public ParteRobot getPiernas() {
        return piernas;
    }

    /**
     * setter del numero de serie
     * @param numeroSerie
     */

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    /**
     * setter de la cabeza
     * @param cabeza
     */
    public void setCabeza(ParteRobot cabeza) {
        this.cabeza = cabeza;
    }

    /**
     * setter del cuerpo
     * @param cuerpo
     */
    public void setCuerpo(ParteRobot cuerpo) {
        this.cuerpo = cuerpo;
    }

    /**
     * setter de los brazos
     * @param brazos
     */
    public void setBrazos(ParteRobot brazos) {
        this.brazos = brazos;
    }

    /**
     * setter de las piernas
     * @param piernas
     */
    public void setPiernas(ParteRobot piernas) {
        this.piernas = piernas;
    }
}
