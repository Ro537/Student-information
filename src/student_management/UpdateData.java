
package student_management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UpdateData {
    private Connection connect=null;
    private Statement statement=null;
    private PreparedStatement preparedStatement=null;
    private ResultSet result=null;
    Scanner sc = null;
    
    void updateData()
    {
        try {
            connect = Connector.getInstance();
            sc = new Scanner(System.in);
            
            String query = "update students set mark = ? where id = ?";
            PreparedStatement preparedStatement = connect.prepareStatement(query);
            System.out.println("Input update value :");
            preparedStatement.setInt   (1, sc.nextInt());
            System.out.println("Update id number :");
            preparedStatement.setInt(2, sc.nextInt());
            preparedStatement.executeUpdate();
            System.out.println("Update data successful");
            System.out.println("\n");
            
        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
