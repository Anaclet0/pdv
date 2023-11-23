package br.com.pdv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.pdv.repository.ItensRepository;



@Controller

public class ItemController {
	@Autowired
	private ItensRepository itensRepository;
	
	@GetMapping({"/itens"})
	public String home(ModelMap model) {
		model.addAttribute("itens", itensRepository.findAll());
		return "itens";
	}

}
