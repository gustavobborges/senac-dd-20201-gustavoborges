package model.bo.exercicio1;

import java.util.ArrayList;

import model.dao.exercicio1.ClienteDAO;
import model.vo.exercicio1.Cliente;

public class ClienteBO {

	private ClienteDAO dao;

	public ArrayList<Cliente> pesquisarTodos() {
		return dao.consultarTodos();
	}

	// TODO criar os m�todos para chamar os m�todos P�BLICOS no ClienteDAO

	public String excluir(Cliente cliente) {

		String mensagem = "";
		ClienteDAO clienteDAO = new ClienteDAO();

		if (cliente == null) {
			mensagem = "Favor, selecione um cliente...";
		} else {
			if (cliente.getTelefones().isEmpty()) {
				if (clienteDAO.excluir(cliente.getId())) {
				} else {
					mensagem = "Eclu�do com sucesso!";
				}
			} else {
				mensagem = "Erro ao excluir..";
			}
		}
		return null;
	}

	ClienteDAO clienteDAO = new ClienteDAO();

	public String salvar(Cliente cliente) {

		String mensagem = "";

		if (cliente.getCpf() != null) {

			if (cliente.getCpf().length() == 11) {
				clienteDAO.salvar(cliente);
				mensagem = "Cliente salvo com sucesso!";
			} else {
				mensagem = "Favor, inserir um CPF de 11 d�gitos..";
			}
		} else {
			mensagem = "Insira o CPF!";
		}

		return mensagem;

	}
}
