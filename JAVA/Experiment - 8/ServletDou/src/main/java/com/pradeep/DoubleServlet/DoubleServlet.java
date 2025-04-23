package com.pradeep.DoubleServlet;

import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/double")
public class DoubleServlet extends HttpServlet{
	
	
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        int message = (int) req.getAttribute("summation");
        
        res.setContentType("text/plain");

        
        PrintWriter out = res.getWriter();
        
        int value = message * message;
        
        out.println(value);
        

    }

}
