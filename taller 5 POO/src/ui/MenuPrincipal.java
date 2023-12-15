package ui;

import services.SistemaRobotsFacade;

import javax.swing.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipal extends JFrame {
    private SistemaRobotsFacade sistema = new SistemaRobotsFacade();

    public MenuPrincipal() {
        super("Menú Principal");

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
                String numeroSerie = JOptionPane.showInputDialog(MenuPrincipal.this, "Ingrese el número de serie del robot a editar:");
                sistema.editarRobot(numeroSerie);
                JOptionPane.showMessageDialog(MenuPrincipal.this, "Robot editado correctamente");
            }
        });

        mostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sistema.mostrarRobots();
                // Lógica para mostrar la información de todos los robots en una ventana
            }
        });

        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Puedes agregar lógica de limpieza o guardar datos antes de salir
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