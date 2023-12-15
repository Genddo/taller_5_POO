package domain;

public class ParteRobot {
    private Material material;

    // Constructor
    public ParteRobot(Material material) {
        this.material = material;
    }

    // Métodos para obtener propiedades del material
    public int getPuntosDefensa() {
        return material.getPuntosDefensa();
    }

    public int getDanioAtaque() {
        return material.getDanioAtaque();
    }

    public int getPuntosVidaBase() {
        return material.getPuntosVidaBase();
    }
    // Método para cambiar el material de la parte del robot
    public void cambiarMaterial(Material nuevoMaterial) {
        this.material = nuevoMaterial;
    }

    // Método para recalcular las estadísticas después de cambiar el material
    public void recalcularEstadisticas() {

    }

}
