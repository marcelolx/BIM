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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class FrmMain extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnAlunoPanel;
	private JButton btnRelatorio;
	private JButton btnProcedures;
	private JButton btnMetodologias;
	private JLabel lblTeste ;
	private JPanel panelLeftSideStudents;//panel for list students groups
	private JPanel leftSidePanel;//side Panel to group groups of students
	private JPanel panelLeftSideReports;
	private JPanel panelLeftSideProcedures;

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
		
		//
		// All side Panels below // 
		//
		leftSidePanel = new JPanel();
		leftSidePanel.setBorder(null);
		leftSidePanel.setBounds(0, 48, 230, 651);
		leftSidePanel.setBackground(Color.white);
		contentPane.add(leftSidePanel);
		leftSidePanel.setLayout(null);
		
		//panel para listar alunos, adicionar alunos/grupos de alunos
		panelLeftSideStudents = new JPanel();
		panelLeftSideStudents.setBounds(10, 56, 210, 370);
		panelLeftSideStudents.setBackground(new Color(35,164,240));
		panelLeftSideStudents.setLayout(null);
		panelLeftSideStudents.setVisible(false);
		
		//panel of reports
		panelLeftSideReports = new JPanel();
		panelLeftSideReports.setBounds(10, 111, 210, 370);
		panelLeftSideReports.setBackground(new Color(35,164,240));
		panelLeftSideReports.setLayout(null);
		panelLeftSideReports.setVisible(false);
		
		//panel of procedures
		panelLeftSideProcedures = new JPanel();
		panelLeftSideProcedures.setBounds(10, 166, 210, 370);
		panelLeftSideProcedures.setBackground(new Color(35,164,240));
		panelLeftSideProcedures.setLayout(null);
		panelLeftSideProcedures.setVisible(false);
		
		
		btnAlunoPanel = new JButton("Alunos");
		btnAlunoPanel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!panelLeftSideStudents.isVisible()){
					if(panelLeftSideReports.isVisible()){
						setVisibilityReportsPanelFalse();
					}
					btnRelatorio.setBounds(10, 431, 210, 44);
					btnProcedures.setBounds(10, 486, 210, 44);
					btnMetodologias.setBounds(10, 541, 210, 44);
					lblTeste.setBounds(10, 595, 210, 44);
					panelLeftSideStudents.setVisible(true);
					leftSidePanel.add(panelLeftSideStudents);
				}else{
					setVisibilityStudentsPanelFalse();
				}
				
				
			}
		});
		btnAlunoPanel.setForeground(Color.BLACK);
		btnAlunoPanel.setBackground(new Color(52,152,219));
		btnAlunoPanel.setBounds(10, 11, 210, 44);
		leftSidePanel.add(btnAlunoPanel);
		
		btnRelatorio = new JButton("Relat\u00F3rios");
		btnRelatorio.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!panelLeftSideReports.isVisible()){
					if((panelLeftSideStudents.isVisible()) || (panelLeftSideProcedures.isVisible())){
						setVisibilityProceduresPanelFalse();
						setVisibilityStudentsPanelFalse();
					}
					btnProcedures.setBounds(10, 486, 210, 44);
					btnMetodologias.setBounds(10, 541, 210, 44);
					lblTeste.setBounds(10, 595, 210, 44);
					panelLeftSideReports.setVisible(true);
					leftSidePanel.add(panelLeftSideReports);
				}else{
					setVisibilityReportsPanelFalse();
				}
				
			}
		});
		btnRelatorio.setForeground(Color.BLACK);
		btnRelatorio.setBackground(new Color(52,152,219));
		btnRelatorio.setBounds(10, 66, 210, 44);
		leftSidePanel.add(btnRelatorio);
		
		btnProcedures = new JButton("Procedimentos");
		btnProcedures.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(!panelLeftSideProcedures.isVisible()){
					if((panelLeftSideReports.isVisible()) || 
							(panelLeftSideStudents.isVisible())){
						setVisibilityReportsPanelFalse();
						setVisibilityStudentsPanelFalse();
					}
					btnMetodologias.setBounds(10, 541, 210, 44);
					lblTeste.setBounds(10, 595, 210, 44);
					panelLeftSideProcedures.setVisible(true);
					leftSidePanel.add(panelLeftSideProcedures);
				}else{
					setVisibilityProceduresPanelFalse();
				}
				
			}
		});
		btnProcedures.setOpaque(false);
		btnProcedures.setForeground(Color.BLACK);
		btnProcedures.setBackground(new Color(52,152,219));
		btnProcedures.setBounds(10, 121, 210, 44);
		leftSidePanel.add(btnProcedures);
		
		btnMetodologias = new JButton("M\u00E9todologias");
		btnMetodologias.setOpaque(false);
		btnMetodologias.setForeground(Color.BLACK);
		btnMetodologias.setBackground(new Color(52,152,219));
		btnMetodologias.setBounds(10, 176, 210, 44);
		leftSidePanel.add(btnMetodologias);
		
		lblTeste= new JLabel("Teste\r\n");
		lblTeste.setForeground(Color.WHITE);
		lblTeste.setOpaque(true);
		lblTeste.setBackground(new Color(35,164,240));
		lblTeste.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeste.setLabelFor(leftSidePanel);
		lblTeste.setBounds(10, 225, 210, 44);
		leftSidePanel.add(lblTeste);
		
	}
	
	private void setVisibilityStudentsPanelFalse(){
		btnRelatorio.setBounds(10, 66, 210, 44);
		btnProcedures.setBounds(10, 121, 210, 44);
		btnMetodologias.setBounds(10, 176, 210, 44);
		lblTeste.setBounds(10, 225, 210, 44);
		panelLeftSideStudents.setVisible(false);
		leftSidePanel.remove(panelLeftSideStudents);
		leftSidePanel.repaint();
		leftSidePanel.revalidate();
	}
	
	private void setVisibilityReportsPanelFalse(){
		btnProcedures.setBounds(10, 121, 210, 44);
		btnMetodologias.setBounds(10, 176, 210, 44);
		lblTeste.setBounds(10, 225, 210, 44);
		panelLeftSideReports.setVisible(false);
		leftSidePanel.remove(panelLeftSideReports);
		leftSidePanel.repaint();
		leftSidePanel.revalidate();
	}
	
	private void setVisibilityProceduresPanelFalse(){
		btnMetodologias.setBounds(10, 176, 210, 44);
		lblTeste.setBounds(10, 225, 210, 44);
		panelLeftSideProcedures.setVisible(false);
		leftSidePanel.remove(panelLeftSideProcedures);
		leftSidePanel.repaint();
		leftSidePanel.revalidate();
	}
}
