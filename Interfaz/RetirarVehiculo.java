package Interfaz;
import javax.swing.*;
public class RetirarVehiculo extends JFrame {
    public RetirarVehiculo() {
        setTitle("Retirar Vehículo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        JLabel titulo = new JLabel("Formulario de Retiro de Vehículo");
        add(titulo);
        titulo.setBounds(80, 20, 250, 30);

        JLabel lblPatente = new JLabel("Patente del vehículo:");
        add(lblPatente);
        lblPatente.setBounds(50, 70, 150, 25);

        JTextField txtPatente = new JTextField();
        add(txtPatente);
        txtPatente.setBounds(200, 70, 150, 25);

        JButton btnRetirar = new JButton("Retirar Vehículo");
        add(btnRetirar);
        btnRetirar.setBounds(130, 120, 150, 30);
    }
     
}
