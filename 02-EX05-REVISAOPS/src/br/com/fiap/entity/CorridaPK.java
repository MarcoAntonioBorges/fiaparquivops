package br.com.fiap.entity;

public class CorridaPK {

	private int codigo;
	
	private int motorista;
	
	private int passageiro;

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		result = prime * result + motorista;
		result = prime * result + passageiro;
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
		CorridaPK other = (CorridaPK) obj;
		if (codigo != other.codigo)
			return false;
		if (motorista != other.motorista)
			return false;
		if (passageiro != other.passageiro)
			return false;
		return true;
	}

	public CorridaPK() {
		super();
	}

	public CorridaPK(int codigo, int motorista, int passageiro) {
		super();
		this.codigo = codigo;
		this.motorista = motorista;
		this.passageiro = passageiro;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getMotorista() {
		return motorista;
	}

	public void setMotorista(int motorista) {
		this.motorista = motorista;
	}

	public int getPassageiro() {
		return passageiro;
	}

	public void setPassageiro(int passageiro) {
		this.passageiro = passageiro;
	}
	
	
	
}
