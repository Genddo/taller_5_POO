package domain;

public class ParteRobot {
    private TipoMaterial material;
    private int puntosDefensa;
    private int danioAtaque;
    private int puntosVidaBase;

    /**
     * constructor de la clase
     * @param material
     * @param puntosDefensa
     * @param danioAtaque
     * @param puntosVidaBase
     */
    public ParteRobot(TipoMaterial material, int puntosDefensa, int danioAtaque, int puntosVidaBase) {
        this.material = material;
        this.puntosDefensa = puntosDefensa;
        this.danioAtaque = danioAtaque;
        this.puntosVidaBase = puntosVidaBase;
    }

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
     * método para convertir la clase a una clase String
     * @return
     */
    @Override
    public String toString() {
        return "Material{" +
                "material ='" + material + '\'' +
                ", def =" + puntosDefensa +
                ", atq =" + danioAtaque +
                ", HP =" + puntosVidaBase +
                '}';
    }
}
