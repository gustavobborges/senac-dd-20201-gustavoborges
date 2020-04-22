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

public class MenuPrincipal extends JFrame {

	private JPanel contentPane;
	JDesktopPane desktopPane = new JDesktopPane();
	private PainelCadastroTelefone painelCadastroTelefone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
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
	public MenuPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 302);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu menuCliente = new JMenu("Clientes");
		menuCliente
				.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/icones/icons8-gest\u00E3o-de-cliente.png")));
		menuBar.add(menuCliente);

		JMenuItem miCadastroCliente = new JMenuItem("Cadastro");
		miCadastroCliente.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int contNovaTelinha = 0;
				TelaInternaCadastroCliente novaTelinha = new TelaInternaCadastroCliente();

				if (contNovaTelinha == 0) {
					contNovaTelinha++;
				} else {
					novaTelinha.dispose();
				}

				desktopPane.add(novaTelinha);
				novaTelinha.show();
			}
		});
		miCadastroCliente.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F6, 0));
		miCadastroCliente.setIcon(
				new ImageIcon(MenuPrincipal.class.getResource("/icones/icons8-adicionar-usu\u00E1rio-masculino.png")));
		menuCliente.add(miCadastroCliente);

		JMenu mnSobre = new JMenu("Sobre");
		mnSobre.setIcon(new ImageIcon(
				MenuPrincipal.class.getResource("/icones/icons8-cart\u00E3o-de-cr\u00E9dito-sem-contato.png")));
		menuBar.add(mnSobre);

		JMenuItem mntmDesenvolvedor = new JMenuItem("Desenvolvedor");
		mntmDesenvolvedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInternaMenuSobreExterno menuSobre = new TelaInternaMenuSobreExterno();
				desktopPane.add(menuSobre);
				menuSobre.show();
			}
		});
		mntmDesenvolvedor.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0));
		mntmDesenvolvedor.setIcon(
				new ImageIcon(MenuPrincipal.class.getResource("/icones/icons8-\u0441harlie-\u0441haplin.png")));
		mnSobre.add(mntmDesenvolvedor);

		JMenuItem mntmDesenvolvedorWindow = new JMenuItem("Desenvolvedor Window");
		mntmDesenvolvedorWindow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInternaMenuSobreExterno menuSobreExterno = new TelaInternaMenuSobreExterno();
				desktopPane.add(menuSobreExterno);
				menuSobreExterno.show();
			}
		});
		mntmDesenvolvedorWindow.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F8, 0));
		mntmDesenvolvedorWindow
				.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/icones/icons8-treinamento.png")));
		mnSobre.add(mntmDesenvolvedorWindow);

		JMenu mnTelefones = new JMenu("Telefones");
		mnTelefones
				.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/icones/icons8-suporte-on-line-filled.png")));
		menuBar.add(mnTelefones);

		JMenuItem miCadastrarTelefone = new JMenuItem("Cadastro");
		miCadastrarTelefone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO
				// instanciar o painel escolhido
				painelCadastroTelefone = new PainelCadastroTelefone();
				// atualizar o contentPane da tela principal, mostrando o painel escolhido
				// telefones
				setContentPane(painelCadastroTelefone);
				revalidate();
			}
		});
		miCadastrarTelefone.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_7, 0));
		miCadastrarTelefone.setIcon(
				new ImageIcon(MenuPrincipal.class.getResource("/icones/icons8-adicionar-usu\u00E1rio-masculino.png")));
		mnTelefones.add(miCadastrarTelefone);

		JMenuItem miExcluirCliente = new JMenuItem("Excluir");
		miExcluirCliente.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_9, 0));
		miExcluirCliente.setIcon(new ImageIcon(
				MenuPrincipal.class.getResource("/icones/icons8-\u00E0-esquerda-dentro-de-um-c\u00EDrculo.png")));
		mnTelefones.add(miExcluirCliente);

		//TODO usar apenas na opção 2 da aula 10..
		//desktopPane = new JDesktopPane();
		//desktopPane.setBackground(Color.GRAY);
		//desktopPane.setBounds(5, 5, 1000, 800);
		//getContentPane().add(desktopPane);
	}
}
