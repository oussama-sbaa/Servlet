import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class FirstServlet extends HttpServlet{

	 public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        PrintWriter display = response.getWriter();
        
        display.println("<HTML>\n<meta charset=\"utf-8\"/>\n<BODY>");
        display.println("<form action=\"SecondServlet\" method=\"post\">"); 
        display.println("<h1>FormTest</h1>"); 
        display.println("Nom: <input type=\"text\" name=\"nom\" >");
        display.println("<input type=\"submit\" value=\"Envoyer\"></form>\n<br>");
        display.println("</BODY></HTML>");
        

    }
             
}
