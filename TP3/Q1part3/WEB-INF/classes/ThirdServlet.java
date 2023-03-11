import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.net.*;

public class ThirdServlet extends HttpServlet {		


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			    response.setContentType("text/html");

				PrintWriter display = response.getWriter();	

				display.println("<h1>FormTest</h1>");
			    display.println(" Informations :"); 
			    String age = request.getParameter("age");
			    String code = request.getParameter("code");
				HttpSession session = request.getSession(true);
				session.setAttribute("age", age);
				session.setAttribute("code", code);
				display.println(" Nom:"+session.getAttribute("nom"));
				display.println(" Age:"+session.getAttribute("age"));
				display.println(" Code postal:"+session.getAttribute("code"));
				
				display.println("<br><a href='SecondServlet'>Edit</a>");
				display.println("<br><a href='FirstServlet'>LogOut</a>");

	}	

} 
