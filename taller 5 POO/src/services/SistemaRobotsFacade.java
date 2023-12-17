package services;

import domain.Robot;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaRobotsFacade {
    private FabricaRobots fabrica = FabricaRobots.obtenerInstancia();

    /**
     * método que ensambla un robot
     * @param modo
     * @param serie
     * @return
     */
    public Robot ensamblarRobot(String modo, String serie) {
        Robot nuevoRobot = fabrica.ensamblarRobot(modo, serie);
        if (modo.equals("crear")) {
            getListaRobots().add(nuevoRobot);
        }if (modo.equals("editar")) {
            return null;
        }
        return nuevoRobot;
    }

    /**
     * método que crea un robot
     * @return
     */
    public Robot crearRobot(){
        return ensamblarRobot("crear", "");
    }

    /**
     * método que edita un robot dado un número de serie
     * @param numeroSerie
     */
    public void editarRobot(String numeroSerie) {
        Robot curRobot = fabrica.buscarRobotPorNumeroSerie(numeroSerie);

        if (curRobot != null) {
            ensamblarRobot("editar", numeroSerie);
        } else {
            System.out.println("No se encontró el robot con el número de serie: " + numeroSerie);
        }
    }

    /**
     * método que muestra todos los robots disponibles
     */
    public void mostrarRobots() {
        if (getListaRobots().size() > 0) {
            for (Robot robot : getListaRobots()) {
                // Lógica para mostrar la información de cada robot
                fabrica.mostrarDetalles(robot.getNumeroSerie());
            }
        }else{
            fabrica.separador();
            print("No hay ningún robot en la base de datos");
            fabrica.separador();
        }
    }

    /**
     * método que destruye los datos de la lista de robots, para evitar dejar un rastro a los robots malvados
     */
    public void destruccionDatos(){
        print("Eliminando lista de robots creados...");
        getListaRobots().clear();
        print("Cerrando programa...");
    }

    /**
     * método que obtiene la lista de los robots
     * @return
     */
    public ArrayList<Robot> getListaRobots(){
        return fabrica.getListaRobots();
    }

    /**
     * método para simplificar la salida de mensajes
     * @param mensaje
     */
    private void print(Object mensaje){
        System.out.println(mensaje);
    }
}