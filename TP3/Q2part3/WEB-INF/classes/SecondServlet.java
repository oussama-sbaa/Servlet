import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SecondServlet extends HttpServlet{
     
        

public void doPost(HttpServletRequest request , HttpServletResponse response)throws ServletException, IOException {
	String nom = request.getParameter("nom");
        HttpSession session = request.getSession(true);
        session.setAttribute("nom", nom);
		PrintWriter display = response.getWriter();
        display.println("<HTML>\n<meta charset=\"utf-8\"/>\n<BODY>");
        display.println("<form action=\""+response.encodeURL("ThirdServlet")+"\" method=\"post\">"); 
        display.println("<h1>FormTest</h1>"); 
        display.println("Age: <input type=\"text\" name=\"age\" >");
        display.println("Code Postal: <input type=\"text\" name=\"code\" >");
        display.println("<input type=\"submit\" value=\"Envoyer\"></form>\n<br>");
        display.println("</BODY></HTML>");

}
 
 public void doGet(HttpServletRequest request , HttpServletResponse response)throws ServletException, IOException {
	
        HttpSession session = request.getSession(true);
        
	PrintWriter display = response.getWriter();
        display.println("<HTML>\n<meta charset=\"utf-8\"/>\n<BODY>");
        display.println("<form action=\""+response.encodeURL("ThirdServlet")+"\" method=\"post\">"); 
        display.println("<h1>FormTest</h1>"); 
        display.println("Age: <input type=\"text\" name=\"age\" >");
        display.println("Code Postal: <input type=\"text\" name=\"code\" >");
        display.println("<input type=\"submit\" value=\"Envoyer\"></form>\n<br>");
        display.println("</BODY></HTML>");

}
}
