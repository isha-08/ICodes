import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Assignment4SetA1 extends HttpServlet
{
	public void doGet(HttpServletRequest in, HttpServletResponse out) throws ServletException,IOException
	{
		out.setContentType("text/html");
		PrintWriter p=out.getWriter();
		p.println("<HTML>");
		p.println("<BODY>");
		p.println("Information of client: <br>");
		p.println("IP address: "+in.getRemoteAddr()+"<br>");
		p.println("Name: "+in.getRemoteHost()+"<br>");
		p.println("Browser: "+in.getHeader("User-Agent")+"<br>");
		p.println("Information of server: <br>");
		p.println("Name: "+in.getServerName()+"<br>");
		p.println("Port: "+in.getServerPort()+"<br>");
		p.println("</BODY>");
		p.println("</HTML>");
		p.close();
	}
}
