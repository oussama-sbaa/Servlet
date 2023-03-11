import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SecondServlet extends HttpServlet{

public void doGet(HttpServletRequest request , HttpServletResponse response)

    throws ServletException, IOException {
         response.setContentType("text/html");
         PrintWriter display = response.getWriter();
         String name = (String) getServletContext().getAttribute("name");
         display.println("<html><body> Hello, the default name is :" + name + "</body></html>");
    }
}
