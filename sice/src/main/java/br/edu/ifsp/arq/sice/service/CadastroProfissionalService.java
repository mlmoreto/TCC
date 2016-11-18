package br.edu.ifsp.arq.sice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.edu.ifsp.arq.sice.model.Profissional;
import br.edu.ifsp.arq.sice.repository.Profissionais;

@Service
public class CadastroProfissionalService {

	@Autowired
	private Profissionais profissionais;

	@Transactional
	public void salvar(Profissional profissional){
		profissionais.save(profissional);
	}
}
