package springdemo.mvc;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeContoller {

	@RequestMapping("/")
	public String menu()
	{
		return "main-menu";
	}
	
	@RequestMapping("/showform")
	public String showForm()
	{
		
		
		return "showform";
	}
	
	@RequestMapping("/processform")
	public String processForm()
	{
		return "processform";
	}
	
	@RequestMapping("/processform2")
	public String processForm2(@RequestParam("studentName") String name,Model model)
	{
	name=name.toUpperCase();
		String changedName="Hello "+name;
		model.addAttribute("message",changedName);
		return "processform2";
	}
}
