package com.smartsecurity.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VisitorExitView
 */
@WebServlet("/VisitorExitView")
public class VisitorExitView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VisitorExitView() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

PrintWriter out = response.getWriter();
		

		
		out.println("<html>"
				+ "<form action='VisitorExitSubmit' method='post'>"
				+ "<table>"
				+ "<caption><b><i>VISITOR EXIT</i></b></caption>"
				
				+ "<tr><td><b><i>RFID</i></b></td>"
				+ "<td><input type=text name=verfid size=30></td></tr>"
				
				+ "<tr><td><b><i>Exit Date</i></b></td>"
				+ "<td><input type=date name=vedate size=30></td></tr>"
				
				+ "<tr><td><b><i>Time </i></b></td>"
				+ "<td><input type=time name=vetime size=30></td></tr>"
				
				+ "</table><br>"
				+ "<input type=submit>&nbsp;&nbsp;<input type=reset></br>");
				System.out.println("bbbbbbb");
				out.println("</form></html>");
		out.flush();

	}

}
