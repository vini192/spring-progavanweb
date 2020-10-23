package br.com.unipe.aula.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class atividade {
	@RequestMapping (value = "/form", method = RequestMethod.POST)
	public String form() {
		return "form";
	}
}
