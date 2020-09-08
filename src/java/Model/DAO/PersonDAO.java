

package Model.DAO;

import Model.Util.ConnectionProvider;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Model.DAO.Hash;
import java.security.NoSuchAlgorithmException;


public class PersonDAO {
    
    
    
    public static boolean check(String n, String p)throws NoSuchAlgorithmException{
        boolean vaild=false;
        try {
            ConnectionProvider connectioner =new ConnectionProvider();
            PreparedStatement   preparedStatement = connectioner.getConnection().prepareStatement("SELECT * from Employee where user=? and pass=?");
            preparedStatement.setString(1, "name");
            preparedStatement.setString(2,Hash.MakeHash(p));
            
            ResultSet resultSet=preparedStatement.executeQuery();
   
            vaild=resultSet.next();

        } catch (SQLException e) {
             System.out.println(SQLException(e));
        }

        return vaild;
    }

    private static boolean SQLException(SQLException e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    
    }
    

