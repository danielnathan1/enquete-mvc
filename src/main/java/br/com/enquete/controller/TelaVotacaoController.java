package br.com.enquete.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.enquete.dao.CandidatoDao;
import br.com.enquete.dao.EnqueteDao;
import br.com.enquete.domain.Candidato;

@Controller
@RequestMapping(value = "votar")
public class TelaVotacaoController {
	
	@Autowired
	CandidatoDao dao;
	
	@Autowired
	EnqueteDao enquetedao;
	
	
	@RequestMapping(value = "/votacao", method = RequestMethod.GET)
	public ModelAndView listaTodos(ModelMap model) {
		model.addAttribute("candidatos", dao.getTodos());
		return new ModelAndView("/votacao/TelaVotacao", model);
	}
	
	@GetMapping("/resultado/{id}")
	public ModelAndView resultado(@PathVariable("id") Long id, ModelMap model) {
		Candidato candidato = dao.getId(id);
		dao.recebeVoto(candidato);
		enquetedao.recebeVoto(1);
		model.addAttribute("candidatos", dao.getTodos());
		return new ModelAndView("/votacao/Resultado", model);
	}
	
	@GetMapping("/resultado/detalhado")
	public ModelAndView resultadoDetalhado(ModelMap model) {
		model.addAttribute("candidatos", dao.getTodos());
		model.addAttribute("enquete", enquetedao.getTotalVotos());
		return new ModelAndView("/votacao/ResultadoPorcentagem", model);
	}

}
