package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet(description = "a Simple Servlet", urlPatterns = { "/FirstServletPath" },initParams={@WebInitParam(name="default user", value="Nagmani")})
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out =response.getWriter();
		out.write("<h1>This is coming from servlet </h1>");
		
		String userName= request.getParameter("name");
		
		HttpSession session= request.getSession();
		
		if (userName !=" " && userName !=null) {
			session.setAttribute("SavedUserName",userName);
		} 
		
		out.write("hello" + " " +userName + " " + "you are coming from request obhect" );
		out.write("<br>");
		
		out.write("hello" + " " + session.getAttribute("SavedUserName") + " " + " you are coming from session");
		out.write ("<br>");
		out.write("the default user which is coming from init is" + " "+ getInitParameter("default user"));
		
			
		
	}
	
	

}
