package com.smartsecurity.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.softech.FileUpload;

import com.smartsecurity.controller.EmployeeController;
import com.smartsecurity.model.Employee;

/**
 * Servlet implementation class EmployeeSubmit
 */
@WebServlet("/EmployeeSubmit")
@MultipartConfig(fileSizeThreshold=1024*1024*2,//2MB
maxFileSize=1024*1024*10,//10MB
maxRequestSize=1024*1024*50)//50MB
public class EmployeeSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeSubmit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("<html>");
		Employee E=new Employee();
		
		E.setEmployeeName(request.getParameter("ename"));
		E.setEmployeeDOB(request.getParameter("edob"));
		E.setEmployeeGender(request.getParameter("egender"));
		E.setEmployeeCorAddress(request.getParameter("ecoraddress"));
		E.setEmployeeCorState(request.getParameter("ecorstate"));
		E.setEmployeeCorCity(request.getParameter("ecorcity"));
		E.setEmployeePerAddress(request.getParameter("eperaddress"));
		E.setEmployeePerState(request.getParameter("eperstate"));
		E.setEmployeePerCity(request.getParameter("epercity"));
		E.setEmployeeDepartment(request.getParameter("edepartment"));
		E.setEmployeeQualification(request.getParameter("equalification"));
		E.setEmployeeDesignation(request.getParameter("edesignation"));
		E.setEmployeeMobile(request.getParameter("emobile"));
		E.setEmployeeEmail(request.getParameter("eemail"));
//		E.setEmployeePhotograph(request.getParameter("ephoto"));
		
		String path = "G:/projects/SmartSecurity/WebContent/picture";
		Part part = request.getPart("ephoto");
		FileUpload F = new FileUpload(part, path);
		E.setEmployeePhoto(F.filename);
		
		boolean st=EmployeeController.AddNewRecord(E);
	    if(st){
	    	out.println("<b>Record Submitted</b>");
	    }
	    else{
	    	out.println("<b>Fail to Submit Record</b>");
	    }
	    out.println("</html>");
	    out.flush();
	}

}
