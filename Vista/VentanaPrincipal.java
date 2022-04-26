import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.Color;

// :~~Fuente utilizada en los comentarios :Fira Code
// :~~---------/-----------------------/----------------
public class VentanaPrincipal extends JFrame {

    private JLabel EtiquetaPrecioTotal;
    private JTextArea CampoLista,
            CampoBaseDeDatos;
    private JTextField CajaTextoNombre,
            CajaTextoCedula,
            CajaTextoTelefono,
            CajaTextoBuscarProducto;
    private JButton BotonVerde,
            BotonRojo,
            BotonVender,
            BotonAgregar,
            BotonModificar,
            BotonEliminar;

    public VentanaPrincipal() {
        ConfiguracionVentana();
        PanelDatos();
        PanelBotonesDatos();
        PanelBaseDeDatos();
        PanelProducto();
        PanelBotonesProductos();
        PanelBaseDeDatos();
        PanelBotonesBaseDeDatos();
    }

    private void ConfiguracionVentana() {
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setTitle("Esta Es Una Ventana");

        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
    }

    private void PanelDatos() {
        // :==========================================================================
        // ========================= :CAJAS DE TEXTO DEL PANEL DE DATOS :PANEL DE DATOS
        JPanel PanelDatos = new JPanel();
        PanelDatos.setBackground(new Color(123, 219, 200));
        // (Posicion x, Posicion y, tamaño x , tamaño y)
        PanelDatos.setBounds(100, 30, 583, 240);
        PanelDatos.setLayout(null);
        this
                .getContentPane()
                .add(PanelDatos);
        // CAJA DE NOMBRE

        CajaTextoNombre = new JTextField();
        CajaTextoNombre.setBounds(150, 20, 165, 25);
        CajaTextoNombre.setText("Nombre Completo");
        CajaTextoNombre.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent event) {
                if (CajaTextoNombre.getText().equals("Nombre Completo")) {
                    CajaTextoNombre.setText("");
                }
            }

