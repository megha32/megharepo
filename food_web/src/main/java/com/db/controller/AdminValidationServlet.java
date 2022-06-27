package com.db.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/adminValidationServlet")
public class AdminValidationServlet extends HttpServlet {
	private static final long serialVersionUID=1L;
	protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
    PrintWriter out=response.getWriter();
    response.setContentType("text/html");
    String name=request.getParameter("uname");
    String pwd=request.getParameter("pwd");
    if(name.equals("root")&& pwd.equals("Meghakum3@")) {
    	RequestDispatcher rd=request.getRequestDispatcher("item-list.jsp");
    	rd.forward(request,response);
    }
    else
    {
    	out.println("<p>Invalid User Please Register First.</p>");
    	RequestDispatcher rd1=request.getRequestDispatcher("AdminLogin.html");
    	rd1.forward(request,response);
    }	
}
	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		doGet(request,response);
	}
}