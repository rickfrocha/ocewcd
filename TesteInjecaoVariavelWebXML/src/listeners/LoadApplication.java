package listeners;

import java.util.Set;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import servlets.MyDollarServlet;

public class LoadApplication implements ServletContainerInitializer{

	@Override
	public void onStartup(Set<Class<?>> arg0, ServletContext evt) throws ServletException {
		evt.addServlet("myServlet",MyDollarServlet.class);		
	}

}
