package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	@RequestMapping("/home")	
	public String home()
	{	
		System.out.println("Going to home view..");
		
		return "home";
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query)
	{
		
		if(query.isBlank())
		{
			RedirectView redirectedView = new RedirectView();
			redirectedView.setUrl("home");
			return redirectedView;
		}
		else {
			String url="https:/www.google.com/search?q="+query;
			RedirectView redirectView = new RedirectView();
			redirectView.setUrl(url);
			
			return redirectView;
		}
		
	}
	
	@RequestMapping("/user/{userId}/{userName}")
	public String testPathVar(@PathVariable("userId") int id,@PathVariable("userName") String uName)
	{
		System.out.println("userId : "+id);
		System.out.println("Username: "+uName);
		return "home";
	}
	
	/*
	//handling exception in our spring mvc
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=NullPointerException.class)
	public String exceptionHandlerNull(Model m)
	{
		m.addAttribute("msg","NullPointerException");
		
		return "null_page";
	}
	
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=NumberFormatException.class)
	public String exceptionHandlerNum(Model m)
	{
		m.addAttribute("msg","NumberFormatException");
		
		return "null_page";
	}
	
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=Exception.class)
	public String exceptionGeneric(Model m)
	{
		m.addAttribute("msg","Exception Occured");
		
		return "null_page";
	}
	*/
}
