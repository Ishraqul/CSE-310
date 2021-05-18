import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Booking_info {
    public boolean booking(String booked_car, String user_name, String booking_date, String car_pickup_branch, String car_dropoff_branch){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/car_rental?", "root", "");
            
            String query="INSERT INTO bookinginfo(booked_car, user_name, booking_date, car_pickup_branch, car_dropoff_branch) VALUES (?,?,?,?,?)";
            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1, booked_car);
            ps.setString(2, user_name);
            ps.setString(3, booking_date);
            ps.setString(4, car_pickup_branch);
            ps.setString(5, car_dropoff_branch);
            
            if(ps.executeUpdate() > 0){
                return true;
            }
            ps.close();
            conn.close();
            
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
        return false;
    
}
}
