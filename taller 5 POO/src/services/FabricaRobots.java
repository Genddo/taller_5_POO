package services;

import domain.ParteRobot;
import domain.Robot;
import domain.TipoMaterial;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FabricaRobots {
    private static FabricaRobots instancia = null;
    private Random generadorNumeroSerie = new Random();
    private ArrayList<Robot> listaRobots = new ArrayList<>();

    private FabricaRobots() {
        // Constructor privado para evitar la creación de instancias
    }

    public static FabricaRobots obtenerInstancia() {
        if (instancia == null) {
            instancia = new FabricaRobots();
        }
        return instancia;
    }

    public Robot ensamblarRobot(String modo, String serie) {
        if (modo.equals("crear")){
            print("Crear un robot: ");
        }
        String newSeries = generarNumeroSerieAleatorio();

        // Solicitar al usuario el material para cada parte del robot
        ParteRobot cabeza = ensamblarParteRobot(" La ", "Cabeza");
        ParteRobot cuerpo = ensamblarParteRobot(" El ","Cuerpo");
        ParteRobot brazos = ensamblarParteRobot("n Los ","Brazos");
        ParteRobot piernas = ensamblarParteRobot("n Las ","Piernas");
        separador();

        int def = cabeza.getPuntosDefensa() + cuerpo.getPuntosDefensa() + brazos.getPuntosDefensa() + piernas.getPuntosDefensa();
        int atq = cabeza.getDanioAtaque() + cuerpo.getDanioAtaque() + brazos.getDanioAtaque() + piernas.getDanioAtaque();
        int hp = cabeza.getPuntosVidaBase() + cuerpo.getPuntosVidaBase() + brazos.getPuntosVidaBase() + piernas.getPuntosVidaBase();
        Robot nuevoRobot = null;
        if (modo.equals("crear")) {
            nuevoRobot = crearRobot(newSeries,cabeza,cuerpo,brazos,piernas,def,atq,hp);

        }
        if (modo.equals("editar")){
            Robot robot = buscarRobotPorNumeroSerie(serie);
            editarRobot(robot,cabeza,cuerpo,brazos,piernas,def,atq,hp);
        }

        // Devolver el robot ensamblado
        return nuevoRobot;
    }
    private Robot crearRobot(String serie, ParteRobot cabeza, ParteRobot cuerpo, ParteRobot brazos, ParteRobot piernas, int def, int atq, int hp){
        Robot newRobot = new Robot();
        newRobot.setNumeroSerie(serie);
        newRobot.setCabeza(cabeza);
        newRobot.setCuerpo(cuerpo);
        newRobot.setBrazos(brazos);
        newRobot.setPiernas(piernas);
        newRobot.setPuntosDefensa(def);
        newRobot.setDanioAtaque(atq);
        newRobot.setPuntosVidaBase(hp);
        return newRobot;
    }
    private void editarRobot(Robot robot, ParteRobot cabeza, ParteRobot cuerpo, ParteRobot brazos, ParteRobot piernas, int def, int atq, int hp){
        robot.setCabeza(cabeza);
        robot.setCuerpo(cuerpo);
        robot.setBrazos(brazos);
        robot.setPiernas(piernas);
        robot.setPuntosDefensa(def);
        robot.setDanioAtaque(atq);
        robot.setPuntosVidaBase(hp);
    }

    private ParteRobot ensamblarParteRobot(String pronombre, String tipoParte) {
        TipoMaterial material = solicitarMaterialAlUsuario(pronombre, tipoParte);
        int def = 0;
        int atq = 0;
        int hp = 0;
        if (material == TipoMaterial.METAL){
            def = 25;
            atq = 30;
            hp = 400;
        } else if (material == TipoMaterial.ACERO) {
            def = 50;
            atq = 60;
            hp = 150;
        }else if (material == TipoMaterial.GRAFENO) {
            def = 10;
            atq = 120;
            hp = 500;
        }else if (material == TipoMaterial.VIBRANIUM) {
            def = 100;
            atq = 20;
            hp = 250;
        }
        ParteRobot parte = new ParteRobot(material, def, atq, hp);
        return parte;
    }

    private TipoMaterial solicitarMaterialAlUsuario(String pronombre, String tipoParte) {
        separador();
        // solicitar material para una parte del robot
        // implementar un cuadro de diálogo, leer de la consola, etc.
        // Devuelve el material seleccionado

        TipoMaterial tipoMaterial = null;

        while(true) {
            String tipoMaterialStr = input("¿De que material quieres que sea" + pronombre + tipoParte + "?:");
            if (tipoMaterialStr.equalsIgnoreCase("metal")) {
                tipoMaterial = TipoMaterial.METAL;
                break;
            }
            if (tipoMaterialStr.equalsIgnoreCase("acero")) {
                tipoMaterial = TipoMaterial.ACERO;
                break;
            }
            if (tipoMaterialStr.equalsIgnoreCase("grafeno")) {
                tipoMaterial = TipoMaterial.GRAFENO;
                break;
            }
            if (tipoMaterialStr.equalsIgnoreCase("vibranium")) {
                tipoMaterial = TipoMaterial.VIBRANIUM;
                break;
            } else {
                print(msgError("un material"));
            }
        }
        return tipoMaterial;
    }
    public void mostrarDetalles(String serie) {
        separador();
        Robot robot = buscarRobotPorNumeroSerie(serie);
        separador();
        print("Número de Serie: " + robot.getNumeroSerie());
        print("Cabeza: " + robot.getCabeza());
        print("Cuerpo: " + robot.getCuerpo());
        print("Brazos: " + robot.getBrazos());
        print("Piernas: " + robot.getPiernas());
        print("Puntos de Defensa: " + robot.getPuntosDefensa());
        print("Puntos de Ataque: " + robot.getDanioAtaque());
        print("Puntos de Vida: " + robot.getPuntosVidaBase());
        separador();
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
    public Robot buscarRobotPorNumeroSerie(String numeroSerie) {
        for (Robot robot : getListaRobots()) {
            if (robot.getNumeroSerie().equalsIgnoreCase(numeroSerie)) {
                return robot;
            }
        }
        return null;
    }
    public ArrayList<Robot> getListaRobots(){
        return listaRobots;
    }

    private String input(Object mensaje){
        Scanner s = new Scanner(System.in);
        System.out.println(mensaje);
        return s.nextLine();
    }
    private void print(Object mensaje){
        System.out.println(mensaje);
    }
    private String msgError(String tipoDato){
        return "Ha ingresado " + tipoDato + " inválido, por favor inténtelo de nuevo";
    }
    public void separador(){
        System.out.println("-----------------------------\n");
    }

    // Otros métodos según sea necesario
}