package com.smartsecurity.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smartsecurity.controller.EmployeeController;
import com.smartsecurity.model.Employee;

/**
 * Servlet implementation class EmployeeEditDelete
 */
@WebServlet("/EmployeeEditDelete")
public class EmployeeEditDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeEditDelete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Employee E = EmployeeController.DisplayByID(Integer.parseInt(request.getParameter("eid")));
		PrintWriter out=response.getWriter();
		
		out.println("<script src='asset/jquery-3.2.1.min.js'></script>");
	   	out.println("<script src='asset/statecity.js'></script>");
		
	
		out.println("<html>"
				+ "<form action='EmployeeFinalEditDelete' method=post enctype='multipart/form-data'>"
				+ "<input type=hidden value="+E.getEmployeeId()+" name=eid>"
				+ "<table cellspacing=10><tr>"
				+ "<td>"
				+ "<table>"
				+ "<caption><b><i>Employee Registration</i></b></caption>"
				+ "<tr><td><b><i>Employee Name:</i></b></td>"
				+ "<td><input type=text name=ename value='"+E.getEmployeeName()+"' size=30></td></tr>"
				
				+ "<tr><td><b><i>Employee DOB:</i></b></td>"
				+ "<td><input type=date name=edob value='"+E.getEmployeeDOB()+"' size=30></td></tr>"
				
				+ "<tr><td><b><i>Employee Gender:</i></b></td>"
				+ "<td><input type=text name=egender value='"+E.getEmployeeGender()+"' size=30></td></tr>"
				
				+ "<tr><td><b><i>Employee Coressponding Address:</i></b></td>"
				+ "<td><input type=text name=ecoraddress value='"+E.getEmployeeCorAddress()+"' size=30></td></tr>");

		String st[]=E.getEmployeePerState().split(",");
		 
	   	out.println("<tr><td><b><i>State:</i></b></td>");
	   	out.println("<td><select  name=ecorstate id=ecorstate><option value="+st[0]+">"+st[1]+"</option></select></td></tr>");
	   	String ct[]=E.getEmployeePerCity().split(",");
	   	out.println("<tr><td><b><i>City:</i></b></td>");
	   	out.println("<td><select name=ecorcity id=ecorcity><option value="+ct[0]+">"+ct[1]+"</option></select></td></tr>");
	   	
				out.print( "<tr><td><b><i>Employee Permanent Address:</i></b></td>"
				+ "<td><input type=text name=eperaddress value='"+E.getEmployeePerAddress()+"' size=30></td></tr>");
             
				String sp[]=E.getEmployeePerState().split(",");
				 
			   	out.println("<tr><td><b><i>State:</i></b></td>");
			   	out.println("<td><select  name=eperstate id=eperstate><option value="+sp[0]+">"+sp[1]+"</option></select></td></tr>");
			   	String cp[]=E.getEmployeePerCity().split(",");
			   	out.println("<tr><td><b><i>City:</i></b></td>");
			   	out.println("<td><select name=epercity id=epercity><option value="+cp[0]+">"+cp[1]+"</option></select></td></tr>");
			   	
				out.print("<tr><td><b><i>Employee Department:</i></b></td>"
				+ "<td><input type=text name=edepartment value='"+E.getEmployeeDepartment()+"' size=30></td></tr>"
				
				+ "<tr><td><b><i>Employee Qualification:</i></b></td>"
				+ "<td><input type=text name=equalification value='"+E.getEmployeeQualification()+"' size=30></td></tr>"
				
				+ "<tr><td><b><i>Employee Designation:</i></b></td>"
				+ "<td><input type=text name=edesignation value='"+E.getEmployeeDesignation()+"' size=30></td></tr>"
				
				+ "<tr><td><b><i>Employee Mobile:</i></b></td>"
				+ "<td><input type=text name=emobile value='"+E.getEmployeeMobile()+"' size=30></td></tr>"
				
				+ "<tr><td><b><i>Employee Email:</i></b></td>"
				+ "<td><input type=text name=eemail value='"+E.getEmployeeEmail()+"' size=30></td></tr>"
				+ "</table><br>"
				
				+ "<input type=submit value=Update name=btn>&nbsp;&nbsp;<input type=submit value=Delete name=btn></br>"
				+ "</td><td valign=top>"
				+ "<b><i>Employee Photo:</i></b><input type=file name=ephoto><br><br>"
				+ "<img src=picture/"+E.getEmployeePhoto()+" width=60 height=60><br><br>"
				+ "<input type=submit name=btn value='Update Picture'>"
				+ "</form></html>");
		
	}

}
