package view.exercicio1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 206);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRua = new JLabel("Rua:");
		lblRua.setBounds(10, 15, 60, 14);
		contentPane.add(lblRua);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setBounds(267, 45, 60, 14);
		contentPane.add(lblCep);
		
		JLabel lblNewLabel = new JLabel("Estado:");
		lblNewLabel.setBounds(267, 75, 60, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(10, 75, 60, 14);
		contentPane.add(lblCidade);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(10, 45, 60, 14);
		contentPane.add(lblBairro);
		
		JLabel lblNmero = new JLabel("N\u00FAmero:");
		lblNmero.setBounds(267, 15, 60, 14);
		contentPane.add(lblNmero);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(139, 133, 89, 23);
		contentPane.add(btnSalvar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limparCampos();
			}
			
		
		});
		btnLimpar.setBounds(238, 133, 89, 23);
		contentPane.add(btnLimpar);
		
		txtRua = new JTextField();
		txtRua.setBounds(55, 15, 192, 20);
		contentPane.add(txtRua);
		txtRua.setColumns(10);
		
		txtBairro = new JTextField();
		txtBairro.setBounds(55, 45, 192, 20);
		contentPane.add(txtBairro);
		txtBairro.setColumns(10);
		
		txtCidade = new JTextField();
		txtCidade.setBounds(55, 75, 192, 20);
		contentPane.add(txtCidade);
		txtCidade.setColumns(10);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(320, 15, 89, 20);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);
		
		//O campo ainda está sem máscara
		
		try {
			MaskFormatter mascaraCep = new MaskFormatter("####-###");
			
			txtCep = new JFormattedTextField(mascaraCep);
			txtCep.setBounds(320, 45, 89, 20);
			contentPane.add(txtCep);
			
			
		} catch (ParseException e) {
			//por enquanto não vamos tratar
			e.printStackTrace();
		}
		
		//Criar a lista de estados --> Iniciar em outro método
		//o idela é ter uma tabela com os estados, e consultar a lista no backend xD
		
		ArrayList<String> siglasEstados = consultarEstados();
		cbSiglaEstado = new JComboBox(siglasEstados.toArray());
		cbSiglaEstado.setBounds(320, 75, 89, 22);
		contentPane.add(cbSiglaEstado);
		
	}

	protected void limparCampos() {
		// Campos de texto: "setar" o texto para ""
		this.txtRua.setText("");
		this.txtBairro.setText("");
		this.txtCidade.setText("");
		this.txtNumero.setText("");
		this.txtCep.setText("");
		
		// Campos com combobox: "setar" o índice selecionado para -1 (sem item selecionado no comboBox)
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
