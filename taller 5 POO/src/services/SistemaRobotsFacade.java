package services;

import domain.Robot;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaRobotsFacade {
    private FabricaRobots fabrica = FabricaRobots.obtenerInstancia();

    public Robot ensamblarRobot(String modo, String serie) {
        Robot nuevoRobot = fabrica.ensamblarRobot(modo, serie);
        if (modo.equals("crear")) {
            getListaRobots().add(nuevoRobot);
        }if (modo.equals("editar")) {
            return null;
        }
        return nuevoRobot;
    }
    public Robot crearRobot(){
        return ensamblarRobot("crear", "");
    }

    public void editarRobot(String numeroSerie) {
        Robot curRobot = fabrica.buscarRobotPorNumeroSerie(numeroSerie);

        if (curRobot != null) {
            ensamblarRobot("editar", numeroSerie);
        } else {
            System.out.println("No se encontró el robot con el número de serie: " + numeroSerie);
        }
    }

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
    public void destruccionDatos(){
        print("Eliminando lista de robots creados...");
        getListaRobots().clear();
        print("Cerrando programa...");
    }
    public ArrayList<Robot> getListaRobots(){
        return fabrica.getListaRobots();
    }
    private void print(Object mensaje){
        System.out.println(mensaje);
    }
}