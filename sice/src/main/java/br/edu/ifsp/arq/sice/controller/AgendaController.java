package br.edu.ifsp.arq.sice.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.edu.ifsp.arq.sice.model.Agenda;

@Controller
public class AgendaController {
	
	@RequestMapping("/estabelecimentos/cadastro-agenda")
	public String cadastro(Agenda agenda) {
		return "estabelecimento/cadastro-agenda";
	} 

	@RequestMapping(value = "/estabelecimentos/cadastro-agenda", method = RequestMethod.POST)
	public String cadastrar(@Valid Agenda agenda, BindingResult result, Model model, RedirectAttributes attributes) {
		if(result.hasErrors()){		
			//coloca os valores de volta nos campos quando der erro.			
			return cadastro(agenda);
		}
		attributes.addFlashAttribute("mensagem", "Agenda salva com sucesso!");
		
		return "redirect:/estabelecimentos/cadastro-agenda";	
		
	}
	

}
