package Interfaz;
import javax.swing.*;

public class MenuPrincipal extends JFrame {
    private JButton btnCrearCuenta;
    private JButton btnRecargarSaldo;

    public MenuPrincipal(){
        setTitle("Menu Principal");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel titulo = new JLabel("Seleccione una opción:", SwingConstants.CENTER);
        titulo.setBounds(100, 20, 200, 30);
        add(titulo);

        btnCrearCuenta = new JButton("Crear Cuenta");
        btnCrearCuenta.setBounds(125, 70, 150, 30);
        add(btnCrearCuenta);

        btnRecargarSaldo = new JButton("Recargar Saldo");
        btnRecargarSaldo.setBounds(125, 110, 150, 30);
        add(btnRecargarSaldo);

    }

    public JButton getBtnCrearCuenta() {
        return btnCrearCuenta;
    }

    public JButton getBtnRecargarSaldo() {
        return btnRecargarSaldo;
    }

}
