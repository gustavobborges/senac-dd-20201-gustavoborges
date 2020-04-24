package view.aula10;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import view.aula10.paineis.PainelCadastroTelefone;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import java.awt.Color;

public class MenuPrincipalOpcao1 extends JFrame {

	JDesktopPane desktopPane = new JDesktopPane();
	private TelaInternaCadastroCliente janelinhaCadastroCliente;
	private PainelCadastroTelefone janelinhaCadastroTelefone;

	/**
	 * Opção 1 da aula 10: (painel com JDesktopPane e telas das opções com
	 * JInternalFrame)
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipalOpcao1 frame = new MenuPrincipalOpcao1();
					frame.setExtendedState(MAXIMIZED_BOTH);
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
	public MenuPrincipalOpcao1() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 451, 302);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu menuCliente = new JMenu("Clientes");
		menuCliente.setIcon(
				new ImageIcon(MenuPrincipalOpcao1.class.getResource("/icones/icons8-gest\u00E3o-de-cliente.png")));
		menuBar.add(menuCliente);

		JMenuItem miCadastroCliente = new JMenuItem("Cadastro");
		miCadastroCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Exercício 1 da lista 2
				if (janelinhaCadastroCliente == null || !janelinhaCadastroCliente.isVisible()) {
					janelinhaCadastroCliente = new TelaInternaCadastroCliente();
					desktopPane.add(janelinhaCadastroCliente);
					janelinhaCadastroCliente.setVisible(true);
				}

			}
		});
		miCadastroCliente.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F6, 0));
		miCadastroCliente.setIcon(new ImageIcon(
				MenuPrincipalOpcao1.class.getResource("/icones/icons8-adicionar-usu\u00E1rio-masculino.png")));
		menuCliente.add(miCadastroCliente);

		// TODO: Exercício 2 da lista 2
		JMenu menuSobre = new JMenu("Sobre");
		menuSobre.setIcon(
				new ImageIcon(MenuPrincipalOpcao1.class.getResource("/icones/icons8-\u0441harlie-\u0441haplin.png")));
		menuBar.add(menuSobre);

		JMenuItem miDesenvolvedor = new JMenuItem("Desenvolvedor");
		miDesenvolvedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				TelaInternaMenuSobreExterno menuSobreExterno = new TelaInternaMenuSobreExterno();
				menuSobreExterno.setVisible(true);
			}
		});

		miDesenvolvedor.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F8, 0));
		miDesenvolvedor.setIcon(new ImageIcon(MenuPrincipalOpcao1.class.getResource("/icones/icons8-treinamento.png")));
		menuSobre.add(miDesenvolvedor);

		JMenu menuTelefones = new JMenu("Telefones");
		menuTelefones.setIcon(
				new ImageIcon(MenuPrincipalOpcao1.class.getResource("/icones/icons8-suporte-on-line-filled.png")));
		menuBar.add(menuTelefones);

		JMenuItem miNovo = new JMenuItem("Novo");
		miNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (janelinhaCadastroTelefone == null || !janelinhaCadastroTelefone.isVisible()) {
					janelinhaCadastroTelefone = new PainelCadastroTelefone();
					desktopPane.add(janelinhaCadastroTelefone);
					janelinhaCadastroTelefone.setVisible(true);
				}
			}

		});
		miNovo.setIcon(new ImageIcon(
				MenuPrincipalOpcao1.class.getResource("/icones/icons8-adicionar-usu\u00E1rio-masculino.png")));
		menuTelefones.add(miNovo);

		/*
		 * *
		 * 
		 * 
		 * JMenuItem miCadastroCliente = new JMenuItem("Cadastro");
		 * miCadastroCliente.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent e) { 
		 * if(janelinhaCadastroCliente == null ||
		 * !janelinhaCadastroCliente.isVisible()) { janelinhaCadastroCliente = new
		 * TelaInternaCadastroCliente(); desktopPane.add(janelinhaCadastroCliente);
		 * janelinhaCadastroCliente.show(); }
		 * 
		 * } }); miCadastroCliente.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F6,
		 * 0)); miCadastroCliente.setIcon(new ImageIcon(
		 * MenuPrincipalOpcao1.class.getResource(
		 * "/icones/icons8-adicionar-usu\u00E1rio-masculino.png")));
		 * menuCliente.add(miCadastroCliente);
		 * 
		 */

		desktopPane.setBackground(Color.GRAY);
		desktopPane.setBounds(5, 5, 1000, 800);
		getContentPane().add(desktopPane);

	}
}
