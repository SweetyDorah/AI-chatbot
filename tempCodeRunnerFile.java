HelloWorld.java (servlet code)
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class HelloWorld extends HttpServlet {
public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
String name = request.getParameter("name"); // Get the client entered data from request object
response.setContentType("text/html"); // set the response content type
PrintWriter out = response.getWriter();
out.println("<h3>Hello " + name + "!!</h3>"); // Print hello message to the client browser in
response object
out.close();
}
}