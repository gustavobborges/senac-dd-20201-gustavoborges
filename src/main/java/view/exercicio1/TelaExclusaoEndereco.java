package view.exercicio1;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.exercicio1.EnderecoController;
import net.miginfocom.swing.MigLayout;

public class TelaExclusaoEndereco {

	private JFrame frmExclusaoEnderecos;
	private JTextField txtIdEndereco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaExclusaoEndereco window = new TelaExclusaoEndereco();
					window.frmExclusaoEnderecos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaExclusaoEndereco() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmExclusaoEnderecos = new JFrame();
		frmExclusaoEnderecos.setTitle("Exclusão de endereços");
		frmExclusaoEnderecos.setBounds(100, 100, 298, 193);
		frmExclusaoEnderecos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmExclusaoEnderecos.getContentPane().setLayout(new MigLayout("", "[80px][10px][180.00px]", "[56.00px][86.00px]"));

		JLabel lblIdEndereco = new JLabel("Informe o id:");
		lblIdEndereco.setFont(new Font("Tahoma", Font.BOLD, 12));
		frmExclusaoEnderecos.getContentPane().add(lblIdEndereco, "cell 0 0,alignx left,aligny center");

		txtIdEndereco = new JTextField();
		frmExclusaoEnderecos.getContentPane().add(txtIdEndereco, "cell 2 0,grow");
		txtIdEndereco.setColumns(10);

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EnderecoController controladora = new EnderecoController();

				String mensagem = controladora.excluir(txtIdEndereco.getText());
				JOptionPane.showMessageDialog(null, mensagem);
			}
		});
		frmExclusaoEnderecos.getContentPane().add(btnExcluir, "cell 0 1 3 1,grow");
	}
}
