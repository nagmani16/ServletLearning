package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			String userName1 =request.getParameter("userName");
			String userID= request.getParameter("userId");
			response.setContentType("text/html");
			PrintWriter out =response.getWriter();
			out.write("Hello" + " " + userName1 + ""+userID);
		
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			String userName1 =request.getParameter("userName");
			String userID= request.getParameter("userId");
			String profession= request.getParameter("prof");
			response.setContentType("text/html");
			PrintWriter out =response.getWriter();
			out.write("Hello" + " " +profession+"  "+  userName1 + ""+userID );
		
		//	String location=request.getParameter("location");
			
			String [] location= request.getParameterValues("location");
			 
			
			
			out.write("you are at" + " " +location.length + " " + "places" +" " );
			
			for(int i=0;i<location.length;i++){
				out.write(location[i] + " ");
			}
			
			out.write("<br>");
			
			out.write("the default name for the user is " + this.getInitParameter("defaultUser") + " " +
			   " and the default profession is " + " " + this.getInitParameter("defaultProf"));
	}

}
