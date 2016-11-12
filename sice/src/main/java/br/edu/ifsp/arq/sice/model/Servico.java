package br.edu.ifsp.arq.sice.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotBlank;

public class Servico {
	
	private Integer idServico;
	
	@OneToMany(mappedBy = "idServico")
	private List<Profissional> profissionais;	
	
	@OneToMany(mappedBy = "idAgenda")
	private List<Agenda> agendas;	
	
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idServico == null) ? 0 : idServico.hashCode());
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
		Servico other = (Servico) obj;
		if (idServico == null) {
			if (other.idServico != null)
				return false;
		} else if (!idServico.equals(other.idServico))
			return false;
		return true;
	}

	
}
