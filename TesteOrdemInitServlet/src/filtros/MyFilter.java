package filtros;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter(filterName="myFilter",urlPatterns={"/*"})
public class MyFilter implements javax.servlet.Filter{
	
	public MyFilter() {
		System.out.println(">>>> Filtro: Construtor padrao");
	}
	
	@PostConstruct
	public void startFilter(){
		System.out.println(">>>> Filtro: startFilter()");
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println(">>>> Filtro:  init()");
		
	}
	

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp , FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		
	}

	@PreDestroy
	public void preDestroy(){
		System.out.println(">>>> Filtro: preDestroy()");
	}
	
	@Override
	public void destroy() {
		System.out.println(">>>> Filtro: destroy()");
		
	}
	

}
