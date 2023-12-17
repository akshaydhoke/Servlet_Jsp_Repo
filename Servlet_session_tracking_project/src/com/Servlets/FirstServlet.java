package com.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.annotation.*;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	
	protected void  doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		
		String name=request.getParameter("uname");
		String pwd=request.getParameter("password");
		
//		Cookies technique:
	    Cookie cookie = new Cookie("Name", "IamAkshay");
//	    cookie.setMaxAge(1);
	    response.addCookie(cookie);
	    
//	    HttpSession technique :
	    
	    HttpSession session = request.getSession();
	    session.setAttribute("Name", name);
//	    session.invalidate(); // expire session 
//	    session.setMaxInactiveInterval(0);
	    
	    out.println("<a href='SecondServlet'>SecondServlet</a>");
	    
//	    URL Rewriting :
	    
	    out.println("<a href='http://localhost:8080/EE_SessionTracking/SecondServlet?uname="+ name +"'> Visit SecondServlet </a>");
	    
//	    Hidden Form Field : 
	    
        //creating form that have invisible textfield  
        out.print("<form action='SecondServlet'>");  
        out.print("<input type='hidden' name='username' value='"+"Hidden"+name+"'>");  
        out.print("<input type='submit' value='Go'>");  
        out.print("</form>");  
	    
	
//		RequestDispatcher rd= request.getRequestDispatcher("/SecondServlet");
//		rd.forward(request, response);
		
		
		
	}
	
}
