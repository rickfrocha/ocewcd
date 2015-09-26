package br.com.servlets;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Passo3
 */
public class Passo3 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		Writer out = resp.getWriter();
		out.write("<html>");
		out.write("<body>");
		out.write("Servlet Passo3");
		out.write("</body>");		
		out.write("</html>"); 
	}

}
