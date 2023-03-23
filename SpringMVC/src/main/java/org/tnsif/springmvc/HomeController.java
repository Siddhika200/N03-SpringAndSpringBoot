package org.tnsif.springmvc;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class HomeController {
	@RequestMapping("/home")
    public String home()
    {
    	System.out.println("Code to demostrate on simple web application");
    	return"home.jsp";
    }
    
}
