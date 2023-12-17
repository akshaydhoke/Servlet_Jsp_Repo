package com.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("Welcome to SecondServlet" + "<br>");

//		out.print(request.getParameter("uname"));
//		out.print(request.getParameter("password"));

//		HttpSession session=request.getSession(false);
//		String name=(String)session.getAttribute("username");
//		String password=(String)session.getAttribute("password");
//		
//		session.invalidate();

//		out.println(name+" "+password+"<br>");
//		
//		out.println("SessionId : "+ session.getId()+"<br>");
//		out.println("SessionCreateTime : "+ session.getCreationTime()+"<br>");
//		out.println("SessionLastAccessTime : "+ session.getLastAccessedTime()+"<br>");

		// Getting the value from the hidden field
		String name = request.getParameter("uname");
		out.println("name : " + name);


	}
}
