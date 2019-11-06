package com.spring.escompany;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
* <h1>Main</h1>
* The HomeController program is used to wrap the requestmappings with the JSP or HTML pages.
* <p>
* Giving proper comments in our program makes it more
* user-friendly and it is assumed as a high-quality code.
* 
*
* @author  Maurizio Bella
* @version 1.0
* @since   2019-09-15
* @author  Maurizio Bella
* @version 1.1
* @since   2019-10-14 
*/
@Controller
public class HomeController {
	
	/**
	   * This method is used to map the requests caming to the root URI (/) to the HTML file index.html deployed on webapp folder 
	   * @param args Unused.
	   * @return send back to the user the index.html file
   */

	@RequestMapping("/")
	public String home()
	{
		//test
		return "index.html";
		//return "home.jsp";
		
	}
	
	@RequestMapping("/login")
	public String loginPage()
	{
		return "login.html";
		
	}

	
	@RequestMapping("/logout-success")
	public String logoutPage()
	{
		return "logout.jsp";
		
	}
	

}
