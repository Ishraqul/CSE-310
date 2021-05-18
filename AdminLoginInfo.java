import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class AdminLoginInfo {
    public boolean check(String admin_name, String admin_password){
        try{
            String query="SELECT user_name, user_password FROM admininfo WHERE admin_name=? AND admin_password=?";
            //Class.forName("com.mysql.jdbc.Driver");
            //Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/car_rental?", "root", "");
            PreparedStatement pst= DBconnect.getConnection().prepareStatement(query);
            pst.setString(1, admin_name);
            pst.setString(2, admin_password);
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
