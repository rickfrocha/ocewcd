package filtros;

import java.io.IOException;

import javax.servlet.annotation.WebFilter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

@WebFilter(urlPatterns="/teste")
public class ClasseNormalAnotadaComFiltro implements javax.servlet.Filter {
	
	public ClasseNormalAnotadaComFiltro() {
		System.out.println(">>>>>>>>>>>>>>>>>>> ClasseNormalAnotadaComFiltro");
	}


	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2) 
    throws IOException, ServletException 
    {
		
		
	}


	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}


}
