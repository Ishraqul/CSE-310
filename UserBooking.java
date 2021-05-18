
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/UserBooking")
public class UserBooking extends HttpServlet {
@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String booked_car=request.getParameter("booked_car");
        String user_name= request.getParameter("user_name");
        String booking_date= request.getParameter("booking_date");
        String car_pickup_branch= request.getParameter("car_pickup_branch");
        String car_dropoff_branch= request.getParameter("car_dropoff_branch");
        
        Booking_info in= new Booking_info();
        if(in.booking(booked_car, user_name, booking_date, car_pickup_branch, car_dropoff_branch)){
            HttpSession session= request.getSession();
            session.setAttribute("user_name", user_name);
            response.sendRedirect("WelcomePage.jsp");
        }
        else{
            response.sendRedirect("WelcomePage.jsp");
        }
        
    }


}
