package br.edu.ifsp.arq.sice.model;

import java.io.Serializable;

import javax.persistence.Column;
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
@Table(name = "estabelecimento")
public class Estabelecimento implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull (message = "O ID é obrigatório")
	private Long id_local;	
	
	
	/*//@NotNull (message = "O ID é obrigatório")
	@ManyToOne
	@JoinColumn(name = "id_profissional")	
	private Profissional id_profissional; //chave estrangeira da classe Profissional*/
	
	
	@NotBlank (message = "O nome é obrigatório")
	private String nome_local;
	
	
	@NotBlank (message = "O CNPJ é obrigatório")
	private String cnpj;
	
	
	@NotBlank (message = "O endereço é obrigatório")
	private String endereco;
	
	
	@NotBlank (message = "O telefone é obrigatório")
	private String telefone;
	
	
	@NotBlank (message = "O e-mail é obrigatório")
	private String email;	

	public Long getId_local() {
		return id_local;
	}

	public void setId_local(Long id_local) {
		this.id_local = id_local;
	}
	

	/*public Profissional getId_profissional() {
		return id_profissional;
	}

	public void setId_profissional(Profissional id_profissional) {
		this.id_profissional = id_profissional;
	}*/

	public String getNome_local() {
		return nome_local;
	}

	public void setNome_local(String nome_local) {
		this.nome_local = nome_local;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
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
		result = prime * result + ((id_local == null) ? 0 : id_local.hashCode());
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
		Estabelecimento other = (Estabelecimento) obj;
		if (id_local == null) {
			if (other.id_local != null)
				return false;
		} else if (!id_local.equals(other.id_local))
			return false;
		return true;
	}
	
	
}
