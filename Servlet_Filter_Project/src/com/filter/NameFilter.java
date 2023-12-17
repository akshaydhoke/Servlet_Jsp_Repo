package com.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/Controller")
public class NameFilter implements Filter {

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;

		String name = req.getParameter("name");
		int pass = Integer.parseInt(req.getParameter("password"));

		if (pass==12) {

			chain.doFilter(request, response);

		} else {

			PrintWriter out = response.getWriter();
			out.println("Invalid");
			req.getRequestDispatcher("Login.jsp").forward(req, response);
		}
	}

	public void destroy() {
		// TODO Auto-generated method stub
	}

}
