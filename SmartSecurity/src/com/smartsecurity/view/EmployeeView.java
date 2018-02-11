package com.smartsecurity.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeView
 */
@WebServlet("/EmployeeView")
public class EmployeeView extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public EmployeeView() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		

		out.println("<script src='asset/jquery-3.2.1.min.js'></script>");
		out.println("<script src='asset/statecity.js'></script>");
		
		out.println("<html>"
				+ "<form action='EmployeeSubmit' method='post' enctype='multipart/form-data'>"
				+ "<table>"
				+ "<caption><b><i>Employee Registration</i></b></caption>"
				
				+ "<tr><td><b><i>Employee Name:</i></b></td>"
				+ "<td><input type=text name=ename size=30></td></tr>"
				
				+ "<tr><td><b><i>Employee DOB:</i></b></td>"
				+ "<td><input type=date name=edob size=30></td></tr>"
				
				+ "<tr><td><b><i>Employee Gender:</i></b></td>"
				+ "<td><input type=text name=egender size=30></td></tr>"
				
				+ "<tr><td><b><i>Employee Corresponding Address:</i></b></td>"
				+ "<td><input type=text name=ecoraddress size=30></td></tr>"
				
				 
				+"<tr><td><b><i>State:</i></b></td>"
				+"<td><select  name=ecorstate id=ecorstate></select></td></tr>"
				
				+"<tr><td><b><i>City:</i></b></td>"
				+"<td><select name=ecorcity id=ecorcity></select></td></tr>"
				
				+ "<tr><td><b><i>Employee Permanent Address:</i></b></td>"
				+ "<td><input type=text name=eperaddress size=30></td></tr>"
				
				 
				+"<tr><td><b><i>State:</i></b></td>"
				+"<td><select  name=eperstate id=eperstate></select></td></tr>"
				
				+"<tr><td><b><i>City:</i></b></td>"
				+"<td><select name=epercity id=epercity></select></td></tr>"
				
				+ "<tr><td><b><i>Employee Department:</i></b></td>"
				+ "<td><input type=text name=edepartment size=30></td></tr>"
				
				+ "<tr><td><b><i>Employee Qualification:</i></b></td>"
				+ "<td><input type=text name=equalification size=30></td></tr>"
				
				+ "<tr><td><b><i>Employee Designation:</i></b></td>"
				+ "<td><input type=text name=edesignation size=30></td></tr>"
				
				+ "<tr><td><b><i>Employee Mobile:</i></b></td>"
				+ "<td><input type=number name=emobile size=30></td></tr>"
				
				+ "<tr><td><b><i>Employee Email:</i></b></td>"
				+ "<td><input type=text name=eemail size=30></td></tr>"
				
				+ "<tr><td><b><i>Employee Photo:</i></b></td>"
				+ "<td><input type=file name=ephoto></td></tr>"
				+ "</table><br>"
				+ "<input type=submit>&nbsp;&nbsp;<input type=reset></br>"
				+ "</form></html>");
		out.flush();

	}

}
