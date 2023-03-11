import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)
		       	throws ServletException, IOException {
		       	res.setContentType("text/html");
		       	PrintWriter out = res.getWriter();
		       	
		       
		       
		       	if(req.getCookies()!= null) {
		       		
		       		out.println("Cookie : " +getCookieValue(req.getCookies(), "user"));
		       	}
		       	out.println("<html>");
		       	out.println("<body>");
		       	out.println("<form method='POST' action='user'>");
		       	out.println("<input name='username' placeholder='Enter your name' />");
		       	out.println("<button type='submit'> sign in </button>");
		       	out.println("</form>"); 
		       	out.println("</body>");
		       	out.println("</html>");
		       	
		       	
		       	}
		       	

	
	
	public static String getCookieValue(Cookie [] cookies,String cookieName){
				for(int i=0; i < cookies.length; i++) {
					Cookie cookie = cookies[i];
					if(cookieName.equals(cookie.getName())) return(cookie.getValue());
				}
				return("No cookie found.");
	}

	
}
