import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.*;

public class Servlet2 extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res){
		PrintWriter out = null;
		try{
			res.setContentType("text/html");
			out=res.getWriter();
			String n= req.getParameter("name");
			String r= req.getParameter("roll");			
			out.println("<html><head><title>Context Scope</title></head>");
			out.println("<body bgcolor ='#ff8080'>");
			out.println("<marquee><h1>Implentation of Context Scope !!</h1></marquee><br> ");
			ServletContext ctx = getServletContext();
			String c =(String)ctx.getAttribute("company");
			out.println("<br>Name :"+n);
			out.println("<br>Roll :"+r);
			out.println("<br>Company :"+c);
			out.println("</body></html>");			
		}
		catch(Exception ex){
			out.println(ex);
		}
	}
	
}