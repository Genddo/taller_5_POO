package services;

import domain.Robot;
import java.util.Random;

public class FabricaRobots {
    private static FabricaRobots instancia = null;
    private Random generadorNumeroSerie = new Random();

    private FabricaRobots() {
        // Constructor privado para evitar la creación de instancias
    }

    public static FabricaRobots obtenerInstancia() {
        if (instancia == null) {
            instancia = new FabricaRobots();
        }
        return instancia;
    }

    public Robot ensamblarRobot() {
        Robot nuevoRobot = new Robot();
        nuevoRobot.numeroSerie = generarNumeroSerieAleatorio();

        // Solicitar al usuario el material para cada parte del robot
        nuevoRobot.cabeza = ensamblarParteRobot("Cabeza");
        nuevoRobot.cuerpo = ensamblarParteRobot("Cuerpo");
        nuevoRobot.brazos = ensamblarParteRobot("Brazos");
        nuevoRobot.piernas = ensamblarParteRobot("Piernas");

        // Devolver el robot ensamblado
        return nuevoRobot;
    }

    private ParteRobot ensamblarParteRobot(String tipoParte) {
        Material material = solicitarMaterialAlUsuario(tipoParte);
        ParteRobot parte = new ParteRobot();
        parte.material = material;
        return parte;
    }

    private Material solicitarMaterialAlUsuario(String tipoParte) {
        // solicitar material para una parte del robot
        // implementar un cuadro de diálogo, leer de la consola, etc.
        // Devuelve el material seleccionado

        return new Material();
    }

    private String generarNumeroSerieAleatorio() {
        // Genera un número de serie aleatorio de 4 letras y 2 números
        StringBuilder numeroSerie = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            char letra = (char) (generadorNumeroSerie.nextInt(26) + 'A');
            numeroSerie.append(letra);
        }
        for (int i = 0; i < 2; i++) {
            int numero = generadorNumeroSerie.nextInt(10);
            numeroSerie.append(numero);
        }
        return numeroSerie.toString();
    }

    // Otros métodos según sea necesario
}