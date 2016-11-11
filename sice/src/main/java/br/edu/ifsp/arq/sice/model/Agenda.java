package br.edu.ifsp.arq.sice.model;

import java.util.Date;
import java.util.Timer;

public class Agenda {
	
	// As informações das outras classes (nome do profissional, nome do serviço) serão carregadas em um comboBox,
	//mas serão salvos somente os ids na tabela de relacionamento da agenda (rel_agenda).
	private Integer idAgenda;
	private Integer idCliente;
	private Integer idProfissional;
	private Integer idServico;
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
	
	

	
}
