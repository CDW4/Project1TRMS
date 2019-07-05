package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.pojos.Employee;
import com.revature.services.EmployeeServices;
import com.revature.services.EmployeeServicesImp;


public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static EmployeeServices employee = new EmployeeServicesImp();
       
	
    public HomeServlet() {
        super();
    }

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession sess = req.getSession();
        Employee emp = (Employee) sess.getAttribute("emp");
        
        
        if (emp == null) {
            resp.sendRedirect("login.html");
        } else {
        
        String username = emp.getUsername();//req.getParameter("username");
        String password = emp.getPassword();//req.getParameter("password");
        System.out.println("username: " + username + " password: " + password);
        resp.setContentType("text/html;charset=UTF-8");
        
        PrintWriter pw = resp.getWriter();
        
        if (emp != null) {
            
            pw.write("<h1>Welcome</h1>\n");
            pw.write("\n<a href='ReimbursementForm.html'>Start A New Reimbursement Form</a>\n\n\n<a href='FormList'>View Status of Pending Reimbursment Forms</a>\n\n");
            pw.write("\n<a href='Logout'>Logout</a>");
        	}
        }
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
