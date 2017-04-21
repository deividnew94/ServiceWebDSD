package pe.com.gmd.disfruta.back.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LoginFilter implements Filter{

    private String loginPage = "login.jsp";
    private String timeoutPage = "error.jsp";
    
    public void init(FilterConfig filterConfig) throws ServletException {
    }
    
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
    	/*if ((request instanceof HttpServletRequest)	&& (response instanceof HttpServletResponse)) {
		    HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		    HttpServletResponse httpServletResponse = (HttpServletResponse) response;
		    
		    String requestPath = httpServletRequest.getRequestURI();
		    boolean loginVal = requestPath.endsWith("login.jsp") || requestPath.endsWith("error.jsp");
		    if (!loginVal) {
		    	//Verificamos si tiene sesion
		    	if(httpServletRequest.getSession().getAttribute("usuario") == null){
		    		httpServletResponse.sendRedirect(loginPage);
		    	}
		    }
    	}
    	filterChain.doFilter(request, response);*/
    }  

	public void destroy() {
		// TODO Auto-generated method stub		
	}

	public String getLoginPage() {
		return loginPage;
	}

	public void setLoginPage(String loginPage) {
		this.loginPage = loginPage;
	}

	public String getTimeoutPage() {
		return timeoutPage;
	}

	public void setTimeoutPage(String timeoutPage) {
		this.timeoutPage = timeoutPage;
	}
	
}
