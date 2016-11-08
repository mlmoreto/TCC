package br.edu.ifsp.arq.sice.model;

import java.util.Date;
import java.util.Timer;

public class Agenda {
	
	// As informações das outras classes (nome do profissional, nome do serviço) serão carregadas em um comboBox,
	//mas serão salvos somente os ids na tabela de relacionamento da agenda (rel_agenda).
	private Integer id_agenda;
	private Integer id_cliente;
	private Integer id_profissional;
	private Integer id_servico;
	private Date data_agenda;
	private Timer horario;
	
	
	public Integer getId_agenda() {
		return id_agenda;
	}
	
	public void setId_agenda(Integer id_agenda) {
		this.id_agenda = id_agenda;
	}
	
	public Integer getId_cliente() {
		return id_cliente;
	}
	
	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}
	
	public Integer getId_profissional() {
		return id_profissional;
	}
	
	public void setId_profissional(Integer id_profissional) {
		this.id_profissional = id_profissional;
	}
	
	public Integer getId_servico() {
		return id_servico;
	}
	
	public void setId_servico(Integer id_servico) {
		this.id_servico = id_servico;
	}
	
	public Date getData_agenda() {
		return data_agenda;
	}
	
	public void setData_agenda(Date data_agenda) {
		this.data_agenda = data_agenda;
	}
	
	public Timer getHorario() {
		return horario;
	}
	
	public void setHorario(Timer horario) {
		this.horario = horario;
	}
	
	
	
}
