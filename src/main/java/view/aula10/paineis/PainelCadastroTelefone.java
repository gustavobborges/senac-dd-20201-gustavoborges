package view.aula10.paineis;

import javax.swing.JPanel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import controller.exercicio1.ClienteController;
import controller.exercicio1.EnderecoController;
import controller.exercicio1.TelefoneController;
import model.vo.exercicio1.Cliente;
import model.vo.exercicio1.Telefone;
import view.aula10.TelaInternaCadastroCliente;

import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

import java.util.ArrayList;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

public class PainelCadastroTelefone extends JPanel {
	private JTextField txtCodigo;
	private JTextField txtDDD;
	private JTextField txtNumero;
	private JComboBox cbClientes;
	JCheckBox chkMovel;
	private JButton btnLimpar;
	private JButton btnSalvar;
	private ArrayList<Cliente> clientes;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PainelCadastroTelefone s = new PainelCadastroTelefone();
					s.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PainelCadastroTelefone() {
		
		setLayout(new FormLayout(
				new ColumnSpec[] { FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
						FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("max(57dlu;default)"),
						FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("left:max(88dlu;default):grow"),
						FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("left:max(88dlu;default):grow"),
						FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("max(0dlu;default)"), },
				new RowSpec[] { FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, }));

		JLabel lblCdigoPas = new JLabel("C\u00F3digo Pa\u00EDs:");
		add(lblCdigoPas, "4, 4, left, default");

		txtCodigo = new JTextField();
		add(txtCodigo, "6, 4, fill, default");
		txtCodigo.setColumns(10);

		JLabel lblDdd = new JLabel("DDD");
		add(lblDdd, "4, 6, left, default");

		txtDDD = new JTextField();
		add(txtDDD, "6, 6, fill, default");
		txtDDD.setColumns(10);

		JLabel lblNmero = new JLabel("N\u00FAmero");
		add(lblNmero, "4, 8, left, default");

		txtNumero = new JTextField();
		add(txtNumero, "6, 8, 3, 1, fill, default");
		txtNumero.setColumns(10);

		JLabel lblMvel = new JLabel("Tipo");
		add(lblMvel, "4, 10, left, default");

		chkMovel = new JCheckBox("M\u00F3vel");
		add(chkMovel, "6, 10");

		JLabel lblDonoopcional = new JLabel("Dono (opcional)");
		add(lblDonoopcional, "4, 14, left, default");

		ClienteController controladorClientes = new ClienteController();
		ArrayList<Cliente> clientes = controladorClientes.listarTodosOsClientes();
		cbClientes = new JComboBox(clientes.toArray());
		cbClientes.setSelectedIndex(-1);
		add(cbClientes, "6, 14, 3, 1, fill, default");

		JButton btnVoltar = new JButton("Voltar");
		add(btnVoltar, "4, 18");

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limparCampos();
			}

		});
		add(btnLimpar, "6, 18, fill, default");

		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelefoneController controladorTelefone = new TelefoneController();
				Telefone novoTelefone = new Telefone();
				novoTelefone.setCodigoPais(txtCodigo.getText());
				novoTelefone.setDdd(txtDDD.getText());
				novoTelefone.setNumero(txtNumero.getText());
				novoTelefone.setMovel(chkMovel.isSelected());

				if (cbClientes.getSelectedItem() != null) {
					novoTelefone.setDono((Cliente) cbClientes.getSelectedItem());
				}

				String mensagem = controladorTelefone.salvar(novoTelefone);
				JOptionPane.showMessageDialog(null, mensagem);
			}
		});

		add(btnSalvar, "8, 18, fill, default");

	}

	protected void limparCampos() {
		this.txtCodigo.setText("");
		this.txtDDD.setText("");
		this.txtNumero.setText("");
		this.cbClientes.setSelectedItem(-1);
		this.chkMovel.setAction(null);

	}

}
