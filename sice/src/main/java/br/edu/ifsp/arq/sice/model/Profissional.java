package br.edu.ifsp.arq.sice.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "profissional")
public class Profissional implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull (message = "O ID é obrigatório.")
	private Integer id_profissional;
	
	@OneToMany(mappedBy = "id_local")
	private List<Estabelecimento> estabelecimentos;
		
	@Column(name = "nome_profissional")
	@NotBlank (message = "O nome é obrigatório")
	private String nome_profissional;
	

	@Column(name = "cpf")
	@NotBlank (message = "O CPF é obrigatório")
	private String cpf;
	
	@Column(name = "telefone")
	@NotBlank (message = "O telefone é obrigatório")
	private String telefone;
	
	@Column(name = "email")
	@NotBlank (message = "O e-mail é obrigatório")
	private String email;

	public Integer getId_profissional() {
		return id_profissional;
	}

	public void setId_profissional(Integer id_profissional) {
		this.id_profissional = id_profissional;
	}

	public String getNome_profissional() {
		return nome_profissional;
	}

	public void setNome_profissional(String nome_profissional) {
		this.nome_profissional = nome_profissional;
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_profissional == null) ? 0 : id_profissional.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profissional other = (Profissional) obj;
		if (id_profissional == null) {
			if (other.id_profissional != null)
				return false;
		} else if (!id_profissional.equals(other.id_profissional))
			return false;
		return true;
	}
	
}
