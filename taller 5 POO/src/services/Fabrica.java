package services;

import domain.Robot;

public interface Fabrica {
    /**
     * método para ensamblar robot
     * @return
     */
    public Robot ensamblarRobot();

    /**
     * metodo para editar un robot
     * @param serie
     */
    public void editarRobot(String serie);

    /**
     * metodo para mostrar los robots
     */
    public void mostrarRobots();

    /**
     * metodo para salir
     */
    public void salir();
}
