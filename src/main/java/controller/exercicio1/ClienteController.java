package controller.exercicio1;

import java.util.ArrayList;

import model.bo.ClienteBO;
import model.bo.exercicio1.EnderecoBO;
import model.dao.exercicio1.ClienteDAO;
import model.vo.exercicio1.Cliente;

public class ClienteController {
	
	private ClienteBO bo = new ClienteBO();

	private ClienteDAO dao = new ClienteDAO();

	public ArrayList<Cliente> listarTodosOsClientes() {
		return dao.consultarTodos();
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
