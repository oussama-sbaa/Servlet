import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class q4 extends HttpServlet {
public void doGet(HttpServletRequest request,
HttpServletResponse response)
throws ServletException, IOException {
    
    String name = request.getParameter("name");
    
PrintWriter out = response.getWriter();
out.println("Hello " + name + " I'm Oussama");
}
}

