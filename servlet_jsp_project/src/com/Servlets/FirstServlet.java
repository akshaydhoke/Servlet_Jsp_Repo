package com.Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.println("Welcome to FirstServet");

		String name = request.getParameter("uname");
		String pass = request.getParameter("password");

		if (name.equals("akshay") && (pass.equals("123"))) 
		{

			response.setContentType("text/html");
//			request.getRequestDispatcher("SecondServlet").forward(request, response);
			
//			Session
			
//			HttpSession session=request.getSession();
//			session.setAttribute("username",name);
//			session.setAttribute("password",pass);
			
//			session.setMaxInactiveInterval(3);
//			session.invalidate();
			
	        //creating form that have invisible textfield  
	        out.print("<form action='SecondServlet'>");  
	        out.print("<input type='hidden' name='uname' value='"+name+"'>");  
	        out.print("<input type='submit' value='go'>");  
	        out.print("</form>");  
			
		} 
		
		else 
		{

			response.setContentType("text/html");
			out.print("Sorry! Please validate username or password");
			response.sendRedirect("Error.jsp");
			request.getRequestDispatcher("index.html").forward(request, response);

		}

	}
}
