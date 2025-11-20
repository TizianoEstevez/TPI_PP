package Interfaz;
import javax.swing.*;

import Modelos.UsuarioInterno;

public class CrearCuenta extends JFrame {
    public CrearCuenta() {
        setTitle("Crear Cuenta");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        JLabel titulo = new JLabel("Formulario de Creación de Cuenta");
        add(titulo);
        titulo.setBounds(100, 20, 250, 30);

        JLabel lblUsuario = new JLabel("Usuario:");
        add(lblUsuario);
        lblUsuario.setBounds(50, 70, 100, 25);

        JComboBox<UsuarioInterno> cmbUsuarios = new JComboBox<>();
        add(cmbUsuarios);
        cmbUsuarios.setBounds(150, 70, 200, 25);

        JLabel lblPatente = new JLabel("Patente del vehículo:");
        add(lblPatente);
        lblPatente.setBounds(50, 110, 100, 25);

        JTextField txtPatente = new JTextField();
        add(txtPatente);
        txtPatente.setBounds(150, 110, 200, 25);

        JLabel lblModelo = new JLabel("Modelo del vehículo:");
        add(lblModelo);
        lblModelo.setBounds(50, 150, 100, 25);

        JTextField txtModelo = new JTextField();
        add(txtModelo);
        txtModelo.setBounds(150, 150, 200, 25);

        JButton btnCrear = new JButton("Crear Cuenta");
        add(btnCrear);
        btnCrear.setBounds(150, 200, 120, 30);
    }
}
