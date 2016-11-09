package br.edu.ifsp.arq.sice.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.edu.ifsp.arq.sice.model.Profissional;

@Controller
public class ProfissionalController {
	
	@RequestMapping("/estabelecimentos/cadastro-profissional")
	public String cadastro(Profissional profissional) {
		return "estabelecimento/cadastro-profissional";
	} 

	@RequestMapping(value = "/estabelecimentos/cadastro-profissional", method = RequestMethod.POST)
	public String cadastrar(@Valid Profissional profissional, BindingResult result, Model model, RedirectAttributes attributes) {
		if(result.hasErrors()){		
			//coloca os valores de volta nos campos quando der erro.			
			return cadastro(profissional);
		}
		attributes.addFlashAttribute("mensagem", "Profissional salvo com sucesso!");
		
		return "redirect:/estabelecimentos/cadastro-profissional";
		
	}

}
