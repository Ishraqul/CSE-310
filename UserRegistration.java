

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/UserRegistration")
public class UserRegistration extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
 {
        String user_name= request.getParameter("user_name");
        String user_email= request.getParameter("user_email");
        String user_password= request.getParameter("user_password");
        String user_phone= request.getParameter("user_phone");
        String user_address= request.getParameter("user_address");
        
        Registration reg= new Registration();
        if(reg.UserRegister(user_name, user_email, user_password, user_phone, user_address)){
            HttpSession session=request.getSession();
            session.setAttribute("user_name", user_name);
            response.sendRedirect("index.jsp");
            
        }
        else{
            response.sendRedirect("index.jsp");
        }
        
    }
    
}
