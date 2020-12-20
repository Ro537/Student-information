
package student_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public abstract class Connector {
    private static com.mysql.jdbc.Connection connector;
    
     static com.mysql.jdbc.Connection getInstance() throws SQLException, ClassNotFoundException
    {
        if(connector==null)
        {
            Class.forName("com.mysql.jdbc.Driver");
            connector = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/student_management?"+"user=root");
        }
        return connector;
    }
     static void close()
     {
        try {
            connector.close();
            System.out.println("Database close successful");
            System.out.println("\n");
        } catch (SQLException ex) {
            Logger.getLogger(ApiClient.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
  
}
