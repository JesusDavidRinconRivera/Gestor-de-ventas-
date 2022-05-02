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

    Ventana1.setVisible(true);

  }
}
