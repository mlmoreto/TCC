package br.edu.ifsp.arq.sice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.edu.ifsp.arq.sice.model.Estabelecimento;
import br.edu.ifsp.arq.sice.repository.Estabelecimentos;

@Service
public class CadastroEstabelecimentoService {
	
	@Autowired
	private Estabelecimentos estabelecimentos;

	@Transactional
	public void salvar(Estabelecimento estabelecimento){
		estabelecimentos.save(estabelecimento);
	}
	
}
