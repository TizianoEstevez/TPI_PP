package Interfaz;
import javax.swing.*;

public class MenuEstacionamiento extends JFrame{
    public MenuEstacionamiento(){
        setTitle("Menu Estacionamiento");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel titulo = new JLabel("Seleccione una opción:", SwingConstants.CENTER);
        titulo.setBounds(100, 20, 200, 30);
        add(titulo);

        JButton btnIngresarVehiculo = new JButton("Ingresar Vehículo");
        btnIngresarVehiculo.setBounds(125, 70, 150, 30);
        add(btnIngresarVehiculo);

        JButton btnRetirarVehiculo = new JButton("Retirar Vehículo");
        btnRetirarVehiculo.setBounds(125, 110, 150, 30);
        add(btnRetirarVehiculo);
    }
}
