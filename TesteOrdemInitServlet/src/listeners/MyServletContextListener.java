package listeners;

import java.util.Set;

import javax.annotation.PostConstruct;
import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebListener;


@WebListener
public class MyServletContextListener {

	public MyServletContextListener() {
		System.out.println(">>>>>>>> ServletContextListener: Construtor padrao");
	}
	
	//@PostConstruct
	public void startListener() {
		System.out.println(">>>>>>>> ServletContextListener: startListener()");
		
	}
	
//	@Override
//	public void contextInitialized(ServletContextEvent event) {
//		// TODO Auto-generated method stub
//		
//	}	
//	@Override
//	public void contextDestroyed(ServletContextEvent event) {
//		// TODO Auto-generated method stub
//		
//	}


	public void onStartup(Set<Class<?>> arg0, ServletContext arg1) throws ServletException {
		System.out.println(">>>>>>>> ServletContextListener: onStartup()");
		
	}


}
