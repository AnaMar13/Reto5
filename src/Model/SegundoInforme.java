package Model;
import Util.*;
import java.sql.*; 
import javax.swing.table.*;

public class SegundoInforme extends DefaultTableModel{
    ResultSet datos;

    public SegundoInforme(){
            this.addColumn("ID_Proyecto");
            this.addColumn("Constructora");
            this.addColumn("Numero_Habitaciones");
            this.addColumn("Ciudad");

            try{
            Connection c;
            c = JDBCUtilities.getConnection();
            String consulta = "SELECT ID_Proyecto, Constructora, Numero_Habitaciones, Ciudad FROM Proyecto WHERE Clasificacion == 'Casa Campestre' AND (Ciudad == 'Santa Marta' OR Ciudad == 'Cartagena'OR Ciudad == 'Barranquilla')";
            Statement stmt = c.createStatement();
            ResultSet datos = stmt.executeQuery(consulta);

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