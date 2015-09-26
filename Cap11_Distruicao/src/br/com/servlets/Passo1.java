package br.com.servlets;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Passo1 extends HttpServlet {

	private static final long serialVersionUID = 2454748360969096578L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 	throws ServletException, IOException {
		resp.setContentType("text/html");
		Writer out = resp.getWriter();
		out.write("<html>");
		out.write("<body>");
		out.write("Servlet Passo1");
		out.write("</body>");		
		out.write("</html>");
	}
	
	

}
