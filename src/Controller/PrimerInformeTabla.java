package Controller;
import Model.*; 
import javax.swing.*;
import java.awt.*;

public class PrimerInformeTabla extends JPanel {
   PrimerInforme modelo = new PrimerInforme();
   
   public PrimerInformeTabla(){ 
    setLayout(new BorderLayout());
    JTable tabla = new JTable(modelo);

    JScrollPane panel = new JScrollPane(tabla);
    add(panel, BorderLayout.CENTER);
   }
    
}
