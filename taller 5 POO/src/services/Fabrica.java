package services;

import domain.Robot;

public interface Fabrica {
    public Robot ensamblarRobot();
    public void editarRobot(String serie);
    public void mostrarRobots();
    public void salir();
}
