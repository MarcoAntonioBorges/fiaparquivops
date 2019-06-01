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
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SecondaryTable;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="T_MOTORISTA")
@SecondaryTable(name="T_DADOS_MOTORISTA")
@SequenceGenerator(name="motorista", sequenceName="SQ_T_MOTORISTA", allocationSize=1)
public class Motorista {
	
	@Id
	@Column(name="cd_motorista")
	@GeneratedValue(generator="motorista", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@OneToMany(mappedBy="motorista")
	private List<Corrida> corridas;
	
	@ManyToMany(mappedBy="motoristas")
	private List<Veiculo> veiculos;
	
	@Column(name="nr_carteira", nullable=false)
	private int numeroCarteira;
	
	@Column(name="nm_motorista", nullable=false, length=150)
	private String nome;
	
	@Temporal(value=TemporalType.DATE)
	@Column(name="dt_nascimento")
	private Calendar dtNascimento;
	
	@Lob
	@Column(name="fl_carteira")
	private byte[] foto;
	
	@Enumerated(value=EnumType.STRING)
	@Column(name="ds_genero")
	private Genero genero;
	
	@Column(name="nr_banco", table="T_DADOS_MOTORISTA", nullable=false)
	private int banco;
	
	@Column(name="nr_agencia", table="T_DADOS_MOTORISTA", nullable=false)
	private int agencia;
	
	@Column(name="nr_conta", table="T_DADOS_MOTORISTA", nullable=false)
	private int conta;

	
	
	public Motorista(int numeroCarteira, String nome, Calendar dtNascimento, byte[] foto, Genero genero, int banco,
			int agencia, int conta) {
		super();
		this.numeroCarteira = numeroCarteira;
		this.nome = nome;
		this.dtNascimento = dtNascimento;
		this.foto = foto;
		this.genero = genero;
		this.banco = banco;
		this.agencia = agencia;
		this.conta = conta;
	}

	public Motorista() {
		super();
	}

	public Motorista(int codigo, List<Corrida> corridas, List<Veiculo> veiculos, int numeroCarteira, String nome,
			Calendar dtNascimento, byte[] foto, Genero genero, int banco, int agencia, int conta) {
		super();
		this.codigo = codigo;
		this.corridas = corridas;
		this.veiculos = veiculos;
		this.numeroCarteira = numeroCarteira;
		this.nome = nome;
		this.dtNascimento = dtNascimento;
		this.foto = foto;
		this.genero = genero;
		this.banco = banco;
		this.agencia = agencia;
		this.conta = conta;
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

	public List<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}

	public int getNumeroCarteira() {
		return numeroCarteira;
	}

	public void setNumeroCarteira(int numeroCarteira) {
		this.numeroCarteira = numeroCarteira;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Calendar dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public int getBanco() {
		return banco;
	}

	public void setBanco(int banco) {
		this.banco = banco;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}
	
	

}
