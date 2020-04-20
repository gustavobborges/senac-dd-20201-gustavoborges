package view.exercicio1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.exercicio1.ClienteController;
import model.vo.exercicio1.Cliente;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtSobrenome;
	private JLabel label;
	private JTextField txtCpf;
	private JButton btnSalvar;
	private JLabel lblEndereo;
	private JComboBox cbCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroCliente frame = new TelaCadastroCliente();
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
	public TelaCadastroCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[61.00][186.00,grow][12.00][72.00][grow]", "[][][22.00][][][][][]"));
		
		JLabel lblNome = new JLabel("Nome:");
		contentPane.add(lblNome, "cell 0 0,alignx left");
		
		txtNome = new JTextField();
		contentPane.add(txtNome, "cell 1 0,growx");
		txtNome.setColumns(10);
		
		JLabel lblSobrenome = new JLabel("Sobrenome:");
		contentPane.add(lblSobrenome, "cell 0 1,alignx left");
		
		txtSobrenome = new JTextField();
		contentPane.add(txtSobrenome, "cell 1 1,growx");
		txtSobrenome.setColumns(10);
		
		label = new JLabel("CPF:");
		contentPane.add(label, "cell 0 2,alignx left");
		
		txtCpf = new JTextField();
		contentPane.add(txtCpf, "cell 1 2,growx,aligny top");
		txtCpf.setColumns(10);
		
		lblEndereo = new JLabel("Endere\u00E7o:");
		contentPane.add(lblEndereo, "cell 0 4,alignx trailing");
		
		cbCliente = new JComboBox();
		contentPane.add(cbCliente, "cell 1 4,growx");
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClienteController controller = new ClienteController();
				String mensagem = controller.salvar(txtNome.getText(), txtSobrenome.getText(), txtCpf.getText(), (Cliente) cbCliente.getSelectedItem()); 
				
				JOptionPane.showMessageDialog(null, mensagem);
				
			}
		});
		contentPane.add(btnSalvar, "cell 1 7");
	}

}
