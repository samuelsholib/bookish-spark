package mysqlJDBCPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlJDBC {
   static final String DB_URL = "jdbc:mysql://localhost/usersDB";
   static final String USER = "root";
   static final String PASS = "Samiboy#12";

   public static void main(String[] args) {
      // Create connection to database
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
    		  
         Statement sqlStmt = conn.createStatement();
      ) {		      
          String sqlQuery = "DROP TABLE IF EXISTS products"+ "CREATE TABLE products " +
                   "(productId INTEGER not NULL, " +
                   " productName VARCHAR(50)not NULL, " + 
                   " prodDescription VARCHAR(255), " + 
                   " price INTEGER NOT NULL, " + 
                   " PRIMARY KEY ( productId ))";
          
                   //+ "INSERT INTO products VALUES(22, Mac, AwesomeComputer, 1400)"; 

          sqlStmt.executeUpdate(sqlQuery);
         System.out.println("Product table created");   	  
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}