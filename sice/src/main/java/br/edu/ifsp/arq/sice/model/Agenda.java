package br.edu.ifsp.arq.sice.model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "agenda")
public class Agenda implements Serializable{	

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAgenda;
	
	@ManyToOne
	@JoinColumn(name = "idCliente")
	private Cliente idCliente; //chave estrangeira da classe Cliente
	
	@ManyToOne
	@JoinColumn(name = "idProfissional")	
	private Profissional idProfissional; //chave estrangeira da classe Profissional
	
	@ManyToOne
	@JoinColumn(name = "idServico")	
	private Servico idServico; //chave estrangeira da classe Servico

	@ManyToOne
	@JoinColumn(name = "idLocal")	
	private Estabelecimento idLocal; //chave estrangeira da classe Estabelecimentos
	
	private Calendar dataAgenda;	
	
	
	public Long getIdAgenda() {
		return idAgenda;
	}

	public void setIdAgenda(Long idAgenda) {
		this.idAgenda = idAgenda;
	}

	public Cliente getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Cliente idCliente) {
		this.idCliente = idCliente;
	}

	public Profissional getIdProfissional() {
		return idProfissional;
	}

	public void setIdProfissional(Profissional idProfissional) {
		this.idProfissional = idProfissional;
	}

	public Servico getIdServico() {
		return idServico;
	}

	public void setIdServico(Servico idServico) {
		this.idServico = idServico;
	}

	public Estabelecimento getIdLocal() {
		return idLocal;
	}

	public void setIdLocal(Estabelecimento idLocal) {
		this.idLocal = idLocal;
	}

	public Calendar getDataAgenda() {
		return dataAgenda;
	}

	public void setDataAgenda(Calendar dataAgenda) {
		this.dataAgenda = dataAgenda;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idAgenda == null) ? 0 : idAgenda.hashCode());
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
		Agenda other = (Agenda) obj;
		if (idAgenda == null) {
			if (other.idAgenda != null)
				return false;
		} else if (!idAgenda.equals(other.idAgenda))
			return false;
		return true;
	}
	
}
