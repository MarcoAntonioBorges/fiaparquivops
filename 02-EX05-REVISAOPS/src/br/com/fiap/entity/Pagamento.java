package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_PAGAMENTO")
@SequenceGenerator(name="pagamento", sequenceName="SQ_T_PAGAMENTO", allocationSize=1)
public class Pagamento {

	@Id
	@Column(name="cd_pagamento")
	@GeneratedValue(generator="pagamento", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@ManyToOne
	@JoinColumn(name="cd_corrida")
	private Corrida corrida;
	
	@Temporal(value=TemporalType.TIMESTAMP)
	@Column(name="dt_pagamento", nullable=false)
	private Calendar data;
	
	@Column(name="vl_pagamento", nullable=false)
	private double valor;
	
	@Column(nullable=false, name="ds_forma_pagamento")
	private String forma;

	public Pagamento(int codigo, Corrida corrida, Calendar data, double valor, String forma) {
		super();
		this.codigo = codigo;
		this.corrida = corrida;
		this.data = data;
		this.valor = valor;
		this.forma = forma;
	}

	public Pagamento() {
		super();
	}

	public Pagamento(Calendar data, double valor, String forma) {
		super();
		this.data = data;
		this.valor = valor;
		this.forma = forma;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Corrida getCorrida() {
		return corrida;
	}

	public void setCorrida(Corrida corrida) {
		this.corrida = corrida;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}
	
	
	
	
	
}
