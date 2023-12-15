package domain;

public class Material {
    private String nombre;
    private int puntosDefensa;
    private int danioAtaque;
    private int puntosVidaBase;

    public Material(String nombre, int puntosDefensa, int danioAtaque, int puntosVidaBase) {
        this.nombre = nombre;
        this.puntosDefensa = puntosDefensa;
        this.danioAtaque = danioAtaque;
        this.puntosVidaBase = puntosVidaBase;
    }

    public String getNombre() {
        return nombre;
    }

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
                "nombre='" + nombre + '\'' +
                ", puntosDefensa=" + puntosDefensa +
                ", danioAtaque=" + danioAtaque +
                ", puntosVidaBase=" + puntosVidaBase +
                '}';
    }
}
