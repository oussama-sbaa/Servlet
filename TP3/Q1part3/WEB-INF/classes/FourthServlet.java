import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.net.*;

public class FourthServlet extends HttpServlet {		


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			    response.setContentType("text/html");

				PrintWriter out = response.getWriter();	

				HttpSession session = request.getSession();
				session.invalidate();

	}	

} 
