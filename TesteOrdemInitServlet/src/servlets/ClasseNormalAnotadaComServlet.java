package servlets;

import java.io.IOException;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet(loadOnStartup=1)
public class ClasseNormalAnotadaComServlet extends javax.servlet.http.HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public ClasseNormalAnotadaComServlet() {
		System.out.println(">>>>>>>>>>>>>>>> instanciando ClasseNormalAnotadaComServlet");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException 
    {
		AsyncContext context = req.startAsync();
		context.start( new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	

}
