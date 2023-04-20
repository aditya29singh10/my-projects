package springmvc.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
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
		
		@RequestMapping("/help")
		public String help() {
			
			System.out.println(" help baba bhale nath ");
			
			return "help";
		}
		
		
		
		
		
		
		
	
}
