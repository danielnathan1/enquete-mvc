package br.com.enquete.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.enquete.dao.CandidatoDao;

@Controller
public class WelcomeController {
	
	@RequestMapping("/")
	public String Welcome() {
		return "redirect:/votar/votacao";
	}
}
