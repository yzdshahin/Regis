
package Model.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionProvider {
    
    private Connection connection;

     static {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException xe) {
           xe.printStackTrace();
        }

    }
  public Connection getConnection(){

         try {
             return DriverManager.getConnection("jbdc:sqlserver://localhost:2348/ME", "FAD", "pass:)");
         } catch (SQLException e) {
             e.printStackTrace();
         }
         return null;
    }
}
