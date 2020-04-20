package controller.exercicio1;

import java.util.ArrayList;

import model.bo.exercicio1.TelefoneBO;
import model.dao.exercicio1.TelefoneDAO;
import model.vo.exercicio1.Telefone;

public class TelefoneController {

	private TelefoneBO bo = new TelefoneBO();
	private TelefoneDAO dao = new TelefoneDAO();
	

	public String salvar(Telefone novoTelefone) {
		String mensagemValidacao = validarCampos(novoTelefone);

		if (mensagemValidacao.isEmpty()) {
			mensagemValidacao = bo.salvar(novoTelefone);

		}

		return mensagemValidacao;
	}

	private String validarCampos(Telefone novoTelefone) {
		String mensagem = "";

		if (novoTelefone == null) {
			mensagem = "Telefone não foi criado";
		} else {
			if (novoTelefone.getDdd().trim().length() != 2) {
				mensagem += "Informe o DDD com 2 dígitos: \n";
			}

			try {
				Integer.parseInt(novoTelefone.getDdd());
			} catch (NumberFormatException ex) {
				mensagem += "O DDD deve ser um número";

			}

		}

		return mensagem;
	}

	private String validarCampoNumerico(String valorDoCampo, String nomeDoCampo, int tamanhoMinimo, int tamanhoMaximo) {
		// TODO desenvolver

		return "";
	}

	
	public ArrayList<Telefone> listarTodosOsTelefones() {
		return dao.consultarTodos();
	}

}
