
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
      int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
      int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.setTitle("Esta Es Una Ventana");
        this.setBounds((ancho / 2) - (this.getWidth() / 2), (alto / 2) - (this.getHeight() / 2), 500, 500);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void inicializarComponentes() {
        // creamos los componentes
        texto = new JLabel();
        caja = new JTextField();
        boton = new JButton();
        // configuramos los componentes
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
