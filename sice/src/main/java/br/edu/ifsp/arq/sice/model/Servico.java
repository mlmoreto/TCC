package br.edu.ifsp.arq.sice.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotBlank;

public class Servico {
	
	private Integer idServico;
	
	@OneToMany(mappedBy = "idServico")
	private List<Profissional> profissionais;	
	
	@NotBlank (message = "O nome é obrigatório")
	private String nomeServico;
	
	@NotBlank (message = "O preço é obrigatório")
	private BigDecimal preco;

	public Integer getIdServico() {
		return idServico;
	}

	public void setIdServico(Integer idServico) {
		this.idServico = idServico;
	}
	
	public String getNomeServico() {
		return nomeServico;
	}

	public void setNomeServico(String nomeServico) {
		this.nomeServico = nomeServico;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	
	
}
