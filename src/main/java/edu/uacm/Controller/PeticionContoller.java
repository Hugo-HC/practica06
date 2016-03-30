package edu.uacm.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/peticion")
public class PeticionContoller {
	@RequestMapping(value="/redir" , method=RequestMethod.POST)
	public String redireccionar(){
		return "redirect:rediccion.html";
		
	}
	
}
