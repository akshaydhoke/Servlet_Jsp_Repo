package com.Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ValidationController
 */
@WebServlet("/ValidationController")
public class ValidationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String uname = request.getParameter("uname");
		String password = request.getParameter("password");

		Bean bean = new Bean();
		bean.setUname(uname);
		bean.setPassword(password);

		request.setAttribute("bean", bean);

		if (uname.equalsIgnoreCase("akshay")) {
			request.getRequestDispatcher("success.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("/Error.jsp").forward(request, response);
		}

	}

}