            // :
            @Override
            public void focusLost(FocusEvent event) {
                if (CajaTextoNombre.getText().equals("")) {
                    CajaTextoNombre.setText("Nombre Completo");
                }
            }
        });
        PanelDatos.add(CajaTextoNombre);

        // :~CAJA DE CEDULA
        CajaTextoCedula = new JTextField();
        CajaTextoCedula.setBounds(150, 50, 165, 25);
        CajaTextoCedula.setText("Cedula");
        CajaTextoCedula.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent event) {
                if (CajaTextoCedula.getText().equals("Cedula")) {
                    CajaTextoCedula.setText("");
                }
            }

            // :
            @Override
            public void focusLost(FocusEvent event) {
                if (CajaTextoCedula.getText().equals("")) {
                    CajaTextoCedula.setText("Cedula");
                }
            }
        });
        PanelDatos.add(CajaTextoCedula);

        // :~CAJA DE Telefono
        CajaTextoTelefono = new JTextField();
        CajaTextoTelefono.setBounds(150, 80, 165, 25);
        CajaTextoTelefono.setText("Telefono");
        CajaTextoTelefono.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent event) {
                if (CajaTextoTelefono.getText().equals("Telefono")) {
                    CajaTextoTelefono.setText("");
                }
            }

            // :
            @Override
            public void focusLost(FocusEvent event) {
                if (CajaTextoTelefono.getText().equals("")) {
                    CajaTextoTelefono.setText("Telefono");
                }
            }
        });
        PanelDatos.add(CajaTextoTelefono);

        // :~CAJA DE BUSCAR PRODUCTO
        CajaTextoBuscarProducto = new JTextField();
        CajaTextoBuscarProducto.setBounds(150, 110, 165, 25);
        CajaTextoBuscarProducto.setText("Buscar Producto");
        CajaTextoBuscarProducto.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent event) {
                if (CajaTextoBuscarProducto.getText().equals("Buscar Producto")) {
                    CajaTextoBuscarProducto.setText("");
                }
            }

            // :
            @Override
            public void focusLost(FocusEvent event) {
                if (CajaTextoBuscarProducto.getText().equals("")) {
                    CajaTextoBuscarProducto.setText("Buscar Producto");
                }
            }
        });
        PanelDatos.add(CajaTextoBuscarProducto);

        // ==========================================================================
        // BOTONES DEL PANEL DE DATOS :BOTÓN VERDE
        /*
         * javax.swing.GroupLayout layout = new
         * javax.swing.GroupLayout(getContentPane());
         * getContentPane().setLayout(layout);
         * layout.setHorizontalGroup(
         * layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         * .addGroup(layout.createSequentialGroup()
         * // .addGap(0, 0, 0)
         * // .addGap(1, 1, 1) alineado con el panel de la derecha
         * .addGap(0, 0, 0)
         * .addComponent(PanelDatos, javax.swing.GroupLayout.DEFAULT_SIZE,
         * javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         * .addGap(0, 5/* no tocar el 5
         */ /*
             * , 840)));
             * layout.setVerticalGroup(
             * layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             * .addGroup(layout.createSequentialGroup()
             * .addGap(100, 100, 100)
             * .addComponent(PanelDatos, javax.swing.GroupLayout.DEFAULT_SIZE,
             * javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
             * .addGap(100, 100, 750)));
             * // addGap(nada, tamaño inferior ,)
             */

    }

    // .addGap(400, 400, 750)));
    // .addGap(200, 223, 750)));

    private void PanelBotonesDatos() {
        JPanel PanelBotonesDatos = new JPanel();
        PanelBotonesDatos.setBackground(new Color(123, 172, 198));
        // (Posicion x, Posicion y, tamaño x , tamaño y)
        PanelBotonesDatos.setBounds(100, 270, 583, 60);
        PanelBotonesDatos.setLayout(null);
        this
                .getContentPane()
                .add(PanelBotonesDatos);

        BotonVerde = new JButton();
        BotonVerde.setText("Boton Verde");
        BotonVerde.setBackground(new Color(155, 243, 120));
        BotonVerde.setBounds(250, 10, 140, 40);
        PanelBotonesDatos.add(BotonVerde);
        // ActionListener Para Botón Verde
        ActionListener AccionBotonVerde = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out
                        .println("Has presionado el botón Vender");
            }
        };
        BotonVerde.addActionListener(AccionBotonVerde);

        // botón rojo
        BotonRojo = new JButton();
        BotonRojo.setText("Boton rojo");
        BotonRojo.setBackground(new Color(241, 105, 99));
        BotonRojo.setBounds(400, 10, 140, 40);
        PanelBotonesDatos.add(BotonRojo);
        // ActionListener Para Botón Rojo
        ActionListener AccionBotonRojo = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out
                        .println("Has presionado el botón Rojo");
            }
        };
        BotonRojo.addActionListener(AccionBotonRojo);
    }

    private void PanelProducto() {
        // :PANEL DE DATOS
        JPanel PanelProducto = new JPanel();
        PanelProducto.setBackground(new Color(71, 225, 125));
        // (Posicion x, Posicion y, tamaño x , tamaño y)
        PanelProducto.setBounds(683, 30, 617, 240);
        PanelProducto.setLayout(null);
        this
                .getContentPane()
                .add(PanelProducto);

        // :~LISTA
        CampoLista = new JTextArea();
        CampoLista.setBounds(20, 40, 200, 100);
        CampoLista.setBackground(new Color(209, 230, 228));
        CampoLista.setText("Lista...");
        PanelProducto.add(CampoLista);
    }

    private void PanelBotonesProductos() {
        JPanel PanelBotonesProductos = new JPanel();
        PanelBotonesProductos.setBackground(new Color(220, 224, 103));
        // (Posicion x, Posicion y, tamaño x , tamaño y)
        PanelBotonesProductos.setBounds(683, 270, 617, 60);
        PanelBotonesProductos.setLayout(null);
        this
                .getContentPane()
                .add(PanelBotonesProductos);

        // botón Vender
        BotonVender = new JButton();
        BotonVender.setText("VENDER");
        BotonVender.setBackground(new Color(155, 243, 120));
        BotonVender.setBounds(350, 10, 250, 40);
        PanelBotonesProductos.add(BotonVender);
        // ActionListener Para Botón De VENDER
        ActionListener AccionBotonVender = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out
                        .println("Has presionado el botón de VENDER");
            }
        };
        BotonVender.addActionListener(AccionBotonVender);

        // :~PRECIO TOTAL
        EtiquetaPrecioTotal = new JLabel();
        EtiquetaPrecioTotal.setBounds(20, 20, 50, 20);
        EtiquetaPrecioTotal.setText("Total...");
        PanelBotonesProductos.add(EtiquetaPrecioTotal);
    }

    private void PanelBaseDeDatos() {
        // :PANEL DE DATOS
        JPanel PanelBaseDeDatos = new JPanel();
        PanelBaseDeDatos.setBackground(new Color(255, 71, 148));
        PanelBaseDeDatos.setBounds(100, 330, 940, 350);
        PanelBaseDeDatos.setLayout(null);
        this
                .getContentPane()
                .add(PanelBaseDeDatos);

        // :~BASE DE DATOS
        CampoBaseDeDatos = new JTextArea();
        CampoBaseDeDatos.setBounds(20, 20, 900, 310);
        CampoBaseDeDatos.setBackground(new Color(209, 230, 228));
        CampoBaseDeDatos.setText("Base de Datos...");
        PanelBaseDeDatos.add(CampoBaseDeDatos);

    }

    private void PanelBotonesBaseDeDatos() {
        // :PANEL DE BOTONES DE BASE DE DATOS
        JPanel PanelBotonesBaseDeDatos = new JPanel();
        PanelBotonesBaseDeDatos.setBackground(new Color(182, 36, 255));
        PanelBotonesBaseDeDatos.setBounds(1040, 330, 260, 350);
        PanelBotonesBaseDeDatos.setLayout(null);
        this
                .getContentPane()
                .add(PanelBotonesBaseDeDatos);

        // boton Agregar
        BotonAgregar = new JButton();
        BotonAgregar.setText("Agregar");
        BotonAgregar.setBackground(Color.WHITE);
        BotonAgregar.setBounds(30, 40, 170, 30);
        PanelBotonesBaseDeDatos.add(BotonAgregar);
        // ActionListener Para Botón Verde
        ActionListener AccionBotonAgregar = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out
                        .println("Has presionado el botón Agregar");
            }
        };
        BotonAgregar.addActionListener(AccionBotonAgregar);

        // botón Modificar
        BotonModificar = new JButton();
        BotonModificar.setText("Modificar");
        BotonModificar.setBackground(Color.WHITE);
        BotonModificar.setBounds(30, 80, 170, 30);
        PanelBotonesBaseDeDatos.add(BotonModificar);
        // ActionListener Para Botón Verde
        ActionListener AccionBotonModificar = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out
                        .println("Has presionado el botón Modificar");
            }
        };
        BotonModificar.addActionListener(AccionBotonModificar);

        // Botón Eliminar
        BotonEliminar = new JButton();
        BotonEliminar.setText("Borrar");
        BotonEliminar.setBackground(Color.white);
        BotonEliminar.setBounds(30, 120, 170, 30);
        PanelBotonesBaseDeDatos.add(BotonEliminar);
        // ActionListener Para Botón Verde
        ActionListener AccionBotonEliminar = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out
                        .println("Has presionado el botón Eliminar");
            }
        };
        BotonEliminar.addActionListener(AccionBotonEliminar);
    }

}
