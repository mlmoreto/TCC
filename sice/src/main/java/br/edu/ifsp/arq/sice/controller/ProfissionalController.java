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

import br.edu.ifsp.arq.sice.model.Profissional;
import br.edu.ifsp.arq.sice.repository.Profissionais;
import br.edu.ifsp.arq.sice.service.CadastroProfissionalService;

@Controller
public class ProfissionalController {
	
	@Autowired
	private Profissionais profissionais;
	
	@Autowired
	private CadastroProfissionalService cps;
	
	@RequestMapping("/estabelecimentos/cadastro-profissional")
	public ModelAndView novo(Profissional profissional) {
		ModelAndView mv = new ModelAndView("estabelecimento/cadastro-profissional");
		mv.addObject("profissionais", profissionais.findAll());
		return mv;
	} 

	@RequestMapping(value = "/estabelecimentos/cadastro-profissional", method = RequestMethod.POST)
	public ModelAndView cadastrar(@Valid Profissional profissional, BindingResult result, Model model, RedirectAttributes attributes) {
		if(result.hasErrors()){		
			//coloca os valores de volta nos campos quando der erro.			
			return novo(profissional);
		}
		
		cps.salvar(profissional);
		
		attributes.addFlashAttribute("mensagem", "Profissional salvo com sucesso!");
		
		return new ModelAndView("redirect:/estabelecimentos/cadastro-profissional");	
		
	}

}
