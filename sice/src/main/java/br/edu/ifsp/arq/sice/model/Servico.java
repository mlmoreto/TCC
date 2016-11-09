package br.edu.ifsp.arq.sice.model;

import org.hibernate.validator.constraints.NotBlank;

public class Servico {
	
	private Integer id_servico;
	
	private Integer id_profissional;
	
	@NotBlank (message = "O nome é obrigatório")
	private String nome_servico;
	
	@NotBlank (message = "O preço é obrigatório")
	private double preco;

	public Integer getId_servico() {
		return id_servico;
	}

	public void setId_servico(Integer id_servico) {
		this.id_servico = id_servico;
	}

	public Integer getId_profissional() {
		return id_profissional;
	}

	public void setId_profissional(Integer id_profissional) {
		this.id_profissional = id_profissional;
	}

	public String getNome_servico() {
		return nome_servico;
	}

	public void setNome_servico(String nome_servico) {
		this.nome_servico = nome_servico;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
