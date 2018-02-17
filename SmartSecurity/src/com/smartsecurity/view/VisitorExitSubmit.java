package com.smartsecurity.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





import com.smartsecurity.controller.VisitorExitController;

import com.smartsecurity.model.VisitorExit;

/**
 * Servlet implementation class EmployeeSubmit
 */
@WebServlet("/VisitorExitSubmit")

public class VisitorExitSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VisitorExitSubmit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		System.out.println("aaaaaaa");
		out.println("<html>");
		VisitorExit E=new VisitorExit();
		
		E.setRFID(request.getParameter("verfid"));
		E.setExitdate(request.getParameter("vedate"));
		E.setExittime(request.getParameter("vetime"));
		System.out.println("aaaaaaa");
		
		boolean st=VisitorExitController.AddNewRecord(E);
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
