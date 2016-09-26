package br.edu.unoesc.edi.bim.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.util.Locale;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.edu.unoesc.edi.bim.db.dao.DAOManager;

public class FrmMain extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public FrmMain(String userName) {
		//pega o tamanho máximo disponível para tela do programa
		Rectangle maxBounds = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
		setResizable(false);
		setForeground(Color.WHITE);
		setFont(new Font("Base 02", Font.PLAIN, 12));
		setTitle("BIM - Body In Moviment");
		setIconImage(Toolkit.getDefaultToolkit().getImage(FrmMain.class.getResource("/images/bim_logo_32x22.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, maxBounds.width, maxBounds.height);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelNorth = new JPanel();
		panelNorth.setLocale(new Locale("pt", "BR"));
		panelNorth.setBackground(Color.WHITE);
		panelNorth.setBounds(0, 0, 1362, 46);
		contentPane.add(panelNorth);
		panelNorth.setLayout(null);
		
		JLabel lblUsernamehere = new JLabel(userName);
		lblUsernamehere.setBounds(915, 15, 72, 14);
		panelNorth.add(lblUsernamehere);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(1257, 5, 105, 35);
		btnSair.setContentAreaFilled(false);
		btnSair.setIcon(new ImageIcon(FrmMain.class.getResource("/images/Cancel Filled-50.png")));
		panelNorth.add(btnSair);
		
		JButton btnAjuda = new JButton("Ajuda");
		btnAjuda.setContentAreaFilled(false);
		btnAjuda.setIcon(new ImageIcon(FrmMain.class.getResource("/images/Help Filled-50.png")));
		btnAjuda.setBounds(1150, 5, 115, 35);
		panelNorth.add(btnAjuda);
		
		JButton btnsincronizar = new JButton("Sincronizar");
		btnsincronizar.setContentAreaFilled(false);
		btnsincronizar.setIcon(new ImageIcon(FrmMain.class.getResource("/images/Synchronize-48.png")));
		btnsincronizar.setBounds(1039, 5, 121, 35);
		panelNorth.add(btnsincronizar);
		
		JLabel lblUserIcon = new JLabel("");
		lblUserIcon.setIcon(new ImageIcon(FrmMain.class.getResource("/images/userLog.png")));
		lblUserIcon.setBounds(997, 5, 46, 35);
		panelNorth.add(lblUserIcon);
		
		JLabel lbllogomain = new JLabel("");
		lbllogomain.setIcon(new ImageIcon(FrmMain.class.getResource("/images/bim_logo_64x44.png")));
		lbllogomain.setBounds(10, 5, 72, 41);
		panelNorth.add(lbllogomain);
	}
}
