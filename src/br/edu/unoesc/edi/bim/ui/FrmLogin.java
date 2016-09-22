package br.edu.unoesc.edi.bim.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Rectangle;
import java.awt.Insets;

/***
 * @author Jonathan Cestari / Marcelo Lauxen Form da tela de login para usuários
 *         cadastrados.
 */

public class FrmLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private static JPanel contentPane;

	public static FrmLogin frmLogin;
	private JTextField textField;
	private JPasswordField passwordField;

	public static void main(String[] args) {
		FrmLogin frmLogin = new FrmLogin();
		frmLogin.setVisible(true);
	}

	public FrmLogin() {
		
		lookAndFeel();
		
		setFocusable(false);
		setResizable(false);
		setTitle("BIM - Body In Movement");
		setIconImage(Toolkit.getDefaultToolkit().getImage(FrmLogin.class.getResource("/images/logo.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 250);

		contentPane = new JPanel();
		contentPane.setFocusable(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel ConfigPanel = new JPanel();
		ConfigPanel.setBackground(new Color(0,0,0,50));
		ConfigPanel.setBounds(33, 63, 330, 140);
		ConfigPanel.setForeground(SystemColor.textHighlight);
		ConfigPanel.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		ConfigPanel.setFocusable(false);
		ConfigPanel.setLayout(null);
		contentPane.add(ConfigPanel);

		textField = new JTextField();
		textField.setMargin(new Insets(2, 5, 2, 2));
		textField.setBackground(SystemColor.control);
		textField.setForeground(new Color(0, 0, 51));
		textField.setBounds(123, 11, 200, 32);
		textField.setColumns(10);
		ConfigPanel.add(textField);

		passwordField = new JPasswordField();
		passwordField.setMargin(new Insets(2, 5, 2, 2));
		passwordField.setForeground(new Color(0, 0, 51));
		passwordField.setBackground(SystemColor.control);
		passwordField.setBounds(123, 54, 200, 31);
		ConfigPanel.add(passwordField);

		JLabel lblLogin = new JLabel("USU\u00C1RIO");
		lblLogin.setForeground(Color.WHITE);
		lblLogin.setFont(new Font("BankGothic Md BT", Font.PLAIN, 18));
		lblLogin.setBounds(10, 12, 99, 29);
		ConfigPanel.add(lblLogin);

		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.setBorderPainted(false);
		btnEntrar.setFocusTraversalPolicyProvider(true);
		btnEntrar.setFocusCycleRoot(true);
		btnEntrar.setFocusable(false);
		btnEntrar.setFocusTraversalKeysEnabled(false);
		btnEntrar.setFont(new Font("BankGothic Md BT", Font.PLAIN, 18));
		btnEntrar.setMnemonic('E');
		btnEntrar.setBounds(123, 96, 200, 34);
		btnEntrar.setBackground(SystemColor.textHighlight);
		btnEntrar.setForeground(SystemColor.text);
		
		ConfigPanel.add(btnEntrar);

		JLabel lblSenha = new JLabel("SENHA");
		lblSenha.setForeground(Color.WHITE);
		lblSenha.setFont(new Font("BankGothic Md BT", Font.PLAIN, 18));
		lblSenha.setBounds(10, 54, 99, 28);
		ConfigPanel.add(lblSenha);

		JCheckBox chckbxLembrarme = new JCheckBox("");
		chckbxLembrarme.setBackground(new Color(192, 192, 192));
		chckbxLembrarme.setBounds(10, 98, 21, 33);
		ConfigPanel.add(chckbxLembrarme);
		
		JLabel lblLembrarme = new JLabel("Lembrar-me");
		lblLembrarme.setForeground(Color.WHITE);
		lblLembrarme.setBounds(31, 97, 78, 34);
		ConfigPanel.add(lblLembrarme);

		JLabel lblEntrarNoSistema = new JLabel("ENTRAR NO SISTEMA");
		lblEntrarNoSistema.setFont(new Font("BankGothic Lt BT", Font.PLAIN, 22));
		lblEntrarNoSistema.setHorizontalTextPosition(SwingConstants.CENTER);
		lblEntrarNoSistema.setHorizontalAlignment(SwingConstants.CENTER);
		lblEntrarNoSistema.setBounds(36, 23, 327, 29);
		contentPane.add(lblEntrarNoSistema);

		JLabel lblEntrarSistema = new JLabel("");
		lblEntrarSistema.setIcon(new ImageIcon(FrmLogin.class.getResource("/images/16981.jpg")));
		lblEntrarSistema.setBounds(0, 0, 394, 221);
		contentPane.add(lblEntrarSistema);
	}

	public void lookAndFeel() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
