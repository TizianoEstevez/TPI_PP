package Interfaz;
import javax.swing.*;

public class Inicio extends JFrame {
    public Inicio() {
        setTitle("Inicio de la Aplicación");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel bienvenida = new JLabel("Bienvenido a Estacionamiento UTN", SwingConstants.CENTER);
        bienvenida.setBounds(50, 30, 300, 30);
        add(bienvenida);

        JButton btnAdministrarCuenta = new JButton("Administrar Cuenta");
        btnAdministrarCuenta.setBounds(100, 80, 200, 30);
        add(btnAdministrarCuenta);

        JButton btnAdministrarEstacionamiento = new JButton("Administrar Estacionamiento");
        btnAdministrarEstacionamiento.setBounds(100, 120, 200, 30);
        add(btnAdministrarEstacionamiento);


    }
}
