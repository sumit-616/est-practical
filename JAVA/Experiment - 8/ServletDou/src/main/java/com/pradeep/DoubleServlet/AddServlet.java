package com.pradeep.DoubleServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet("/add")
public class AddServlet extends HttpServlet{
	
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		
		
		int i= Integer.parseInt(req.getParameter("num1"));
		
//		System.out.println("The vlaue of first number is : "+ i);
		
		int j = Integer.parseInt(req.getParameter("num2"));
		
//		System.out.println("The vlaue of first number is : "+ j);

		int k= i+j;
		
//		System.out.println();
		
		req.setAttribute("summation", k);
		
		res.setContentType("text/html");
		
		
		req.getRequestDispatcher("/double").forward(req, res);
		
//		
//		res.setContentType("text/html");
		
//		PrintWriter out = res.getWriter();
//		
//		out.print("<br>");
//		
////		ServletContext ctx = getServletContext();
//		
////		String str = ctx.getInitParameter("Phone");
//		out.println("<html><body>");
//		
//		out.println(""+k); 
//		out.print("</body></html>");
//		
		
	
		
		
	}
	

}
