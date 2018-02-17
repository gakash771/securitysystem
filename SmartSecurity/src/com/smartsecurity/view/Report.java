package com.smartsecurity.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Report
 */
@WebServlet("/Report")
public class Report extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Report() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

PrintWriter out = response.getWriter();
		

		
		out.println("<html>"
				+ "<form action='Display' method='post' target='mw'>"
				+ "<table>"
				+ "<caption><b><i>Report</i></b></caption>"
				
				+ "<tr><td><b><i>Enter date </i></b></td>"
				+ "<td><input type=date name=endate size=30></td>"
				
				+ "<td><b><i>Exit Date</i></b></td>"
				+ "<td><input type=date name=exdate size=30></td></tr>"
				
				+"<tr><td><b><i>Status</i></b></td>"
				+"<td>Checkin<input type=radio name=check value=checkin> checkout<input type=radio name=check value=checkout></td></tr>"

				
				+ "</table><br>"
				+ "<input type=submit>&nbsp;&nbsp;<input type=reset></br>");
		 out.println("<iframe name='mw' frameborder='5' height='700' width='1000'></iframe>");
				out.println("</form></html>");
		out.flush();

	

}
}