package services;

import domain.Robot;
import java.util.ArrayList;

public class SistemaRobotsFacade {
    private FabricaRobots fabrica = FabricaRobots.obtenerInstancia();
    private ArrayList<Robot> listaRobots = new ArrayList<>();

    public void ensamblarRobot() {
        Robot nuevoRobot = fabrica.ensamblarRobot();
        listaRobots.add(nuevoRobot);

    }

    public void editarRobot(String numeroSerie) {
        Robot robotSeleccionado = buscarRobotPorNumeroSerie(numeroSerie);

        if (robotSeleccionado != null) {
            // Lógica para editar un robot existente, por ejemplo, reemplazar piezas
        } else {
            System.out.println("No se encontró el robot con el número de serie: " + numeroSerie);
        }
    }

    public void mostrarRobots() {
        for (Robot robot : listaRobots) {
            // Lógica para mostrar la información de cada robot
            System.out.println("Número de serie: " + robot.numeroSerie);

        }
    }

    private Robot buscarRobotPorNumeroSerie(String numeroSerie) {
        for (Robot robot : listaRobots) {
            if (robot.numeroSerie.equals(numeroSerie)) {
                return robot;
            }
        }
        return null;
    }


}