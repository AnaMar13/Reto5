package Controller;
import Model.*; 
import javax.swing.*;
import java.awt.*;

public class TercerInformeTabla extends JPanel{
    TercerInforme modelo = new TercerInforme();
   
   public TercerInformeTabla(){
    setLayout(new BorderLayout());
    JTable tabla = new JTable(modelo);

    JScrollPane panel = new JScrollPane(tabla);
    add(panel, BorderLayout.CENTER);
   }
}
