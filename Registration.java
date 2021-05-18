import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Registration {
    public boolean UserRegister(String user_name, String user_email, String user_password, String user_phone, String user_address){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/car_rental?", "root", "");
            
            String query="INSERT INTO userinfo(user_name, user_email, user_password, user_phone, user_address) VALUES(?,?,?,?,?)";
            PreparedStatement pst= conn.prepareStatement(query);
            pst.setString(1, user_name);
            pst.setString(2, user_email);
            pst.setString(3, user_password);
            pst.setString(4, user_phone);
            pst.setString(5, user_address);
            
            if(pst.executeUpdate() > 0){
                return true;
            }
            pst.close();
            conn.close();
            
        }
        catch (ClassNotFoundException | SQLException ex) 
        {
            System.out.println(ex);
        }
        return false;
    }
    
    
}
