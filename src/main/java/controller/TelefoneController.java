package controller;

import model.bo.TelefoneBO;
import model.vo.exercicio1.Telefone;

public class TelefoneController {

	private TelefoneBO bo = new TelefoneBO();

	public String salvar(Telefone novoTelefone) {
		return bo.salvar(novoTelefone);
	}

}