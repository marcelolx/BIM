package br.edu.unoesc.edi.bim.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;

public class Login extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("BIM - Body In Moviment");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/images/logo.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 0, 0, 0));
		
		JLabel logolabel = new JLabel("");
		logolabel.setHorizontalAlignment(SwingConstants.CENTER);
		logolabel.setIcon(new ImageIcon(Login.class.getResource("/images/logo.png")));
		contentPane.add(logolabel);
	}

}
