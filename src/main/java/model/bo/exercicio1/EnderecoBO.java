package model.bo.exercicio1;

import model.dao.exercicio1.ClienteDAO;
import model.dao.exercicio1.EnderecoDAO;
import model.vo.exercicio1.Endereco;

public class EnderecoBO {

	private EnderecoDAO dao = new EnderecoDAO();

	public String excluir(int idSelecionado) {
		String mensagem = "";

		ClienteDAO clienteDAO = new ClienteDAO();
		
		if (clienteDAO.temClienteMorandoNoEndereco(idSelecionado)) {
			mensagem = "Endere�o informado n�o pode ser exclu�do, pois existe cliente morando nele.";
		} else {
			if (dao.excluir(idSelecionado)) {
				mensagem = "Exclu�do com sucesso";
			} else {
				mensagem = "Erro ao excluir";
			}
			mensagem = "Erro ao excluir";
		}

		return mensagem;
	}

	public String salvar(Endereco novoEndereco) {
		String mensagem = "";

		novoEndereco = dao.salvar(novoEndereco);

		if (novoEndereco.getId() > 0) {
			mensagem = "Salvo com sucesso";
		} else {
			mensagem = "Erro ao salvar";
		}

		return mensagem;
	}

	// TODO criar os m�todos para chamar os m�todos P�BLICOS no EnderecoDAO

	// esse eu que criei \/
	public String alterar(Endereco endereco) {
		String mensagem = "";

		boolean alterar = dao.alterar(endereco);

		if (dao.alterar(endereco)) {
			if (alterar = true) {
				mensagem = "Endereco alterado com sucesso!";
			} else {
				mensagem = "Erro ao alterar";
			}
		}
		
		
		return mensagem;

	}
}
