package Controller;
import Model.*; 
import javax.swing.*;
import java.awt.*;

public class SegundoInformeTabla extends JPanel {
    SegundoInforme modelo = new SegundoInforme();
   
   public SegundoInformeTabla(){
    setLayout(new BorderLayout());
    JTable tabla = new JTable(modelo);

    JScrollPane panel = new JScrollPane(tabla);
    add(panel, BorderLayout.CENTER);
   }
}
