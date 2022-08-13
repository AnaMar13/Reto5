package Model;
import Util.*;
import java.sql.*; 
import javax.swing.table.*;

public class TercerInforme extends DefaultTableModel{
    ResultSet datos;

    public TercerInforme(){
            this.addColumn("ID_Compra");
            this.addColumn("Constructora");
            this.addColumn("Banco_Vinculado");

            try{
            Connection c;   
            c = JDBCUtilities.getConnection();
            String consulta = "SELECT ID_Compra, Constructora, Banco_Vinculado FROM Compra JOIN Proyecto ON Compra.ID_Proyecto = Proyecto.ID_Proyecto WHERE Proveedor == 'Homecenter' AND Ciudad == 'Salento'";
            Statement stmt = c.createStatement();
            ResultSet datos = stmt.executeQuery(consulta); 

            while(datos.next()){
                Object [] fila = new Object[3];
                for(int i = 0; i<3; i++){
                    fila[i] = datos.getObject(i+1);
                }
                this.addRow(fila);
            }

            stmt.close();
            c.close();
            System.out.println("La consulta se realizó con éxito");
            }
            catch (Exception e){
                System.err.println( e.getClass().getName() + ": " + e.getMessage());
                }
        }
        
} 