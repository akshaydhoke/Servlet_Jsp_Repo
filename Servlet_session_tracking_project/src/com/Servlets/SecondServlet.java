package com.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.println("Welcome in Second Servlet !!!");

//		Coockies : 
		Cookie[] cookies = request.getCookies();
		String cookieValue = cookies[0].getValue();

		out.println("Cookie value : " + cookieValue);

//		HttpSession : 

		HttpSession session = request.getSession(false); // not creating new session
		String sessionName = (String) session.getAttribute("Name");
		
		out.println("Session Id : " + session.getId());
		out.println("Session value : " + sessionName);
		out.println("Session Time : " + session.getCreationTime());
		out.println("Session Last Accessed Time : " + session.getLastAccessedTime());

//		URL rewriting :
		
		String urlName = request.getParameter("uname");
		out.println("URL rewriting User name : " + urlName);
		
//		Hidden Form Field : 
		
		String hiddenName = request.getParameter("username");
		out.println("Hidden Form Field User name : " + hiddenName);


	}

}
