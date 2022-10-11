package mvcInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@SuppressWarnings("deprecation")
public class MyInterceptor extends HandlerInterceptorAdapter{

	//preHandler
	
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		System.out.println("This is preHandler..");
		
		String name=request.getParameter("user");
		if(name.startsWith("d"))
		{
			response.setContentType("text/html");
			response.getWriter().println("Invalid name..Name should not start with d");
			return false;
		}
		return true;
	}

	
	//postHandler
	
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		System.out.println("This is Post Handler..");
		
		//this is optional
		super.postHandle(request, response, handler, modelAndView);
		
	}


	//after view render
	
	
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {


		System.out.println("This is after completion method ..");
		
		//this is optional
		super.afterCompletion(request, response, handler, ex);
	}
	
	
	
	
	
		
	
}
