package br.com.fiap.entity;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@IdClass(CorridaPK.class)
@Table(name="T_CORRIDA")
public class Corrida {

	@Id
	@GeneratedValue(generator="corrida", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="corrida", sequenceName="SQ_T_CORRIDA", allocationSize=1)
	private int codigo;

	@Id
	@ManyToOne
	@JoinColumn(name="cd_motorista")
	private Motorista motorista;
	
	@Id
	@ManyToOne
	@JoinColumn(name="cd_passageiro")
	private Passageiro passageiro;
	
	@OneToMany(mappedBy="corrida")
	private List<Pagamento> pagamentos;
	
	@Column(name="ds_origem", length=150)
	private String origem;
	
	@Column(name="ds_destino", length=150)
	private String destino;

	@Temporal(value=TemporalType.TIMESTAMP)
	@Column(name="dt_corrida")
	private Calendar data;
	
	@Column(name="vl_corrida", nullable=false)
	private double valor;

	
	
	
	public Corrida(String origem, String destino, Calendar data, double valor) {
		super();
		this.origem = origem;
		this.destino = destino;
		this.data = data;
		this.valor = valor;
	}

	public Corrida() {
		super();
	}

	public Corrida(int codigo, Motorista motorista, Passageiro passageiro, List<Pagamento> pagamentos, String origem,
			String destino, Calendar data, double valor) {
		super();
		this.codigo = codigo;
		this.motorista = motorista;
		this.passageiro = passageiro;
		this.pagamentos = pagamentos;
		this.origem = origem;
		this.destino = destino;
		this.data = data;
		this.valor = valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Motorista getMotorista() {
		return motorista;
	}

	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}

	public Passageiro getPassageiro() {
		return passageiro;
	}

	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}

	public List<Pagamento> getPagamentos() {
		return pagamentos;
	}

	public void setPagamentos(List<Pagamento> pagamentos) {
		this.pagamentos = pagamentos;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
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
	
	
	//get, set e construtores


	
}
