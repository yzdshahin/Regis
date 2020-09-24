

package Model.DAO;

import Model.Util.ConnectionProvider;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.security.NoSuchAlgorithmException;
import javax.websocket.Decoder;


public class PersonDAO {
    
//    public static boolean validateUser(String nameUser) throws SQLException {
//        boolean validate= false;
//           try{ ConnectionProvider connectioner2 =new ConnectionProvider();
//            PreparedStatement   preparedStatement = connectioner2.getConnection().prepareStatement("SELECT * from Employee where user=?");
//            preparedStatement.setString(1, "name");
//            ResultSet resultSet2= preparedStatement.executeQuery();
//            validate=resultSet2.next();
//           }catch(SQLException e){
//               System.out.println("the user you entered is not registered");}
//           
//        return validate;
//    }
        public static boolean getinfo(String name, String password, String father,String birth, String gender){
            boolean info=false;
             try{
                 ConnectionProvider connectioner1 =new ConnectionProvider();
            PreparedStatement   preparedStatement = connectioner1.getConnection().prepareStatement("insert  into Employee values (?,?,?,?,?)");

            preparedStatement.setString(1, "name");
            preparedStatement.setString(2, "password");
            preparedStatement.setString(3, "father");
            preparedStatement.setString(4, "birth");
            preparedStatement.setString(5,"gender");
            
            ResultSet resultSet2= preparedStatement.executeQuery();

            info=resultSet2.next();
                 System.out.println("You are successfully registered");
             }catch(SQLException e){System.out.println("enter all the data");}
        return info;
        
        }
    
        public static boolean validatePass(String PassUser) throws SQLException {
        boolean validation= false;
           try{ ConnectionProvider connectioner2 =new ConnectionProvider();
            PreparedStatement   preparedStatement = connectioner2.getConnection().prepareStatement("SELECT * from Employee where password=?");
            preparedStatement.setString(1, "password");
            ResultSet resultSet3= preparedStatement.executeQuery();
            validation=resultSet3.next();
           }catch(SQLException e){
               System.out.println("the user's password you entered is not correct");} 
           
        return validation;
    }
    
//    public static boolean check(String n, byte [] p)throws NoSuchAlgorithmException{
//        boolean vaild=false;
//        try {
//            ConnectionProvider connectioner =new ConnectionProvider();
//            PreparedStatement   preparedStatement = connectioner.getConnection().prepareStatement("SELECT * from Employee where user=? and pass=?");
//            preparedStatement.setString(1, "name");
//            preparedStatement.setString(2,"password");
//            
//            ResultSet resultSet=preparedStatement.executeQuery();
//   
//            vaild=resultSet.next();
//
//        } catch (SQLException e) {
//             System.out.println(SQLException(e));
//        }
//
//        return vaild;
//    }

    private  boolean SQLException(SQLException e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    
    }
    

