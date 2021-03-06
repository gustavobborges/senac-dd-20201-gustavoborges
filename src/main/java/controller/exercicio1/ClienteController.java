package controller.exercicio1;

import java.util.ArrayList;

import model.bo.ClienteBO;
import model.bo.exercicio1.EnderecoBO;
import model.dao.exercicio1.ClienteDAO;
import model.dao.exercicio1.TelefoneDAO;
import model.exercicio1.seletor.ClienteSeletor;
import model.vo.exercicio1.Cliente;
import model.vo.exercicio1.Endereco;
import model.vo.exercicio1.Telefone;

public class ClienteController {
	private ClienteDAO dao = new ClienteDAO();

	public ArrayList<Cliente> listarTodosOsClientes() {
		return dao.consultarTodos();
	}

	public ArrayList<Cliente> listarClientes(ClienteSeletor seletor) {
		return dao.consultarPorSeletor(seletor);
	}
}
	
	
	
	
	
	
	
	
/*	private ClienteBO bo = new ClienteBO();
	private ClienteDAO dao = new ClienteDAO();

	private static final int TAMANHO_MINIMO = 2;
	private static final int TAMANHO_MAXIMO = 255;
	private static final int TAMANHO_CPF = 11;

	public ArrayList<Cliente> listarTodosOsClientes() {
		return dao.consultarTodos();
	}

	public String salvar(String nome, String sobrenome, String cpf, Endereco endereco) {
		String mensagem = "";
		// nome e sobrenome devem conter no minimo 2 caracteres e no maximo 255;
		// cpf deve conter 11 caracteres;
		// endereco nao pode ser nulo;

		mensagem += validarCamposDeTexto("Nome", nome, TAMANHO_MINIMO, TAMANHO_MAXIMO, true);
		mensagem += validarCamposDeTexto("Sobrenome", sobrenome, TAMANHO_MINIMO, TAMANHO_MAXIMO, true);
		mensagem += validarCamposDeTexto("CPF", cpf, 11, 11, true);

		if (mensagem.isEmpty()) {
			Cliente novoCliente = new Cliente(nome, sobrenome, cpf, null, endereco);

		}
	}

	private String validarCamposDeTexto(String string, String nome, int tamanhoMinimo, int tamanhoMaximo,
			boolean obrigatorio) {
		String mensagemValidacao = "";

		if (obrigatorio) {

			if (nome != null && !nome.isEmpty() || nome.length() < tamanhoMinimo || nome.length() > tamanhoMaximo) {
				mensagemValidacao = "Nome/Sobrenome devem possuir pelo menos " + tamanhoMinimo + " e no m�ximo "
						+ tamanhoMaximo + " caracteres. \n";
			}
		}
		return mensagemValidacao;
	}

	public String excluir(Cliente cliente) {
		String mensagem = "";
		
		ClienteDAO clienteDAO = new ClienteDAO();
		TelefoneDAO telefoneDAO = new TelefoneDAO();
		
		Telefone telefonesDoCliente = telefoneDAO.consultarPorId(cliente.getId());
		
		if (!telefonesDoCliente.isEmpty()) {
			mensagem = "O cliente n�o pode ser excluido pois tem telefone(s) cadastrado(s)..";
		} else {
			ClienteDAO.excluir(cliente.getId());
			mensagem = "O Cliente foi exclu�do com sucesso!";
		}	
			
	return mensagem;

	}

	private boolean validarCPF(String cpfCliente) {
		return false;

	}

}
*/
