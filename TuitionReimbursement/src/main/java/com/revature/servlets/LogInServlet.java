package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.pojos.Employee;
import com.revature.services.EmployeeServices;
import com.revature.services.EmployeeServicesImp;

public class LogInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private static EmployeeServices eserv = new EmployeeServicesImp();
	
    public LogInServlet() {
        super();
    }

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.sendRedirect("login.html");
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//doGet(req, resp);
		String username = req.getParameter("username");
		String password = req.getParameter("pass");
		
		Employee employee = eserv.userLogin(username, password);
		
		
		if (employee == null) {
			resp.setStatus(401);
			resp.getWriter().write("Login has failed");
			resp.sendRedirect("login.html");
		} else {
			System.out.println("Login was a success!");
			HttpSession sess = req.getSession(true);
			sess.setAttribute("emp", employee);
			resp.sendRedirect("home");
			
			
		}
		
	}

}
