package tp.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter(filterName = "MyFilter", urlPatterns = {"/private/*", "/includes/*"})
public class MyGenericFilter implements javax.servlet.Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		if ( ((HttpServletRequest)request).getSession().getAttribute("connected") != null ) {
			chain.doFilter(request, response);
		} else {
			((HttpServletResponse)response).sendRedirect("../public/login.jsp");
		}
		
	}
	
	

}
