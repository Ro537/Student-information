
package student_management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadData {
    
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet result = null;
    Scanner sc = null;

    void readData() {
        try {
            connect = Connector.getInstance();
            sc = new Scanner(System.in);

            String query = "SELECT name,age,gender,blood_group,phone_number,mark FROM students WHERE mark=?";
            preparedStatement = connect.prepareStatement(query);

            System.out.println("Enter value : ");
            preparedStatement.setString(1, sc.nextLine());
            result = preparedStatement.executeQuery();
                while (result.next()) {
                    System.out.println("Name: " + result.getString("name"));
                    System.out.println("Age: " + result.getString("age"));
                    System.out.println("Gender: " + result.getString("gender"));
                    System.out.println("Blood_group: " + result.getString("blood_group"));
                    System.out.println("Phone_number : " + result.getString("phone_number"));
                    System.out.println("Mark : " + result.getString("mark"));
                    System.out.println("\n");
                }
            
            System.out.println("\n");
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ReadData.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Myerror: ");
        }
        
        

    }
    
}
