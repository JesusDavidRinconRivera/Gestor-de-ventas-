

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class VentanaPrincipal extends JFrame {

    private JLabel texto;
    private JTextField caja;
    private JButton boton;

    public VentanaPrincipal() {
        configurarVentana();
        inicializarComponentes();
    }

    private void configurarVentana() {
      int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;    //Coje la resolucion de la pantalla en alto
      int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;     //Coje la resolucion de la pantalla en ancho
        this.setBounds((ancho / 2) - (this.getWidth() / 2), (alto / 2) - (this.getHeight() / 2), 500, 500); // Hace que siempre este a la misma resolucion
        this.setTitle("Esta Es Una Ventana");
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void inicializarComponentes() {
        texto = new JLabel();
        caja = new JTextField();
        boton = new JButton();
        texto.setText("Inserte Nombre");
        texto.setBounds(50, 50, 100, 25);
        caja.setBounds(150, 50, 100, 25);
        boton.setText("Mostrar Mensaje");
        boton.setBounds(50, 100, 200, 30);
        this.add(texto);
        this.add(caja);
        this.add(boton);
    }


}
