package view.aula10;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import java.awt.Font;

public class TelaInternaMenuSobreExterno extends JFrame {

	private JPanel contentPane;
	private JTextField txtGustavoBorges;
	private JTextField txtDesenvolvedorJr;
	private JTextField txtAnliseEDesenvoldimento;
	private JTextField txtFlorianpolissantaCatarina;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInternaMenuSobreExterno s = new TelaInternaMenuSobreExterno();
					s.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaInternaMenuSobreExterno() {
		setTitle("Sobre");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow]", "[][][][][][][][][]"));
		
		txtGustavoBorges = new JTextField();
		txtGustavoBorges.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 26));
		txtGustavoBorges.setText("Gustavo Borges");
		contentPane.add(txtGustavoBorges, "cell 0 0 1 2,alignx center");
		txtGustavoBorges.setColumns(10);
		
		txtDesenvolvedorJr = new JTextField();
		txtDesenvolvedorJr.setText("Desenvolvedor Jr.");
		contentPane.add(txtDesenvolvedorJr, "cell 0 4,growx");
		txtDesenvolvedorJr.setColumns(10);
		
		txtAnliseEDesenvoldimento = new JTextField();
		txtAnliseEDesenvoldimento.setText("An\u00E1lise e Desenvoldimento de Sistemas - SENAC");
		contentPane.add(txtAnliseEDesenvoldimento, "cell 0 5,growx");
		txtAnliseEDesenvoldimento.setColumns(10);
		
		txtFlorianpolissantaCatarina = new JTextField();
		txtFlorianpolissantaCatarina.setText("Florian\u00F3polis,Santa Catarina - BRASIL");
		contentPane.add(txtFlorianpolissantaCatarina, "cell 0 8,growx");
		txtFlorianpolissantaCatarina.setColumns(10);
	}

	
	
	
}
