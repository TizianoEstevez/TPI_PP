package Interfaz;
import javax.swing.*;

import Modelos.Plaza;
public class IngresarVehiculo extends JFrame{
    public IngresarVehiculo(){
        setTitle("Ingresar Vehículo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel titulo = new JLabel("Ingresar Vehículo al Estacionamiento");
        add(titulo);
        titulo.setBounds(80, 20, 250, 30);

        JLabel lblPatente = new JLabel("Patente del Vehículo:");
        add(lblPatente);
        lblPatente.setBounds(50, 70, 150, 25);

        JTextField txtPatente = new JTextField();
        add(txtPatente);
        txtPatente.setBounds(200, 70, 100, 25);

        JLabel lblPlaza = new JLabel("Número de Plaza:");
        add(lblPlaza);
        lblPlaza.setBounds(50, 110, 150, 25);

        JComboBox<Plaza> cmbPlazas = new JComboBox<>();
        add(cmbPlazas);
        cmbPlazas.setBounds(200, 110, 100, 25);

        JButton btnIngresar = new JButton("Ingresar Vehículo");
        add(btnIngresar);
        btnIngresar.setBounds(130, 160, 150, 30);
    }
    
}
