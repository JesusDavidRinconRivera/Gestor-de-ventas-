import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class VentanaPrincipal extends JFrame {

    private JLabel texto;
    private JTextField caja1,caja2,caja3,caja4;
    private JButton boton,Boton1,Boton2;

    public VentanaPrincipal() {

        configurarVentana();
        inicializarComponentes();
    }

    private void configurarVentana() {
      int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
      int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.setTitle("Esta Es Una Ventana");
        this.setBounds((ancho / 2) - (this.getWidth() / 2), (alto / 2) - (this.getHeight() / 2), 1600, 1000);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void inicializarComponentes() {
        // creamos los componentes
        texto = new JLabel();
        caja1 = new JTextField();
        caja2 = new JTextField();
        caja3 = new JTextField();
        caja4 = new JTextField();
        boton = new JButton();
        // configuramos los componentes
        texto.setText("Inserte Nombre");
        texto.setBounds(50, 50, 100, 25);
        caja1.setBounds(150,50, 100, 25);
        caja2.setBounds(150,250, 100, 25);
        caja3.setBounds(150,350, 100, 25);
        caja4.setBounds(150, 450, 100, 25);

        boton.setText("Mostrar Mensaje");
        boton.setBounds(50, 100, 200, 30);


        this.add(texto);
        this.add(caja1);
        this.add(caja2);
        this.add(caja3);
        this.add(caja4);
        this.add(boton);

        //Botón de Tal
      Boton1 = new JButton();
      Boton1.setText("Boton 2");
      Boton1.setBounds(150, 150, 200, 30);
      this.add(Boton1);

      //botón de otro tal
      Boton2 = new JButton();
      Boton2.setText("Boton 3");
      Boton2.setBounds(200, 200, 200, 30);
      this.add(Boton2);
    }
}
