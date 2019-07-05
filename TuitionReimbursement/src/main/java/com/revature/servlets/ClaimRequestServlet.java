package com.revature.servlets;

import java.io.IOException;
import java.text.Normalizer.Form;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.pojos.ClaimRequests;
import com.revature.pojos.Employee;
import com.revature.services.ClaimRequestService;
import com.revature.services.ClaimRequestServiceImp;

/**
 * Servlet implementation class ClaimRequestServlet
 */
public class ClaimRequestServlet extends HttpServlet {
	    private static final long serialVersionUID = 1L;
	    private static  ClaimRequestService crs = new ClaimRequestServiceImp();

	    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        request.getRequestDispatcher("ReimbursementForm.html").forward(request, response);
	        
	    }

	    protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {

	    	HttpSession sess = req.getSession(false);

	       if (sess == null || sess.getAttribute("user") == null) {
	           response.sendRedirect("login.html");
	           return;
	       }

	       Employee employee = (Employee) sess.getAttribute("user");

		/*
		 * int employeeid; // = req.getParameter("employeeid");
		 * //System.out.println("Event:" + event); String location =
		 * req.getParameter("location"); String date = req.getParameter("date");
		 * //System.out.println("City: " +city); String startDate =
		 * req.getParameter("startdate"); String endDate = req.getParameter("enddate");
		 * String time = req.getParameter("time"); String description =
		 * req.getParameter("description"); String grade = req.getParameter("grade");
		 * int event; // req.getParameter("event"); double cost; //
		 * req.getParameter("cost"); String gradingformat =
		 * req.getParameter("gradingformat"); String justification =
		 * req.getParameter("justification");
		 * 
		 * ClaimRequests tuitionRequest = new ClaimRequests(employeeid, date, startDate,
		 * endDate, time, location, description, cost, grade, event, justification);
		 * crs.createNewForm(tuitionRequest);
		 */
	        
	        // if null not work
	    
	        
	    }
}
