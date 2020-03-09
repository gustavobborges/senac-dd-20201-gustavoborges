package model.entity;

public class Telefone extends Cliente{
	
	private int idTelefone;
	private String codNacional;
	private String ddd;
	private String  numero;
	private boolean movel;
	private Cliente dono;
	public Telefone(int idCliente, String nome, String cpf, Endereco endereco, int idTelefone, String codNacional,
			String ddd, String numero, boolean movel, Cliente dono) {
		super(idCliente, nome, cpf, endereco);
		this.idTelefone = idTelefone;
		this.codNacional = codNacional;
		this.ddd = ddd;
		this.numero = numero;
		this.movel = movel;
		this.dono = dono;
	}
	public Telefone() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdTelefone() {
		return idTelefone;
	}
	public void setIdTelefone(int idTelefone) {
		this.idTelefone = idTelefone;
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
	public Cliente getDono() {
		return dono;
	}
	public void setDono(Cliente dono) {
		this.dono = dono;
	}
	
	@Override
	public String toString() {
		return "Telefone [idTelefone=" + idTelefone + ", codNacional=" + codNacional + ", ddd=" + ddd + ", numero="
				+ numero + ", movel=" + movel + ", dono=" + (dono != null ? dono.getNome() : "sem dono") + "]";
	}
}