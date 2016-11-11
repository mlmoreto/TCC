package br.edu.ifsp.arq.sice.model;

import org.hibernate.validator.constraints.NotBlank;

public class Cliente {

	private Integer idCliente;
	
	@NotBlank (message = "O nome é obrigatório")
	private String nomeCliente;
	
	@NotBlank (message = "O CPF é obrigatório")
	private String cpf;
	
	@NotBlank (message = "O telefone é obrigatório")
	private String telefone;
	
	@NotBlank (message = "O e-mail é obrigatório")
	private String email;
	
	@NotBlank (message = "O endereço é obrigatório")
	private String endereco;

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	
	
	
}
