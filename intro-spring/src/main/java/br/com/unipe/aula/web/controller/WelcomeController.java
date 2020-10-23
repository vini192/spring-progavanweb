package br.com.unipe.aula.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class WelcomeController {
	

	@RequestMapping(value = "/conversor", method = RequestMethod.GET)
	public String formulario() {
		return "formulario";
	}
	
	@RequestMapping(value = "/conversor", method = RequestMethod.POST)
	public ModelAndView exibetime(@RequestParam int dolar) {
		ModelAndView view = new ModelAndView("formulario");
		
		view.addObject("mensagem", dolar*5.63);
		
		return view;
	}
}
