package controller.exercicio1;

import java.util.ArrayList;

import model.bo.ClienteBO;
import model.bo.exercicio1.EnderecoBO;
import model.dao.exercicio1.ClienteDAO;
import model.vo.exercicio1.Cliente;
import model.vo.exercicio1.Endereco;

public class ClienteController {

	private ClienteBO bo = new ClienteBO();
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
				mensagemValidacao = "Nome/Sobrenome devem possuir pelo menos " + tamanhoMinimo + " e no máximo "
						+ tamanhoMaximo + " caracteres. \n";
			}
		}
		return mensagemValidacao;
	}

	public String excluir(Cliente cliente) {
		String mensagem = "";
		
		try {
			String clienteExcluido = clienteExcluido.toString();
			mensagem = bo.excluir(clienteExcluido);
		
		} catch mensagem = "Selecione um cliente...";
	}

	return mensagem;

	}

	private boolean validarCPF(String cpfCliente) {
		return false;

	}

}
