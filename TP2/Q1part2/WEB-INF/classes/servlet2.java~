import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class SecondServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest req,HttpServletResponse res)
			throws ServletException, IOException {
				
		ServletContext appContext = getServletContext();
		ServletConfig appConfig = getServletConfig();
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		
		String username = req.getParameter("username");
		
	   if(username.isEmpty()){
	   	username = "guest";
			deleteCookie(req,res);
		}else {
			   	
	   	Cookie unCookie = new Cookie("user", username);
			res.addCookie(unCookie);
		}
	
		
		
		
	
		out.println("<html>");
		out.println("<body>");
		out.println("<h4>Bienvenue : "+username+"</h4>");
		out.println("<a href='form'> back to main </a>");
		out.println("<a href='profil'> profil </a>");
		out.println("</body>");
		out.println("</html>");
		
		
		
		
	}
	
	
	public static void deleteCookie(HttpServletRequest req, HttpServletResponse res){
		
		for (int i = 0; i < req.getCookies().length; i++) {
               
               Cookie cookie = req.getCookies()[i];
               cookie.setMaxAge(0);
               res.addCookie(cookie);
               
      };
      
   }
}
