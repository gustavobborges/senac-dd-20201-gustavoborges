package view.exercicio1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controller.exercicio1.ClienteController;
import model.vo.exercicio1.Cliente;
import net.miginfocom.swing.MigLayout;

public class TelaListagemClientes {

	private JFrame frmListagemDeClientes;
	private JTable tblClientes;
	private ArrayList<Cliente> clientes;
	private String[] nomesColunas = { "Nome completo", "CPF", "Qtde. Telefones" };

	private void limparTabelaClientes() {
		tblClientes.setModel(new DefaultTableModel(new Object[][] { nomesColunas, }, nomesColunas));
	}

	private void atualizarTabelaClientes() {
		limparTabelaClientes();
		DefaultTableModel model = (DefaultTableModel) tblClientes.getModel();

		for (Cliente c : clientes) {

			Object[] novaLinhaDaTabela = new Object[3];
			novaLinhaDaTabela[0] = c.getNomeCompleto();
			novaLinhaDaTabela[1] = c.getCpf();
			novaLinhaDaTabela[2] = c.getTelefones().size();

			model.addRow(novaLinhaDaTabela);
		}

	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaListagemClientes window = new TelaListagemClientes();
					window.frmListagemDeClientes.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaListagemClientes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmListagemDeClientes = new JFrame();
		frmListagemDeClientes.setTitle("Listagem de Clientes");
		frmListagemDeClientes.setBounds(100, 100, 700, 520);
		frmListagemDeClientes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClienteController controller = new ClienteController();
				clientes = controller.listarTodosOsClientes();

				atualizarTabelaClientes();
			}
		});
		frmListagemDeClientes.getContentPane().setLayout(new MigLayout("", "[670.00px]", "[48.00px][429.00px]"));
		frmListagemDeClientes.getContentPane().add(btnBuscar, "cell 0 0,grow");

		tblClientes = new JTable();
		frmListagemDeClientes.getContentPane().add(tblClientes, "cell 0 1,grow");
	}

}