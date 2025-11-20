package Interfaz;
import javax.swing.*;

public class Inicio extends JFrame {

    private JButton btnAdministrarCuenta;
    private JButton btnAdministrarEstacionamiento;

    public Inicio() {
        setTitle("Inicio de la Aplicación");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel bienvenida = new JLabel("Bienvenido a Estacionamiento UTN", SwingConstants.CENTER);
        bienvenida.setBounds(50, 50, 300, 30);
        add(bienvenida);

        btnAdministrarCuenta = new JButton("Administrar Cuenta");
        btnAdministrarCuenta.setBounds(100, 100, 200, 30);
        add(btnAdministrarCuenta);

        btnAdministrarEstacionamiento = new JButton("Administrar Estacionamiento");
        btnAdministrarEstacionamiento.setBounds(100, 150, 200, 30);
        add(btnAdministrarEstacionamiento);
    }

    public JButton getBtnAdministrarCuenta() {
        return btnAdministrarCuenta;
    }

    public JButton getBtnAdministrarEstacionamiento() {
        return btnAdministrarEstacionamiento;
    }
}

