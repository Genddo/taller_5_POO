package ui;

import services.FabricaImpl;
import services.FabricaRobots;
import services.SistemaRobotsFacade;

import javax.swing.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipal extends JFrame {
    private FabricaImpl sistema = FabricaImpl.obtenerInstancia();

    public MenuPrincipal() {
        super("Gokai-Oh Emergency Robot Assembly Program");

        System.out.println("¡Bienvenido al programa de creación de robots de emegencia de Gokai-Oh!\nEn Gokai-Oh somos conscientes de la amenaza de nuestros robots y sentimos las molestias ocasionadas,\nEstamos trabajando muy duro para solucionar este problema\n");

        JButton ensamblarButton = new JButton("Ensamblar Robot");
        JButton editarButton = new JButton("Editar Robot");
        JButton mostrarButton = new JButton("Mostrar Robots");
        JButton salirButton = new JButton("Salir");

        ensamblarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sistema.ensamblarRobot();
                JOptionPane.showMessageDialog(MenuPrincipal.this, "Robot ensamblado correctamente");
            }
        });

        editarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numeroSerie = "";
                try {
                    numeroSerie = JOptionPane.showInputDialog(MenuPrincipal.this, "Ingrese el número de serie del robot a editar:");

                    if ((!numeroSerie.equals("")) && (!numeroSerie.equals(" ")) && (!numeroSerie.equals(".")) && (!(numeroSerie == null))) {
                        sistema.editarRobot(numeroSerie);
                        JOptionPane.showMessageDialog(MenuPrincipal.this, "Robot editado correctamente");
                    } else {
                        JOptionPane.showMessageDialog(MenuPrincipal.this, "Por favor ingrese una serie");
                    }
                }
                catch(NullPointerException exception){
                    System.out.println("Has cancelado la edición de robots");
                }
            }
        });

        mostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sistema.mostrarRobots();
                // Lógica para mostrar la información de todos los robots
            }
        });

        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sistema.salir();
                System.exit(0);
            }
        });

        JPanel panel = new JPanel();
        panel.add(ensamblarButton);
        panel.add(editarButton);
        panel.add(mostrarButton);
        panel.add(salirButton);

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MenuPrincipal menu = new MenuPrincipal();
            menu.setSize(400, 200);
            menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            menu.setVisible(true);
        });
    }
}