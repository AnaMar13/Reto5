package Model;
import Util.*;
import java.sql.*; 
import javax.swing.table.*;

public class PrimerInforme extends DefaultTableModel{
    ResultSet datos;

    public PrimerInforme(){
            this.addColumn("ID_Lider");
            this.addColumn("Nombre");
            this.addColumn("Primer_Apellido");
            this.addColumn("Ciudad_Residencia");

            try{
            Connection c;
            c = JDBCUtilities.getConnection();
            Statement stmt = c.createStatement();
            String consulta = "SELECT ID_LIDER, NOMBRE, PRIMER_APELLIDO, CIUDAD_RESIDENCIA FROM LIDER ORDER BY Ciudad_Residencia"; 
            datos = stmt.executeQuery(consulta);

            while(datos.next()){
                Object [] fila = new Object[4];
                for(int i = 0; i<4; i++){
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