<<<<<<< HEAD
public class Main {
  public static void main(String[] args) {
    VentanaPrincipal Ventana1 = new VentanaPrincipal();

=======
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import com.jtattoo.plaf.hifi.HiFiLookAndFeel;

public class Main {
  public static void main(String[] args) {
    conect con = new conect();
    VentanaPrincipal Ventana1 = new VentanaPrincipal();

    try {
      UIManager.setLookAndFeel(new HiFiLookAndFeel());
    } catch (UnsupportedLookAndFeelException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

>>>>>>> 498c465a8cf13c2913d5ec834eb78b7dd527422c
    Ventana1.setVisible(true);

  }
}
