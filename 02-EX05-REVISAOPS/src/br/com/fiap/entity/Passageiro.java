package br.com.fiap.entity;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_PASSAGEIRO")
@SequenceGenerator(name="passageiro", sequenceName="SQ_T_PASSAGEIRO", allocationSize=1)
public class Passageiro {
	
	@Id
	@Column(name="cd_passageiro")
	@GeneratedValue(generator="passageiro", strategy=GenerationType.SEQUENCE)
	private int codigo;

	@OneToMany(mappedBy="passageiro")
	private List<Corrida> corridas;
	
	@Column(name="nm_passageiro", nullable=false, length=100)
	private String nome;

	@Temporal(value=TemporalType.DATE)
	@Column(name="dt_nascimento")
	private Calendar dataNascimento;
	
	@Enumerated(value=EnumType.STRING)
	@Column(name="ds_genero")
	private Genero genero;

	
	
	public Passageiro(String nome, Calendar dataNascimento, Genero genero) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.genero = genero;
	}

	public Passageiro() {
		super();
	}

	public Passageiro(int codigo, List<Corrida> corridas, String nome, Calendar dataNascimento, Genero genero) {
		super();
		this.codigo = codigo;
		this.corridas = corridas;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.genero = genero;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public List<Corrida> getCorridas() {
		return corridas;
	}

	public void setCorridas(List<Corrida> corridas) {
		this.corridas = corridas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}	
	
	

}
