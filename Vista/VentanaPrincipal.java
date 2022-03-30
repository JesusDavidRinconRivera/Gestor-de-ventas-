import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.Color;

 //:~~Fuente utilizada en los comentarios :Fira Code
 //:~~---------/-----------------------/----------------
public class VentanaPrincipal extends JFrame{

  private static JLabel EtiquetaPrecioTotal;
  private static JTextArea CampoLista,CampoBaseDeDatos;
  private static JTextField CajaTextoNombre,CajaTextoCedula,CajaTextoTelefono,CajaTextoBuscarProducto;
  private JButton BotonVerde,BotonRojo,BotonVender,BotonAgregar, BotonModificar,BotonEliminar;

  public VentanaPrincipal(){
    ConfiguracionVentana();
    Componentes();
    CamposDeTexto();
    Botones();
  }
  private void ConfiguracionVentana(){

    int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;//Coje la resolucion de la pantalla en alto
    int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;//Coje la resolucion de la pantalla en ancho
      this.setTitle("Esta Es Una Ventana");
      this.setBounds((ancho / 2) - (this.getWidth() / 2), (alto / 2) - (this.getHeight() / 2), 1600, 1000);// Hace que siempre este a la misma resolucion
      this.setLocationRelativeTo(null);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setResizable(false);
      this.setLayout(null);
  }
  private void Componentes(){


 }
  private void CamposDeTexto(){
 CajaTextoNombre = new JTextField();
 CajaTextoNombre.setBounds(150,20,165,25);
 CajaTextoNombre.setText("Nombre Completo");
 CajaTextoNombre.addFocusListener(new FocusListener(){
     @Override
     public void focusGained(FocusEvent event){
         if (CajaTextoNombre.getText().equals("Nombre Completo")){
             CajaTextoNombre.setText("");
         }
     }
                   //:
     @Override
     public void focusLost(FocusEvent event){
         if (CajaTextoNombre.getText().equals("")){
             CajaTextoNombre.setText("Nombre Completo");
         }
     }
 });
 this.add(CajaTextoNombre);

 //:~CAJA DE CEDULA
 CajaTextoCedula = new JTextField();
 CajaTextoCedula.setBounds(150,50,165,25);
 CajaTextoCedula.setText("Cedula");
 CajaTextoCedula.addFocusListener(new FocusListener(){
     @Override
     public void focusGained(FocusEvent event){
         if (CajaTextoCedula.getText().equals("Cedula")){
             CajaTextoCedula.setText("");
         }
     }
                   //:
     @Override
     public void focusLost(FocusEvent event){
         if (CajaTextoCedula.getText().equals("")){
             CajaTextoCedula.setText("Cedula");
         }
     }
 });
 this.add(CajaTextoCedula);

 //:~CAJA DE Telefono
 CajaTextoTelefono = new JTextField();
 CajaTextoTelefono.setBounds(150,80,165,25);
 CajaTextoTelefono.setText("Telefono");
 CajaTextoTelefono.addFocusListener(new FocusListener(){
     @Override
     public void focusGained(FocusEvent event){
         if (CajaTextoTelefono.getText().equals("Telefono")){
             CajaTextoTelefono.setText("");
         }
     }
                   //:
     @Override
     public void focusLost(FocusEvent event){
         if (CajaTextoTelefono.getText().equals("")){
             CajaTextoTelefono.setText("Telefono");
         }
     }
 });
 this.add(CajaTextoTelefono);

 //:~CAJA DE BUSCAR PRODUCTO
 CajaTextoBuscarProducto = new JTextField();
 CajaTextoBuscarProducto.setBounds(150,110,165,25);
 CajaTextoBuscarProducto.setText("Buscar Producto");
 CajaTextoBuscarProducto.addFocusListener(new FocusListener(){
     @Override
     public void focusGained(FocusEvent event){
         if (CajaTextoBuscarProducto.getText().equals("Buscar Producto")){
             CajaTextoBuscarProducto.setText("");
         }
     }
                   //:
     @Override
     public void focusLost(FocusEvent event){
         if (CajaTextoBuscarProducto.getText().equals("")){
             CajaTextoBuscarProducto.setText("Buscar Producto");
         }
     }
 });
 this.add(CajaTextoBuscarProducto);


}
  private void Botones(){
 //:~PRECIO TOTAL
 EtiquetaPrecioTotal = new JLabel();
 EtiquetaPrecioTotal.setBounds(800,110,50,50);
 EtiquetaPrecioTotal.setText("Total...");
 this.add(EtiquetaPrecioTotal);

 //:~LISTA
 CampoLista = new JTextArea();
 CampoLista.setBounds(800,20,200,100);
 CampoLista.setBackground(new Color(209, 230, 228));
 CampoLista.setText("Lista...");
 this.add(CampoLista);

 //:~BASE DE DATOS
 CampoBaseDeDatos = new JTextArea();
 CampoBaseDeDatos.setBounds(150,500,1200,400);
 CampoBaseDeDatos.setBackground(new Color(209, 230, 228));
 CampoBaseDeDatos.setText("Base de Datos...");
 this.add(CampoBaseDeDatos);


 //:~========================================================================================================================
 //:~======================================= BOTONES =================================================================

 //AGREGAR COLOR BOTÓN RGB ".setBackground(Color.RGBtoHSB(int, int, int, float[]));"
//Botón verde
BotonVerde = new JButton();
BotonVerde.setText("Boton Verde");
BotonVerde.setBackground(new Color(155, 243, 120));
BotonVerde.setBounds(150, 150, 200, 30);
this.add(BotonVerde);
//ActionListener Para Botón Verde
ActionListener AccionBotonVerde = new ActionListener(){

@Override
public void actionPerformed(ActionEvent e) {
System.out.println("Has presionado el botón Vender");
}
};
BotonVerde.addActionListener(AccionBotonVerde);

//botón rojo
BotonRojo = new JButton();
BotonRojo.setText("Boton rojo");
BotonRojo.setBackground(new Color(241, 105, 99));
BotonRojo.setBounds(150, 200, 200, 30);
this.add(BotonRojo);
//ActionListener Para Botón Rojo
ActionListener AccionBotonRojo = new ActionListener(){

@Override
public void actionPerformed(ActionEvent e) {
System.out.println("Has presionado el botón Rojo");
}
};
BotonRojo.addActionListener(AccionBotonRojo);


//botón Vender
BotonVender = new JButton();
BotonVender.setText("VENDER");
BotonVender.setBackground(new Color(155, 243, 120));
BotonVender.setBounds(150, 250, 200, 30);
this.add(BotonVender);
//ActionListener Para Botón De VENDER
ActionListener AccionBotonVender = new ActionListener(){

@Override
public void actionPerformed(ActionEvent e) {
System.out.println("Has presionado el botón de VENDER");
}
};
BotonVender.addActionListener(AccionBotonVender);

//boton Agregar
BotonAgregar = new JButton();
BotonAgregar.setText("Agregar");
BotonAgregar.setBackground(Color.WHITE);
BotonAgregar.setBounds(150, 300, 200, 30);
this.add(BotonAgregar);
//ActionListener Para Botón Verde
ActionListener AccionBotonAgregar = new ActionListener(){

@Override
public void actionPerformed(ActionEvent e) {
System.out.println("Has presionado el botón Agregar");
}
};
BotonAgregar.addActionListener(AccionBotonAgregar);

//botón Modificar
BotonModificar = new JButton();
BotonModificar.setText("Modificar");
BotonModificar.setBackground(Color.WHITE);
BotonModificar.setBounds(150, 350, 200, 30);
this.add(BotonModificar);
//ActionListener Para Botón Verde
ActionListener AccionBotonModificar = new ActionListener(){

@Override
public void actionPerformed(ActionEvent e) {
System.out.println("Has presionado el botón Modificar");
}
};
BotonModificar.addActionListener(AccionBotonModificar);

//Botón Eliminar
BotonEliminar = new JButton();
BotonEliminar.setText("Borrar");
BotonEliminar.setBackground(Color.white);
BotonEliminar.setBounds(150, 400, 200, 30);
this.add(BotonEliminar);
//ActionListener Para Botón Verde
ActionListener AccionBotonEliminar = new ActionListener(){

@Override
public void actionPerformed(ActionEvent e) {
System.out.println("Has presionado el botón Eliminar");
}
};
BotonEliminar.addActionListener(AccionBotonEliminar);
}

}
