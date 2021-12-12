import java.sql.*;

public class App {
   static final String DB_URL = "jdbc:mysql://localhost/kinbech";
   static final String USER = "root";
   static final String PASS = "";
   static final String QUERY = "SELECT * FROM category;";

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(QUERY);
      ) {		      
         while(rs.next()){
            //Display values
            System.out.print("ID: " + rs.getInt("id"));
            System.out.print("\tName: " + rs.getString("name"));
            System.out.print("\tDescription: " + rs.getString("description"));
            System.out.println();
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}