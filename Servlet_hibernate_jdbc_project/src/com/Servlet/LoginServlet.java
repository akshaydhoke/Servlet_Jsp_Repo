package com.Servlet;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

// servlet is a controller because it controls which web page will go to browser
// JSP is used to create web pages
// MVC = Model View Controller
// Model means data which will be displayed on JSP View Pages 
	//session
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
String userName=request.getParameter("uname");
String password=request.getParameter("pwd");	

//HibernateLoginDAO dao=new HibernateLoginDAO();

LoginDAO dao = new LoginDAO();// This LoginDAO class contains JDBC code

boolean flag=dao.validate(userName, password);
System.out.println(flag);


if(flag)
{
request.getRequestDispatcher("welcome.jsp").forward(request, response);

    HttpSession session = request.getSession();
    
    session.setAttribute("userName", userName);
    
//    session.setMaxInactiveInterval(10);
    
 // session=> [userName=sachin]  HttpSession object
    
 // HttpSession object is a global object 
  
 // when session gets invalidate all attributes from HttpSession objects are removed . further request to these attributes will give null value

 // session gets invalidate in 3 cases :-
    
 // 1. when MaxInactiveInterval is over
 // 2. session.invalidate()
 // 3. when we close the browser
}

else
{
	request.getRequestDispatcher("error.jsp").forward(request, response);
}

	}

	
}
