import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 * VentanaPrincipal2
 */
 public class VentanaPrincipal2 extends JFrame{
  private JTextField cajaTextoNombre;
  private static JLabel label1;
  public VentanaPrincipal2(){
    ConfiguracionVentana();
    Componentes();

  }
  private void ConfiguracionVentana(){
    int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;//Coje la resolucion de la pantalla en alto
    int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;//Coje la resolucion de la pantalla en ancho
      this.setTitle("Esta Es Una Ventana");
      this.setBounds((ancho / 2) - (this.getWidth() / 2), (alto / 2) - (this.getHeight() / 2), 1600, 1000);// Hace que siempre este a la misma resolucion
      this.setLocationRelativeTo(null);
      this.setLayout(null);
    //  this.setResizable(false);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }
  private void Componentes(){
  label1 = new JLabel("cajaTextoNombre: ");
  label1.setBounds(10,20,100,25);
    this.add(label1);

    cajaTextoNombre = new JTextField();
    cajaTextoNombre.setBounds(100,20,160,25);
    cajaTextoNombre.setText("Nombre completo");

    cajaTextoNombre.addFocusListener(new FocusListener(){
        @Override
        public void focusGained(FocusEvent event){
            if (cajaTextoNombre.getText().equals("Nombre completo")){
                cajaTextoNombre.setText("");
            }
        }

        @Override
        public void focusLost(FocusEvent event){
            if (cajaTextoNombre.getText().equals("")){
                cajaTextoNombre.setText("Nombre completo");
            }
        }
    });


}


}
