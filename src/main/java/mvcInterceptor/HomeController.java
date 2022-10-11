package mvcInterceptor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {
	
	@RequestMapping("/interceptor")
	public String home()
	{
		System.out.println("home controller view..");
		return "interform";
	}
		
	@RequestMapping("/welcome")
	public String welcome(@RequestParam("user") String name, Model m)
	{
		System.out.println(name);
		m.addAttribute("Name",name);
		return "welcome";
	}
}
