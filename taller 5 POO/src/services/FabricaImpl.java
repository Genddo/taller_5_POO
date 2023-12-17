package services;

import domain.Robot;

public class FabricaImpl implements Fabrica{
    private static FabricaImpl instancia = null;
    private SistemaRobotsFacade sistema = new SistemaRobotsFacade();
    private FabricaImpl(){

    }

    /**
     * método que permite el patrón de diseño Singleton
     * @return
     */
    public static FabricaImpl obtenerInstancia() {
        // Verifica si la instancia ya ha sido creada
        if (instancia == null) {
            // Si no existe, crea una nueva instancia
            instancia = new FabricaImpl();
        }
        // Devuelve la instancia única
        return instancia;
    }

    /**
     * método para ensamblar robot
     * @return
     */
    @Override
    public Robot ensamblarRobot() {
        return sistema.crearRobot();
    }

    /**
     * metodo para editar un robot
     * @param serie
     */
    @Override
    public void editarRobot(String serie) {
        sistema.editarRobot(serie);
    }

    /**
     * metodo para mostrar los robots
     */
    @Override
    public void mostrarRobots() {
        sistema.mostrarRobots();
    }

    /**
     * metodo para salir
     */
    @Override
    public void salir() {
        sistema.destruccionDatos();
    }
}
