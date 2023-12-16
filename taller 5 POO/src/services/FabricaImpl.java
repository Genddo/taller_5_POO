package services;

import domain.Robot;

public class FabricaImpl implements Fabrica{
    private static FabricaImpl instancia = null;
    private SistemaRobotsFacade sistema = new SistemaRobotsFacade();
    private FabricaImpl(){

    }

    public static FabricaImpl obtenerInstancia() {
        // Verifica si la instancia ya ha sido creada
        if (instancia == null) {
            // Si no existe, crea una nueva instancia
            instancia = new FabricaImpl();
        }
        // Devuelve la instancia única
        return instancia;
    }

    @Override
    public Robot ensamblarRobot() {
        return sistema.crearRobot();
    }

    @Override
    public void editarRobot(String serie) {
        sistema.editarRobot(serie);
    }

    @Override
    public void mostrarRobots() {
        sistema.mostrarRobots();
    }

    @Override
    public void salir() {
        sistema.destruccionDatos();
    }
}
