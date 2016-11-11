package br.edu.ifsp.arq.sice.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "profissional")
public class Profissional implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull (message = "O ID é obrigatório.")
	private Integer idProfissional;	
		
	@NotNull (message = "O ID é obrigatório")
	@ManyToOne
	@JoinColumn(name = "idLocal")	
	private Estabelecimento idLocal; //chave estrangeira da classe Profissional*/
	
	@NotNull (message = "O ID é obrigatório")
	@ManyToOne
	@JoinColumn(name = "idServico")	
	private Servico idServico; //chave estrangeira da classe Profissional
		
	@NotBlank (message = "O nome é obrigatório")
	private String nomeProfissional;
	
	@NotBlank (message = "O CPF é obrigatório")
	private String cpf;	
	
	@NotBlank (message = "O telefone é obrigatório")
	private String telefone;
	
	@NotBlank (message = "O e-mail é obrigatório")
	private String email;
		
	public Integer getIdProfissional() {
		return idProfissional;
	}

	public void setIdProfissional(Integer idProfissional) {
		this.idProfissional = idProfissional;
	}

	public Estabelecimento getIdLocal() {
		return idLocal;
	}

	public void setIdLocal(Estabelecimento idLocal) {
		this.idLocal = idLocal;
	}

	public String getNomeProfissional() {
		return nomeProfissional;
	}

	public void setNomeProfissional(String nomeProfissional) {
		this.nomeProfissional = nomeProfissional;
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
		result = prime * result + ((idProfissional == null) ? 0 : idProfissional.hashCode());
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
		if (idProfissional == null) {
			if (other.idProfissional != null)
				return false;
		} else if (!idProfissional.equals(other.idProfissional))
			return false;
		return true;
	}
	
}
