package springmvc.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HomeController {

	
		@RequestMapping("/home")
		public String home(Model model) {
			
			System.out.println("create home page  controller");
			model.addAttribute("name", "Aditya singh Developer");
			
			model.addAttribute("id",812);
				
				List<String> friends = new ArrayList<String>();
					friends.add("sarita");
					friends.add("chiku");
					friends.add("deepak");
				model.addAttribute("f",friends);
			
			
			return"index";
		}
		
		@RequestMapping("/about")
		public String about()
		{
			System.out.println("this about page");
			return "about";
		}
		
		
		@RequestMapping("/service")
		public String service() {
			
			System.out.println("This is service baba ");
			
			return "service";
		}
		
		// service 
		// help 
		
		@RequestMapping("/help")
		public ModelAndView help() {
			
			System.out.println(" help baba bhale nath ");
			
			// creating model and view object 
			ModelAndView modelandview = new ModelAndView();
				
				// seting data 
				modelandview.addObject("name","mahakal baba");
				modelandview.addObject("rollnumber",1000);
				// seting the view name 
				modelandview.setViewName("help");
			
			return modelandview;
		}
		
		
		
		
		
		
		
	
}
