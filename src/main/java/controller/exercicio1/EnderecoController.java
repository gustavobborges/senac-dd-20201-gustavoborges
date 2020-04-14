package controller.exercicio1;

import model.bo.exercicio1.EnderecoBO;
import model.vo.exercicio1.Endereco;

public class EnderecoController {

	private static final int TAMANHO_MINIMO_CAMPO_RUA = 3;
	private static final int TAMANHO_MAXIMO_CAMPO_RUA = 255;

	private static final int TAMANHO_MINIMO_CAMPO_CIDADE = 3;
	private static final int TAMANHO_MAXIMO_CAMPO_CIDADE = 255;

	private EnderecoBO bo = new EnderecoBO();

	public String excluir(String textoIdSelecionado) {

		String mensagem = "";
		try {
			int idSelecionado = Integer.parseInt(textoIdSelecionado);
			mensagem = bo.excluir(idSelecionado);
		} catch (NumberFormatException ex) {
			mensagem = "Informe um n�mero inteiro: ";
		}
		return mensagem;

	}

	public String salvar(String rua, String bairro, String numero, String cep, String cidade, String estado) {
		String mensagem = "";

		// VALIDA��ES DOS CAMPOS
		mensagem += validarCampoDeTexto("Rua", rua, TAMANHO_MINIMO_CAMPO_RUA, TAMANHO_MAXIMO_CAMPO_RUA, true);
		mensagem += validarCampoDeTexto("Cidade", cidade, TAMANHO_MINIMO_CAMPO_CIDADE, TAMANHO_MAXIMO_CAMPO_CIDADE, true);
		mensagem += validarCampoDeTexto("Sigla do Estado", estado, 2, 2, true);

		if (estado != null && !estado.isEmpty() && estado.length() != 2) {
			mensagem = "Estado deve possuir pelo menos 2 caracteres.";
		}

		if (mensagem.isEmpty()) {
			Endereco novoEndereco = new Endereco(rua, cep, estado, cidade, bairro, numero);
			mensagem = bo.salvar(novoEndereco);
		}
		return mensagem;

	}

	private String validarCampoDeTexto(String nomeDoCampo, String valor, int tamanhoMinimo, int tamanhoMaximo,
			boolean obrigatorio) {
		String mensagemValidacao = "";

		if (obrigatorio) {

			if (valor != null && !valor.isEmpty() || valor.length() < tamanhoMinimo || valor.length() > tamanhoMaximo) {
				mensagemValidacao = "Rua deve possuir pelo menos " + tamanhoMinimo + " e no m�ximo " + tamanhoMaximo
						+ " caracteres. \n";
			}
		}
		return mensagemValidacao;
	}
}
