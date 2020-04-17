package view.exercicio1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import controller.exercicio1.EnderecoController;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

public class TelaCadastroEndereco extends JFrame {

	private JPanel contentPane;
	private JTextField txtRua;
	private JTextField txtBairro;
	private JTextField txtCidade;
	private JTextField txtNumero;
	private JFormattedTextField txtCep;
	private JComboBox cbSiglaEstado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroEndereco frame = new TelaCadastroEndereco();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaCadastroEndereco() {
		setTitle("Cadastro de Endereco");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 710, 378);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		//Força a tela maximizada
		//this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.UNRELATED_GAP_COLSPEC,
				ColumnSpec.decode("52px"),
				ColumnSpec.decode("146px:grow"),
				ColumnSpec.decode("max(0dlu;default)"),
				ColumnSpec.decode("49px"),
				ColumnSpec.decode("113px:grow"),},
			new RowSpec[] {
				FormSpecs.PARAGRAPH_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.UNRELATED_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.UNRELATED_GAP_ROWSPEC,
				RowSpec.decode("22px"),
				RowSpec.decode("31px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				RowSpec.decode("23px"),}));

		JLabel lblRua = new JLabel("Rua *:");
		contentPane.add(lblRua, "2, 2, left, top");

		JLabel lblCep = new JLabel("CEP:");
		contentPane.add(lblCep, "5, 4, left, top");

		JLabel lblNewLabel = new JLabel("Estado:");
		contentPane.add(lblNewLabel, "5, 6, left, top");

		JLabel lblCidade = new JLabel("Cidade:");
		contentPane.add(lblCidade, "2, 6, left, top");

		JLabel lblBairro = new JLabel("Bairro:");
		contentPane.add(lblBairro, "2, 4, left, top");

		JLabel lblNmero = new JLabel("N\u00FAmero:");
		contentPane.add(lblNmero, "5, 2, left, top");

		txtRua = new JTextField();
		contentPane.add(txtRua, "3, 2, default, top");
		txtRua.setColumns(10);

		txtBairro = new JTextField();
		contentPane.add(txtBairro, "3, 4, fill, top");
		txtBairro.setColumns(10);

		txtCidade = new JTextField();
		contentPane.add(txtCidade, "3, 6, fill, top");
		txtCidade.setColumns(10);

		txtNumero = new JTextField();
		contentPane.add(txtNumero, "6, 2, fill, top");
		txtNumero.setColumns(10);

		// O campo ainda está sem máscara

		try {
			MaskFormatter mascaraCep = new MaskFormatter("#####-###"); // Para fazer máscara para delimitar o número de
																		// campos
			txtCep = new JFormattedTextField(mascaraCep);
			contentPane.add(txtCep, "6, 4, fill, top");

		} catch (ParseException e) {
			// por enquanto não vamos tratar
			e.printStackTrace();
		}

		// Criar a lista de estados --> Iniciar em outro método
		// o idela é ter uma tabela com os estados, e consultar a lista no backend xD

		ArrayList<String> siglasEstados = consultarEstados();
		cbSiglaEstado = new JComboBox(siglasEstados.toArray());
		contentPane.add(cbSiglaEstado, "6, 6, fill, top");
		
				JButton btnLimpar = new JButton("Limpar");
				btnLimpar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						limparCampos();
					}

				});
				
						JButton btnSalvar = new JButton("Salvar");
						btnSalvar.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								EnderecoController controller = new EnderecoController();
								controller.salvar(txtRua.getText(), txtBairro.getText(), txtNumero.getText(), txtCep.getText(), txtCidade.getText(), (String) cbSiglaEstado.getSelectedItem());
							}
						});
						contentPane.add(btnSalvar, "2, 9, 2, 1, fill, fill");
				contentPane.add(btnLimpar, "5, 9, 2, 1, default, top");
		
		JLabel lblNewLabel_1 = new JLabel("(*) campos obrigat\u00F3rios");
		contentPane.add(lblNewLabel_1, "2, 10, 2, 1, fill, bottom");

	}

	protected void limparCampos() {
		// Campos de texto: "setar" o texto para ""
		this.txtRua.setText("");
		this.txtBairro.setText("");
		this.txtCidade.setText("");
		this.txtNumero.setText("");
		this.txtCep.setText("");

		// Campos com combobox: "setar" o índice selecionado para -1 (sem item
		// selecionado no comboBox)
		this.cbSiglaEstado.setSelectedIndex(-1);

	}

	private ArrayList<String> consultarEstados() {
		ArrayList<String> siglasEstados = new ArrayList<String>();

		siglasEstados.add("AC");
		siglasEstados.add("BA");
		siglasEstados.add("CE");
		siglasEstados.add("DF");
		siglasEstados.add("GO");
		siglasEstados.add("PR");
		siglasEstados.add("SC");
		siglasEstados.add("RS");

		return siglasEstados;

	}
}
