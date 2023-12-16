package domain;

public class ParteRobot {
    private TipoMaterial material;
    private int puntosDefensa;
    private int danioAtaque;
    private int puntosVidaBase;

    // Constructor
    public ParteRobot(TipoMaterial material, int puntosDefensa, int danioAtaque, int puntosVidaBase) {
        this.material = material;
        this.puntosDefensa = puntosDefensa;
        this.danioAtaque = danioAtaque;
        this.puntosVidaBase = puntosVidaBase;
    }
    // Método para cambiar el material de la parte del robot
    public void cambiarMaterial(TipoMaterial nuevoMaterial) {
        this.material = nuevoMaterial;
    }

    // Método para recalcular las estadísticas después de cambiar el material
    public void recalcularEstadisticas() {

    }

    // Métodos para obtener propiedades del material
    public int getPuntosDefensa() {
        return puntosDefensa;
    }

    public int getDanioAtaque() {
        return danioAtaque;
    }

    public int getPuntosVidaBase() {
        return puntosVidaBase;
    }

    // Puedes agregar más métodos según sea necesario

    @Override
    public String toString() {
        return "Material{" +
                "material ='" + material + '\'' +
                ", def =" + puntosDefensa +
                ", atq =" + danioAtaque +
                ", HP =" + puntosVidaBase +
                '}';
    }

    public void setPuntosDefensa(int puntosDefensa) {
        this.puntosDefensa = puntosDefensa;
    }

    public void setDanioAtaque(int danioAtaque) {
        this.danioAtaque = danioAtaque;
    }

    public void setPuntosVidaBase(int puntosVidaBase) {
        this.puntosVidaBase = puntosVidaBase;
    }

    public TipoMaterial getMaterial() {
        return material;
    }
}
