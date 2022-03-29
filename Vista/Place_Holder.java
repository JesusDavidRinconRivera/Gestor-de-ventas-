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
        frame.setSize(400,250);
        frame.setTitle("Place Holder");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);


        label1 = new JLabel("Name: ");
        label1.setBounds(10,20,100,25);
        panel.add(label1);


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

        label2 = new JLabel("Father-Name");
        label2.setBounds(10,70,80,25);
        panel.add(label2);
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

        print = new JButton("Print");
        print.setBounds(100,120,80,25);
        print.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                String myname = name.getText();
                String myfathername = father_Name.getText();
                System.out.println("Your Name: "+myname);
                System.out.println("Your Father Name: "+myfathername);
            }
        });
        panel.add(print);

        frame.setVisible(true);
    }

}
