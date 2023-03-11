import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class jq6 extends HttpServlet {
 public void doGet(HttpServletRequest request,
 HttpServletResponse response)
 throws ServletException, IOException {
 response.setContentType("text/html");

 PrintWriter out = response.getWriter();

 
 out.println("The servelet name is :" + getServletName());
 }
}
