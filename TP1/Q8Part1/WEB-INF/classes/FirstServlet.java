import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class FirstServlet extends HttpServlet{

    public void doPost(HttpServletRequest request, HttpServletResponse response)
             throws ServletException, IOException {
				 
                 response.setContentType("text/html");
                 PrintWriter display =response.getWriter();            
                 String name = request.getParameter("name");
                 getServletContext().setAttribute("name", name);
                 display.println("<html><body><a href='osm2'> Click here </a></body></html>");

             }

}
