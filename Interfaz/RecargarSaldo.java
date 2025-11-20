package Interfaz;
import javax.swing.*;

public class RecargarSaldo extends JFrame {
    public RecargarSaldo() {
        setTitle("Recargar Saldo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        JLabel titulo = new JLabel("Recargar Saldo de la Cuenta");
        add(titulo);
        titulo.setBounds(100, 20, 200, 30);

        JLabel lblCantidad = new JLabel("Cantidad a recargar:");
        add(lblCantidad);
        lblCantidad.setBounds(50, 70, 150, 25);

        JTextField txtCantidad = new JTextField();
        add(txtCantidad);
        txtCantidad.setBounds(200, 70, 100, 25);

        JButton btnRecargar = new JButton("Recargar");
        add(btnRecargar);
        btnRecargar.setBounds(150, 120, 100, 30);
    }
    
}
