package view.aula10;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Font;

public class TelaInternaMenuSobre extends JInternalFrame {
	private JTextField txtGustavoBorges;
	private JTextField txtAnliseEDesenvolvimento;
	private JTextField txtFlorianpolisSantaCatarina;
	private JTextField txtIbridgeTenchology;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInternaMenuSobre frame = new TelaInternaMenuSobre();
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
	public TelaInternaMenuSobre() {
		setClosable(true);
		setResizable(true);
		setMaximizable(true);
		setTitle("Sobre");	
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(0dlu;default)"),},
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
		
		txtGustavoBorges = new JTextField();
		txtGustavoBorges.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		txtGustavoBorges.setBackground(SystemColor.control);
		txtGustavoBorges.setText("Gustavo Borges");
		getContentPane().add(txtGustavoBorges, "4, 4, center, default");
		txtGustavoBorges.setColumns(10);
		
		txtIbridgeTenchology = new JTextField();
		txtIbridgeTenchology.setBackground(SystemColor.control);
		txtIbridgeTenchology.setText("Desenvolvedor Jr.");
		getContentPane().add(txtIbridgeTenchology, "4, 6, fill, center");
		txtIbridgeTenchology.setColumns(10);
		
		txtAnliseEDesenvolvimento = new JTextField();
		txtAnliseEDesenvolvimento.setBackground(SystemColor.control);
		txtAnliseEDesenvolvimento.setText("An\u00E1lise e Desenvolvimento de Sistemas");
		getContentPane().add(txtAnliseEDesenvolvimento, "4, 8, fill, default");
		txtAnliseEDesenvolvimento.setColumns(10);
		
		txtFlorianpolisSantaCatarina = new JTextField();
		txtFlorianpolisSantaCatarina.setBackground(SystemColor.control);
		txtFlorianpolisSantaCatarina.setText("Florian\u00F3polis, Santa Catarina - BRASIL");
		getContentPane().add(txtFlorianpolisSantaCatarina, "4, 18");
		txtFlorianpolisSantaCatarina.setColumns(10);

	}

}
