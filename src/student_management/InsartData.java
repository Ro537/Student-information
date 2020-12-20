
package student_management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class InsartData {
     private Connection connect=null;
    private Statement statement=null;
    private PreparedStatement preparedStatement=null;
    private ResultSet result=null;
    Scanner sc = null;
    
    
    void insartData()
    {
       try {
           connect = Connector.getInstance();
           sc = new Scanner(System.in);
           
           String query = " insert into students (name, age, gender, blood_group, phone_number,mark)"
        + " values ( ?, ?, ?, ?, ?, ?)";
           preparedStatement = connect.prepareStatement(query);
           System.out.println("Enter the name :");
           preparedStatement.setString(1, sc.nextLine());
           System.out.println("Enter the age :");
           preparedStatement.setInt(2, sc.nextInt());
           sc.nextLine();
           System.out.println("Enter the gender :");
           preparedStatement.setString(3, sc.nextLine());
           System.out.println("Enter the blood group :");
           preparedStatement.setString(4, sc.nextLine());
           System.out.println("Enter the phone number :");
           preparedStatement.setString(5, sc.nextLine());
           System.out.println("Enter the mark :");
           preparedStatement.setString(6, sc.nextLine());
       
           
  
           preparedStatement.execute();
           System.out.println("Create data successful");
           System.out.println("\n");
           

           
       } catch (SQLException ex) {
           Logger.getLogger(InsartData.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println("EROOE ");
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(InsartData.class.getName()).log(Level.SEVERE, null, ex);
       }
       
    
  }

    
}
