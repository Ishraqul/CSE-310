

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/AdminLogin"})
public class AdminLogin extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String admin_name=request.getParameter("admin_name");
        String admin_password=request.getParameter("admin_password");
        
        AdminLoginInfo in=new AdminLoginInfo();
        if(in.check(admin_name, admin_password) == true){
            HttpSession session= request.getSession();
            session.setAttribute("admin_name", admin_name);
            response.sendRedirect("AdminPortal.jsp");
        }
        else{
            response.sendRedirect("AdminPortal.jsp");
        }
    }
        
    }

    

