package springdemo.mvc;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
