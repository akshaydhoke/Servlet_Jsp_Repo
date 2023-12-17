package com.Servlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Controller")
public class Controller extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		List<Student> studends=Arrays.asList(new Student(101,"Akshay"),new Student(102,"bhushan"),new Student(103,"josh"));
		
		req.setAttribute("studes","students");
		
		RequestDispatcher rd = req.getRequestDispatcher("control.jsp");
		rd.forward(req, resp);
		
		
		
		
	}


}
