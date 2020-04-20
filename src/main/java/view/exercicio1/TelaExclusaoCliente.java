package view.exercicio1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import controller.exercicio1.ClienteController;
import model.dao.exercicio1.ClienteDAO;
import model.entity.Cliente;

import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class TelaExclusaoCliente extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaExclusaoCliente frame = new TelaExclusaoCliente();
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
	public TelaExclusaoCliente() {
		setTitle("Editar Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(25dlu;default)"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("max(33dlu;default)"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("max(75dlu;default)"),}));
		
		
		
		// Criar a lista de estados --> Iniciar em outro método
				// o idela é ter uma tabela com os estados, e consultar a lista no backend xD

		ArrayList<String> listaClientes = consultarTodos();
		cbClientes = new JComboBox(cbClientes.toArray());
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("Cliente");
		contentPane.add(comboBox, "15, 2, 2, 5, fill, default");
		
		JLabel lblNewLabel = new JLabel("Selecione o Cliente:");
		contentPane.add(lblNewLabel, "2, 2, 13, 5, left, default");
		
		JButton btnNewButton_1 = new JButton("Alterar");
		contentPane.add(btnNewButton_1, "2, 10, 13, 1, fill, fill");
		
		JButton btnNewButton = new JButton("Excluir!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClienteController controladora = new ClienteController();
				
				String mensagem = controladora.excluir((Cliente)cbClientes.getSelectedItem());
				JOptionPane.showMessageDialog(null, mensagem);
			}
		});
		contentPane.add(btnNewButton, "16, 10, default, fill");
	}

	private ArrayList<String> consultarTodos() {
		ClienteDAO clienteDAO = new ClienteDAO();
		ArrayList[] consultarTodos = consultarTodos.consultarTodos();
		return null;
	}

}
