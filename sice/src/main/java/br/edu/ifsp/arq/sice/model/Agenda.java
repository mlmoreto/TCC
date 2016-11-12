package br.edu.ifsp.arq.sice.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Timer;

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
	private Integer idAgenda;
	
	@ManyToOne
	@JoinColumn(name = "idCliente")
	private Integer idCliente; //chave estrangeira da classe Cliente
	
	@ManyToOne
	@JoinColumn(name = "idProfissional")	
	private Integer idProfissional; //chave estrangeira da classe Profissional
	
	@ManyToOne
	@JoinColumn(name = "idServico")	
	private Integer idServico; //chave estrangeira da classe Servico

	@ManyToOne
	@JoinColumn(name = "idLocal")	
	private Estabelecimento idLocal; //chave estrangeira da classe Estabelecimento
	
	private Date dataAgenda;
	
	private Timer horario;

	public Integer getIdAgenda() {
		return idAgenda;
	}

	public void setIdAgenda(Integer idAgenda) {
		this.idAgenda = idAgenda;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public Integer getIdProfissional() {
		return idProfissional;
	}

	public void setIdProfissional(Integer idProfissional) {
		this.idProfissional = idProfissional;
	}

	public Integer getIdServico() {
		return idServico;
	}

	public void setIdServico(Integer idServico) {
		this.idServico = idServico;
	}

	public Estabelecimento getIdLocal() {
		return idLocal;
	}

	public void setIdLocal(Estabelecimento idLocal) {
		this.idLocal = idLocal;
	}

	public Date getDataAgenda() {
		return dataAgenda;
	}

	public void setDataAgenda(Date dataAgenda) {
		this.dataAgenda = dataAgenda;
	}

	public Timer getHorario() {
		return horario;
	}

	public void setHorario(Timer horario) {
		this.horario = horario;
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
