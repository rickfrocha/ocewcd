package servlets;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/teste")
public class TesteServletInit extends javax.servlet.http.HttpServlet {

	private static final long serialVersionUID = 1L;
	
	public void init() throws ServletException{
		super.init();
		System.out.println(">>>> init()");
	}
	
	
	@PostConstruct
	public void startClass(){
		System.out.println(">>>> postConstruct()");
		log("");
		
		
	}
	
	public TesteServletInit() {
		System.out.println(">>>> construtor padrão()");
	}

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
	
	{
       req.getSession();   
	}
	
	@PreDestroy
	public void beginDestroy(){
		System.out.println(">>>> beginDestroy()");
	}
	
	
	public void destroy(){
		System.out.println(">>>> destroy()");
	}
	
	

}
