package view.exercicio1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JTable;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import controller.exercicio1.TelefoneController;
import model.vo.exercicio1.Telefone;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaListagemTelefones extends JFrame {

	private JPanel contentPane;
	private JTable tblTelefones;
	private ArrayList <Telefone> telefones;
	private String[] nomesColunas = { "Código País", "DDD", "Telefone", "Fixo/Móvel" };
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaListagemTelefones frame = new TelaListagemTelefones();
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
	public TelaListagemTelefones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("424px:grow"),
				ColumnSpec.decode("1px"),},
			new RowSpec[] {
				FormSpecs.LINE_GAP_ROWSPEC,
				RowSpec.decode("23px"),
				RowSpec.decode("228px:grow"),}));
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelefoneController controller = new TelefoneController();
				telefones = controller.listarTodosOsTelefones();
				
				atualizarTabelaTelefones();
				
			}

			private void atualizarTabelaTelefones() {
				limparTabelaClientes();
				DefaultTableModel model = (DefaultTableModel) tblTelefones.getModel();
				
				for (Telefone c : telefones) {
					Object[] novaLinhaDaTabela = new Object[3];
					novaLinhaDaTabela[0] = c.getCodigoPais();
					novaLinhaDaTabela[1] = c.getDdd();
					novaLinhaDaTabela[2] = c.getNumero();
					novaLinhaDaTabela[3] = c.isMovel();
				}
			}

			private void limparTabelaClientes() {
				tblTelefones.setModel(new DefaultTableModel(new Object[] [] { nomesColunas, }, nomesColunas));
				
			}
		});
		contentPane.add(btnBuscar, "2, 2, fill, top");
		
		tblTelefones = new JTable();
		contentPane.add(tblTelefones, "2, 3, fill, fill");
	}

}
