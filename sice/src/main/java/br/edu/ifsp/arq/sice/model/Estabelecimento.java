package br.edu.ifsp.arq.sice.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "estabelecimento")
public class Estabelecimento implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLocal;		
	
	@OneToMany(mappedBy = "idLocal", targetEntity = Profissional.class, cascade = CascadeType.ALL)
	private List<Profissional> profissionais;
	
	@OneToMany(mappedBy = "idAgenda", targetEntity = Agenda.class, cascade = CascadeType.ALL)
	private List<Agenda> agendas;
	
	/*@ManyToOne
	@JoinColumn(name = "idUsuario")	
	private Login idUsuario; //chave estrangeira da classe Estabelecimentos*/
	
	@NotBlank (message = "O nome é obrigatório")	
	private String nomeLocal;	
	
	@NotBlank (message = "O CNPJ é obrigatório")
	private String cnpj;	
	
	@NotBlank (message = "O endereço é obrigatório")
	private String endereco;	
	
	@NotBlank (message = "A cidade é obrigatória")
	private String cidade;
	
	@NotBlank (message = "O telefone é obrigatório")
	private String telefone;	
	
	@NotBlank (message = "O e-mail é obrigatório")
	private String email;	

	public Long getIdLocal() {
		return idLocal;
	}

	public void setIdLocal(Long idLocal) {
		this.idLocal = idLocal;
	}

	public List<Profissional> getProfissionais() {
		return profissionais;
	}

	public void setProfissionais(List<Profissional> profissionais) {
		this.profissionais = profissionais;
	}

	public List<Agenda> getAgendas() {
		return agendas;
	}

	public void setAgendas(List<Agenda> agendas) {
		this.agendas = agendas;
	}

	public String getNomeLocal() {
		return nomeLocal;
	}

	public void setNomeLocal(String nomeLocal) {
		this.nomeLocal = nomeLocal;
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

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
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

	/*public Login getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Login idUsuario) {
		this.idUsuario = idUsuario;
	}*/

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idLocal == null) ? 0 : idLocal.hashCode());
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
		if (idLocal == null) {
			if (other.idLocal != null)
				return false;
		} else if (!idLocal.equals(other.idLocal))
			return false;
		return true;
	}
	
	
}
