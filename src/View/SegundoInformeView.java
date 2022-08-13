package View;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import Controller.*;

public class SegundoInformeView extends JFrame{

    SegundoInformeView(){
      
        SegundoInformeTabla tabla = new SegundoInformeTabla();

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());
        panelPrincipal.setBackground(new Color(14,112,170));
        panelPrincipal.add(tabla,BorderLayout.CENTER);

        add(panelPrincipal);

        setTitle("Informe 2");
        setMinimumSize(new Dimension(400,400));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
        setSize(1000, 600);
    }  
    
}
