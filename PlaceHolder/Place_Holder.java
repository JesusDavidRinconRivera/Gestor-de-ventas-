import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Place_Holder {
    private static JLabel label1,label2;
    private static JTextField name,father_Name;
    private static JButton print;

    public static void main(String[] args){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;//Coje la resolucion de la pantalla en alto
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;//Coje la resolucion de la pantalla en ancho
        frame.setTitle("Esta Es Una Ventana");
        frame.setBounds((ancho / 2) - (frame.getWidth() / 2), (alto / 2) - (frame.getHeight() / 2), 1600, 1000);// Hace que siempre este a la misma resolucion
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.add(panel);
        panel.setLayout(null);


        name = new JTextField();
        name.setBounds(100,20,165,25);
        name.setText("Enter Your Name");
        name.addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent event){
                if (name.getText().equals("Enter Your Name")){
                    name.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent event){
                if (name.getText().equals("")){
                    name.setText("Enter Your Name");
                }
            }
        });
        panel.add(name);


        father_Name = new JTextField();
        father_Name.setBounds(100,70,156,25);
        father_Name.setText("Enter Your Father Name");
        father_Name.addFocusListener(new FocusListener(){
           @Override
           public void focusGained(FocusEvent event){
               if (father_Name.getText().equals("Enter Your Father Name")){
                   father_Name.setText("");
               }
           }

           @Override
            public void focusLost(FocusEvent event){
               if (father_Name.getText().equals("")){
                   father_Name.setText("Enter Your Father Name");
               }
           }
        });
        panel.add(father_Name);
        frame.setVisible(true);
    }

}
