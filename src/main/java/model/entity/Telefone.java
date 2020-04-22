package model.entity;

import java.util.List;

public class Telefone extends Cliente {

	private int idTelefone;
	private Cliente dono;
	private String codNacional;
	private String ddd;
	private String numero;
	private boolean movel;
	private boolean ativo;

	public Telefone(int idCliente, String nome, String sobrenome, String cpf, Endereco endereco,
			List<Telefone> telefones, int idTelefone, Cliente dono, String codNacional, String ddd, String numero,
			boolean movel, boolean ativo) {
		super(idCliente, nome, sobrenome, cpf, endereco, telefones);
		this.idTelefone = idTelefone;
		this.dono = dono;
		this.codNacional = codNacional;
		this.ddd = ddd;
		this.numero = numero;
		this.movel = movel;
		this.ativo = ativo;
	}

	public Telefone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Telefone(int idCliente, String nome, String sobrenome, String cpf, Endereco endereco,
			List<Telefone> telefones) {
		super(idCliente, nome, sobrenome, cpf, endereco, telefones);
		// TODO Auto-generated constructor stub
	}

	public int getIdTelefone() {
		return idTelefone;
	}

	public void setIdTelefone(int idTelefone) {
		this.idTelefone = idTelefone;
	}

	public Cliente getDono() {
		return dono;
	}

	public void setDono(Cliente dono) {
		this.dono = dono;
	}

	public String getCodNacional() {
		return codNacional;
	}

	public void setCodNacional(String codNacional) {
		this.codNacional = codNacional;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public boolean isMovel() {
		return movel;
	}

	public void setMovel(boolean movel) {
		this.movel = movel;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	@Override
	public String toString() {
		return "Telefone [idTelefone=" + idTelefone + ", codNacional=" + codNacional + ", ddd=" + ddd + ", numero="
				+ numero + ", movel=" + movel + ", dono=" + (dono != null ? dono.getNome() : "sem dono") + "]";
	}
}