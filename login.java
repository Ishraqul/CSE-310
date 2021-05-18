
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Asus
 */
@WebServlet("/login")
public class login extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
       {
        String user_name=request.getParameter("user_name");
        String user_password=request.getParameter("user_password");
        
        LoginInfo in=new LoginInfo();
        if(in.check(user_name, user_password) == true){
            HttpSession session= request.getSession();
            session.setAttribute("user_name", user_name);
            response.sendRedirect("WelcomePage.jsp");
        }
        else{
            response.sendRedirect("index.jsp");
        }
    }
    
}
