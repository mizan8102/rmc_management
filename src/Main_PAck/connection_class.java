 
package Main_PAck;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

   public class connection_class {
   public Connection ct=null; 
   public PreparedStatement ps=null;
   public ResultSet rs=null;
   public Statement st=null; 
    
    public void contest() {
        try {
            ct = DriverManager.getConnection("jdbc:mysql://localhost:3306/rmc_chemical_ltd", "root", "");
            st=ct.createStatement();
            
        } catch (SQLException ex) {
            Logger.getLogger(connection_class.class.getName()).log(Level.SEVERE, null, ex);
        } }
   
}
