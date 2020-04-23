package view.aula10;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class TelaCadastroAlteracaoTelefone extends JInternalFrame {
	private JTextField txtCodigo;
	private JTextField txtDDD;
	private JTextField textNumero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroAlteracaoTelefone frame = new TelaCadastroAlteracaoTelefone();
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
	public TelaCadastroAlteracaoTelefone() {
		setTitle("Cadastro de Telefone");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(77dlu;default):grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(109dlu;default)"),
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JLabel lblCdigoNacional = new JLabel("C\u00F3digo Nacional");
		getContentPane().add(lblCdigoNacional, "2, 4, right, default");
		
		txtCodigo = new JTextField();
		getContentPane().add(txtCodigo, "6, 4, 5, 1, fill, default");
		txtCodigo.setColumns(10);
		
		JLabel lblDdd = new JLabel("DDD");
		getContentPane().add(lblDdd, "2, 6, right, default");
		
		txtDDD = new JTextField();
		getContentPane().add(txtDDD, "6, 6, 5, 1, fill, default");
		txtDDD.setColumns(10);
		
		JLabel lblNmero = new JLabel("N\u00FAmero");
		getContentPane().add(lblNmero, "2, 8, right, default");
		
		textNumero = new JTextField();
		getContentPane().add(textNumero, "6, 8, 5, 1, fill, default");
		textNumero.setColumns(10);
		
		JLabel lblMvel = new JLabel("M\u00F3vel");
		getContentPane().add(lblMvel, "2, 10, right, default");
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Sim");
		getContentPane().add(chckbxNewCheckBox, "6, 10, 3, 1");
		
		JLabel lblDono = new JLabel("Dono");
		getContentPane().add(lblDono, "2, 12, right, default");
		
		JComboBox comboBox = new JComboBox();
		getContentPane().add(comboBox, "6, 12, 5, 1, fill, default");
		
		JButton btnLimpar = new JButton("Limpar");
		getContentPane().add(btnLimpar, "6, 18, 3, 1");
		
		JButton btnSalvar = new JButton("Salvar");
		getContentPane().add(btnSalvar, "10, 18");

	}

}
