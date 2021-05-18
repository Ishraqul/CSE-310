
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;


@WebServlet("/FetchCarData")
public class FetchCarData extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        try{
            response.setContentType("text/html");
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/car_rental?", "root", "");
            PreparedStatement pst= conn.prepareStatement("SELECT * FROM carlist");
            ResultSet rs=pst.executeQuery();
            PrintWriter out=response.getWriter();
            out.println("<html><body><table border='1'<tr><td>Car ID</td><td>Car Type</td><td>Car Model</td><td>Car Numberplate</td><td>Car Insurance details</td>");
            while(rs.next()){
                out.println("<tr><td>" + rs.getString(1) +"</td><td>" + rs.getString(2)+ "</td><td>" + rs.getString(3) + "</td><td>" + rs.getString(4) + "</td><td>" + rs.getString(5)+ "</td></tr>");
            }
            out.println("</table></body></html>");
        }
        catch(IOException | ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
    }
}
   