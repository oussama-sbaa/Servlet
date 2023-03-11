import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)
		       	throws ServletException, IOException {
		       	res.setContentType("text/html");
		       	PrintWriter out = res.getWriter();
		       	
		       	out.println("<html>");
		       	out.println("<body>");
		       	out.println("<form method='POST' action='user'>");
		       	out.println("<input name='username' placeholder='Enter your name' />");
		       	out.println("<button type='submit'> sign in </button>");
		       	out.println("</form>"); 
		       	out.println("</body>");
		       	out.println("</html>");
		       	
		       	
		       	}
		      

	
}
