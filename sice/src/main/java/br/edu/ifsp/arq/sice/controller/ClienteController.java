package br.edu.ifsp.arq.sice.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.edu.ifsp.arq.sice.model.Cliente;

@Controller
public class ClienteController {
	
	@RequestMapping("/clientes/cadastro")
	public String cadastro(Cliente cliente) {
		return "cliente/cadastro-cliente";
	} 

	@RequestMapping(value = "/clientes/cadastro", method = RequestMethod.POST)
	public String cadastrar(@Valid Cliente cliente, BindingResult result, Model model, RedirectAttributes attributes) {
		if(result.hasErrors()){		
			//coloca os valores de volta nos campos quando der erro.			
			return cadastro(cliente);
		}
		attributes.addFlashAttribute("mensagem", "Cliente salvo com sucesso!");
		
		return "redirect:/clientes/cadastro";
		
	}
}
