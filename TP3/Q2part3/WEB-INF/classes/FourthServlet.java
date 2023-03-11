package abpartage;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.net.*;

public class FourthServlet extends HttpServlet {		


	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			    response.setContentType("text/html");

				PrintWriter display = response.getWriter();	

				HttpSession session = request.getSession(false);
				session.invalidate();
				response.sendRedirect("FirstServlet");

	}	

} 
