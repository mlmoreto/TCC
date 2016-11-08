package br.edu.ifsp.arq.sice.model;

import org.hibernate.validator.constraints.NotBlank;

public class Cliente {

	private Integer id_cliente;
	
	@NotBlank (message = "O nome é obrigatório")
	private String nome_cliente;
	
	@NotBlank (message = "O CPF é obrigatório")
	private String cpf;
	
	@NotBlank (message = "O telefone é obrigatório")
	private String telefone;
	
	@NotBlank (message = "O e-mail é obrigatório")
	private String email;
	
	@NotBlank (message = "O endereço é obrigatório")
	private String endereco;

	public Integer getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNome_cliente() {
		return nome_cliente;
	}

	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
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
