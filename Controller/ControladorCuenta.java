package Controller;

import Interfaz.CrearCuenta;
import Interfaz.MenuPrincipal;
import Interfaz.RecargarSaldo;
import Modelos.UsuarioInterno;
import Modelos.Cuenta;
import Modelos.Vehiculo;
import Enum.TipoDocumento;
import Enum.Rol;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class ControladorCuenta {
    private MenuPrincipal vistaMenuPrincipal;
    private CrearCuenta vistaCrearCuenta;
    private RecargarSaldo vistaRecargarSaldo;

    private final List<UsuarioInterno> usuarios = new ArrayList<>();

    //MENU PRINCIPAL
    public void mostrarMenuPrincipal(){
        vistaMenuPrincipal = new MenuPrincipal();
        vistaMenuPrincipal.setLocationRelativeTo(null);
        vistaMenuPrincipal.setVisible(true);
        configurarEventosMenuPrincipal();
    }

    private void configurarEventosMenuPrincipal(){
        vistaMenuPrincipal.getBtnCrearCuenta().addActionListener(e -> {
            vistaMenuPrincipal.dispose();
            mostrarCrearCuenta();
        });

        vistaMenuPrincipal.getBtnRecargarSaldo().addActionListener(e -> {
            vistaMenuPrincipal.dispose();
            mostrarRecargarSaldo();
        });
    }

    //CREAR CUENTA
    public void mostrarCrearCuenta(){
        vistaCrearCuenta = new CrearCuenta();
        vistaCrearCuenta.setLocationRelativeTo(null);
        cargarUsuariosEjemplo();
        poblarComboUsuarios();
        configurarEventosCrearCuenta();
        vistaCrearCuenta.setVisible(true);
    }

    private void configurarEventosCrearCuenta(){
        vistaCrearCuenta.getBtnCrear().addActionListener(e -> {
            String patente = vistaCrearCuenta.getTxtPatente().getText().trim();
            String modelo = vistaCrearCuenta.getTxtModelo().getText().trim();
            UsuarioInterno seleccionado = (UsuarioInterno) vistaCrearCuenta.getCmbUsuarios().getSelectedItem();

            if (seleccionado == null) {
                JOptionPane.showMessageDialog(vistaCrearCuenta, "Seleccione un usuario.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (patente.isEmpty() || modelo.isEmpty()) {
                JOptionPane.showMessageDialog(vistaCrearCuenta, "Complete patente y modelo.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Crear cuenta y vehículo y relacionarlos
            Cuenta cuenta = new Cuenta(seleccionado);
            Vehiculo vehiculo = new Vehiculo(patente, modelo, cuenta);

            // Aquí podrías persistir las instancias en un repositorio; por ahora solo mostramos confirmación
            JOptionPane.showMessageDialog(vistaCrearCuenta,
                    "Cuenta creada para " + seleccionado.getNombre() + "\nVehículo: " + vehiculo.getPatente(),
                    "Éxito",
                    JOptionPane.INFORMATION_MESSAGE);

            // Cerrar ventana de creación
            vistaCrearCuenta.dispose();
            // Volver al menú principal
            mostrarMenuPrincipal();
        });
    }

    private void cargarUsuariosEjemplo() {
        if (!usuarios.isEmpty()) return; 
        usuarios.add(new UsuarioInterno("Juan Pérez", 30, TipoDocumento.DNI, 12345678, "juan@ejemplo.com", 11223344, 1001, Rol.ESTUDIANTE));
        usuarios.add(new UsuarioInterno("María Gómez", 40, TipoDocumento.DNI, 87654321, "maria@ejemplo.com", 44332211, 1002, Rol.PROFESOR));
    }

    private void poblarComboUsuarios() {
        vistaCrearCuenta.getCmbUsuarios().removeAllItems();
        for (UsuarioInterno u : usuarios) {
            vistaCrearCuenta.getCmbUsuarios().addItem(u);
        }
    }

    //RECARGAR SALDO

    public void mostrarRecargarSaldo(){
        vistaRecargarSaldo = new RecargarSaldo();
        vistaRecargarSaldo.setLocationRelativeTo(null);
        vistaRecargarSaldo.setVisible(true);
    }

    private void configurarEventosRecargarSaldo(){
        vistaRecargarSaldo.getBtnRecargar().addActionListener(e -> {
            // Lógica para recargar saldo
            System.out.println("Recargar saldo...");
        });
    }

}
