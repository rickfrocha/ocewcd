package servlets;

import java.io.IOException;
import java.io.Writer;

import javax.annotation.Resource;
import javax.servlet.AsyncContext;
import javax.servlet.AsyncEvent;
import javax.servlet.AsyncListener;
import javax.servlet.ServletException;
import javax.servlet.UnavailableException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/myServlet", initParams={@WebInitParam(name="",value="")})
@MultipartConfig(maxFileSize=100,fileSizeThreshold=10,location="Downloads",maxRequestSize=1000)
public class MyDollarServlet extends HttpServlet {

	@Resource(name="env/dollarPrice",type=java.lang.Double.class)
	private Double dollarPrice;
	
	
	
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		throw new UnavailableException("");
	}




	public void doGet(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException 
	{
	  	
	  AsyncContext ctx = req.startAsync(); 
	  
	  ctx.addListener( new AsyncListener() {
		
		@Override
		public void onTimeout(AsyncEvent arg0) throws IOException {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void onStartAsync(AsyncEvent arg0) throws IOException {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void onError(AsyncEvent arg0) throws IOException {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void onComplete(AsyncEvent arg0) throws IOException {
			// TODO Auto-generated method stub
			
		}
	});
	  
	  
      resp.setContentType("text/html");
      Writer out = resp.getWriter();
      out.write("<html> <body> Dollar price:"+dollarPrice);
      out.write("</body></html> ");
	}

}
