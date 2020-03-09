package model.entity;

import java.util.List;

public class Cliente {
	
	private int idCliente;
	private String nome;
	private String cpf;
	private Endereco endereco;
	public Cliente(int idCliente, String nome, String cpf, Endereco endereco) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	private List<Telefone> telefones;
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public List<Telefone> getTelefones() {
		return telefones;
	}
	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco
				+ ", telefones=" + telefones + "]";
	}
	
	
	
}