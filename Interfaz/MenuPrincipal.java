package Interfaz;
import javax.swing.*;

public class MenuPrincipal extends JFrame {
    public MenuPrincipal(){
        setTitle("Menu Principal");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel titulo = new JLabel("Seleccione una opción:", SwingConstants.CENTER);
        titulo.setBounds(100, 20, 200, 30);
        add(titulo);

        JButton btnCrearCuenta = new JButton("Crear Cuenta");
        btnCrearCuenta.setBounds(125, 70, 150, 30);
        add(btnCrearCuenta);

        btnCrearCuenta.addActionListener(e -> {
            CrearCuenta crearCuentaFrame = new CrearCuenta();
            crearCuentaFrame.setVisible(true);
        });

        JButton btnRecargarSaldo = new JButton("Recargar Saldo");
        btnRecargarSaldo.setBounds(125, 110, 150, 30);
        add(btnRecargarSaldo);



    }
}
