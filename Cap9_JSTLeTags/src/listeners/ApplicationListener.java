package listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class ApplicationListener
 *
 */
@WebListener
public class ApplicationListener implements ServletContextListener {
	
	private String[] optionsList = {"ligth", "amber", "brown", "dark"};


    public void contextInitialized(ServletContextEvent event) {
        event.getServletContext().setAttribute("colorList", optionsList);   
    }


	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println(">>>>>>>>>>>>>>>> Listener: Finalizando APP");
	}
	
}
