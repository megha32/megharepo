package net.java.reg.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.java.reg.Employee;
import net.java.reg.dao.Employee_dao;


@WebServlet("/register")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String RequestDispatcher = null;
       private Employee_dao employeeDao=new Employee_dao();
    
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
		javax.servlet.RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/employeeregister.jsp");
		dispatcher.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName=request.getParameter("firstName");
		String LastName=request.getParameter("LastName");
		String userName=request.getParameter("usertName");
		String Password=request.getParameter("Password");
		String Address=request.getParameter("Address");
		String contact=request.getParameter("contact");
		Employee employee=new Employee();
		employee.setFirstName(firstName);
		employee.setLastName(LastName);
		employee.setUserName(userName);
		employee.setPassword(Password);
		employee.setAddress(Address);
		employee.setContact(contact);
		
		try {
			employeeDao.registerEmployee(employee);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		javax.servlet.RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/employeedetails.jsp");
		dispatcher.forward(request,response);
	}

}
