package br.com.pdv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.pdv.repository.LojasRepository;

@Controller

public class LojaController {
	@Autowired
	private LojasRepository lojasRepository;
	
	@GetMapping({"/lojas"})
	public String home(ModelMap model) {
		model.addAttribute("lojas", lojasRepository.findAll());
		return "lojas";
	}

}
