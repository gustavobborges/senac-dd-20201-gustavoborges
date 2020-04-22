package model.entity;

import java.util.List;

public class Cliente {

	private int idCliente;
	private String nome;
	private String sobrenome;
	private String cpf;
	private Endereco endereco;
	private List<Telefone> telefones;

	public Cliente(int idCliente, String nome, String sobrenome, String cpf, Endereco endereco,
			List<Telefone> telefones) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefones = telefones;
	}

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNomeCompleto() {
		return this.nome + " " + this.sobrenome;
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

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
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
		String mensagem = "Cliente: " + this.getNomeCompleto() + " {" + cpf + "}";

		for(Telefone t:telefones)	{
			mensagem += t.toString() + "/n";
		}

		return mensagem;

	}

	public int getId() {
		return idCliente;
	}
	

}

