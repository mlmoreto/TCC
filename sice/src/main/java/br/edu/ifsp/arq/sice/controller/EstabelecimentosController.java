package br.edu.ifsp.arq.sice.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.edu.ifsp.arq.sice.model.Estabelecimento;
import br.edu.ifsp.arq.sice.repository.Estabelecimentos;
import br.edu.ifsp.arq.sice.service.CadastroEstabelecimentoService;

@Controller
public class EstabelecimentosController {
	
	@Autowired
	private Estabelecimentos estabelecimentos;
	
	@Autowired
	private CadastroEstabelecimentoService ces;

	@RequestMapping("/estabelecimentos/cadastro-estabelecimento")
	public ModelAndView novo(Estabelecimento estabelecimento) {
		ModelAndView mv = new ModelAndView("estabelecimento/cadastro-estabelecimento");
		mv.addObject("estabelecimentos", estabelecimentos.findAll());
		return mv;
	} 

	@RequestMapping(value = "/estabelecimentos/cadastro-estabelecimento", method = RequestMethod.POST)
	public ModelAndView cadastrar(@Valid Estabelecimento estabelecimento, BindingResult result, Model model, RedirectAttributes attributes) {
		if(result.hasErrors()){		
			//coloca os valores de volta nos campos quando der erro.			
			return novo(estabelecimento);
		}
		
		ces.salvar(estabelecimento);
		
		attributes.addFlashAttribute("mensagem", "Estabelecimentos salvo com sucesso!");
		
		return new ModelAndView("redirect:/estabelecimentos/cadastro-estabelecimento");	
		
	}
	
}
