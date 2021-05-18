import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
        
public class DBconnect {
    public static Connection getConnection(){
        Connection conn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql://localhost/car_rental?", "root", "");
        }catch (ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
        return conn;
    }
    
    
}
