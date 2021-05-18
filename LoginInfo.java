import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Asus
 */
class LoginInfo {
    public boolean check(String user_name, String user_password){
        try{
            String query="SELECT user_name, user_password FROM userinfo WHERE user_name=? AND user_password=?";
            //Class.forName("com.mysql.jdbc.Driver");
            //Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/car_rental?", "root", "");
            PreparedStatement pst= DBconnect.getConnection().prepareStatement(query);
            pst.setString(1, user_name);
            pst.setString(2, user_password);
            ResultSet rs= pst.executeQuery();
            
            if(rs.next() == true){
                return true;
            }
            pst.close();
        }catch(SQLException e){
            System.out.println(e);
        }
        return false;
    }
    
}
