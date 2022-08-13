package View;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 


public class MainFrame extends JFrame {

    MainFrame(){
        JMenuBar mb = new JMenuBar();
        JMenu menuInformes = new JMenu("Ver informes");
        mb.add(menuInformes);
        JMenuItem itemInforme1 = new JMenuItem("Informe 1");
        JMenuItem itemInforme2 = new JMenuItem("Informe 2");
        JMenuItem itemInforme3 = new JMenuItem("Informe 3");
        menuInformes.add(itemInforme1);
        menuInformes.add(itemInforme2);
        menuInformes.add(itemInforme3);

        setLayout(new BorderLayout());
        add(mb, BorderLayout.NORTH);

        itemInforme1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                PrimerInformeView VentanaInforme1 = new PrimerInformeView();
            }});

        itemInforme2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                SegundoInformeView VentanaInforme2 = new SegundoInformeView();
                }});    

        itemInforme3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                TercerInformeView VentanaInforme3 = new TercerInformeView();
                }});         

        setVisible(true);
        setSize(300,300); 
    
    }

    public static void main(String[] args) {
        new MainFrame();
    } 
}


    
    
           

