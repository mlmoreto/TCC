package br.edu.ifsp.arq.sice.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.edu.ifsp.arq.sice.model.Estabelecimento;

@Controller
public class EstabelecimentosController {

	@RequestMapping("/estabelecimentos/cadastro-estabelecimento")
	public String cadastro(Estabelecimento estabelecimento) {
		return "estabelecimento/cadastro-estabelecimento";
	} 

	@RequestMapping(value = "/estabelecimentos/cadastro-estabelecimento", method = RequestMethod.POST)
	public String cadastrar(@Valid Estabelecimento estabelecimento, BindingResult result, Model model, RedirectAttributes attributes) {
		if(result.hasErrors()){		
			//coloca os valores de volta nos campos quando der erro.			
			return cadastro(estabelecimento);
		}
		attributes.addFlashAttribute("mensagem", "Estabelecimento salvo com sucesso!");
		
		return "redirect:/estabelecimentos/cadastro-estabelecimento";	
		
	}
	
}
