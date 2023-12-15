package domain;

public class Robot {
    private String numeroSerie;
    private ParteRobot cabeza;
    private ParteRobot cuerpo;
    private ParteRobot brazos;
    private ParteRobot piernas;

    public Robot(String numeroSerie, ParteRobot cabeza, ParteRobot cuerpo, ParteRobot brazos, ParteRobot piernas) {
        this.numeroSerie = numeroSerie;
        this.cabeza = cabeza;
        this.cuerpo = cuerpo;
        this.brazos = brazos;
        this.piernas = piernas;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void mostrarDetalles() {
        System.out.println("Número de Serie: " + numeroSerie);
        System.out.println("Cabeza: " + cabeza.material.nombre);
        System.out.println("Cuerpo: " + cuerpo.material.nombre);
        System.out.println("Brazos: " + brazos.material.nombre);
        System.out.println("Piernas: " + piernas.material.nombre);
        // Mostrar otras propiedades según sea necesario
    }

    public void editarParte(ParteRobot nuevaParte, String tipoParte) {
        switch (tipoParte.toLowerCase()) {
            case "cabeza":
                cabeza = nuevaParte;
                break;
            case "cuerpo":
                cuerpo = nuevaParte;
                break;
            case "brazos":
                brazos = nuevaParte;
                break;
            case "piernas":
                piernas = nuevaParte;
                break;
            default:
                System.out.println("Tipo de parte no válido");
        }
    }
}
