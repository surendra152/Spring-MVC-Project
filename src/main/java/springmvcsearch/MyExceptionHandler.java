package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler {
	
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
	
}
