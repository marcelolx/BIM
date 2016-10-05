package br.edu.unoesc.edi.bim.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

import br.edu.unoesc.edi.bim.db.dao.DAOManager;
import br.edu.unoesc.edi.bim.db.model.Users;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

/***
 * @author Jonathan Cestari / Marcelo Lauxen Form da tela de login para usuários
 *         cadastrados.
 */

public class FrmLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private static JPanel contentPane;

	public static FrmLogin frmLogin;

	public static void main(String[] args) {
		frmLogin = new FrmLogin();
		frmLogin.setVisible(true);
	}

	public FrmLogin() {

		lookAndFeel();

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setFocusable(false);
		setResizable(false);
		setTitle("BIM - Body In Movement");
		setIconImage(Toolkit.getDefaultToolkit().getImage(FrmLogin.class.getResource("/images/bim_logo_32x22.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 250);

		contentPane = new JPanel();
		contentPane.setFocusable(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel ConfigPanel = new JPanel();
		ConfigPanel.setBackground(new Color(0, 0, 0, 50));
		ConfigPanel.setBounds(33, 63, 330, 140);
		ConfigPanel.setForeground(SystemColor.textHighlight);
		ConfigPanel.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		ConfigPanel.setFocusable(false);
		ConfigPanel.setLayout(null);
		contentPane.add(ConfigPanel);

		JTextField txtUserField = new JTextField();
		txtUserField.setMargin(new Insets(2, 5, 2, 2));
		txtUserField.setBackground(SystemColor.control);
		txtUserField.setForeground(new Color(0, 0, 51));
		txtUserField.setBounds(123, 11, 200, 32);
		txtUserField.setColumns(10);
		ConfigPanel.add(txtUserField);

		JPasswordField passwordField = new JPasswordField();
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
		btnEntrar.setFocusTraversalPolicyProvider(true);
		btnEntrar.setFocusCycleRoot(true);
		btnEntrar.setFocusable(false);
		btnEntrar.setFocusTraversalKeysEnabled(false);
		btnEntrar.setFont(new Font("BankGothic Md BT", Font.PLAIN, 18));
		btnEntrar.setMnemonic('E');
		btnEntrar.setBounds(123, 96, 200, 34);
		btnEntrar.setBackground(SystemColor.textHighlight);
		btnEntrar.setForeground(Color.WHITE);

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
		ConfigPanel.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{txtUserField, passwordField, btnEntrar, chckbxLembrarme}));

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

		btnEntrar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				String user = txtUserField.getText();
				String pass = new String(passwordField.getPassword()).trim();
				try {
					List<Users> users = DAOManager.usersDAO.queryForAll();
					for (int i = 0; i < users.size(); i++) {
						if ((users.get(i).getUserName().equals(user))
								&& (users.get(i).getUserPass().equals(pass))) {
							new FrmMain(user).setVisible(true);
							frmLogin.dispose();
							break;
						}else{
							JOptionPane.showMessageDialog(null, "Inválid user/password.");
						}
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
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
