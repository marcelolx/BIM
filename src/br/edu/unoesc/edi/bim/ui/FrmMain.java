package br.edu.unoesc.edi.bim.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Locale;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import br.edu.unoesc.edi.bim.components.CloseableTabbedPane;
/**
 * 
 * @author Marcelo/Jonathan
 *
 */
public class FrmMain extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel btnStudents;
	private JLabel btnReports;
	private JLabel btnProcedures;
	private JLabel btnMethodologies;
	private JPanel panelLeftSideStudents;// panel for list students groups
	private JPanel leftSidePanel;// side Panel to group groups of students
	private JPanel panelLeftSideReports;
	private JPanel panelLeftSideProcedures;
	private JPanel panelLeftSideMethodologies;
	public static FrmLogin frmLogoff;

	/**
	 * Create the frame.
	 */
	public FrmMain(String userName) {
		// pega o tamanho máximo disponível para tela do programa
		Rectangle maxBounds = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
		setResizable(false);
		setForeground(Color.WHITE);
		setFont(new Font("Base 02", Font.PLAIN, 12));
		setTitle("BIM - Body In Movement");
		setIconImage(Toolkit.getDefaultToolkit().getImage(FrmMain.class.getResource("/images/bim_logo_32x22.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, maxBounds.width, maxBounds.height - 5);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panelNorth = new JPanel();
		panelNorth.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelNorth.setLocale(new Locale("pt", "BR"));
		panelNorth.setBackground(Color.WHITE);
		panelNorth.setBounds(0, 0, maxBounds.width, 56);
		contentPane.add(panelNorth);
		panelNorth.setLayout(null);

		JLabel lblUsernamehere = new JLabel(userName);
		lblUsernamehere.setBounds(maxBounds.width - 454, 26, 72, 14);
		panelNorth.add(lblUsernamehere);

		JButton btnSair = new JButton("Logoff");
		btnSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmLogoff = new FrmLogin();
				frmLogoff.setVisible(true);
				dispose();
			}
		});
		btnSair.setBounds(maxBounds.width - 115, 11, 105, 35);
		btnSair.setContentAreaFilled(false);
		btnSair.setIcon(new ImageIcon(FrmMain.class.getResource("/images/Cancel Filled-50.png")));
		panelNorth.add(btnSair);

		JButton btnAjuda = new JButton("Ajuda");
		btnAjuda.setContentAreaFilled(false);
		btnAjuda.setIcon(new ImageIcon(FrmMain.class.getResource("/images/Help Filled-50.png")));
		btnAjuda.setBounds(maxBounds.width - 222, 11, 115, 35);
		panelNorth.add(btnAjuda);

		JButton btnsincronizar = new JButton("Sincronizar");
		btnsincronizar.setContentAreaFilled(false);
		btnsincronizar.setIcon(new ImageIcon(FrmMain.class.getResource("/images/Synchronize-48.png")));
		btnsincronizar.setBounds(maxBounds.width - 340, 11, 121, 35);
		panelNorth.add(btnsincronizar);

		JLabel lblUserIcon = new JLabel("");
		lblUserIcon.setIcon(new ImageIcon(FrmMain.class.getResource("/images/userLog.png")));
		lblUserIcon.setBounds(maxBounds.width - 386, 11, 46, 35);
		panelNorth.add(lblUserIcon);

		JLabel lbllogomain = new JLabel("");
		lbllogomain.setIcon(new ImageIcon(FrmMain.class.getResource("/images/bim_logo_64x44.png")));
		lbllogomain.setBounds(10, 5, 72, 41);
		panelNorth.add(lbllogomain);

		UIManager.put("TabbedPane.tabInsets", new Insets(2, 2, 2, 50));
		final JTabbedPane tabbedPane = new JTabbedPane();
		tabbedPane.setBounds(232, 57, maxBounds.width - 238, maxBounds.height - 78);
		
		//
		// All side Panels below //
		//
		leftSidePanel = new JPanel();
		leftSidePanel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		leftSidePanel.setBounds(0, 57, 230, maxBounds.height - 93);
		leftSidePanel.setBackground(Color.white);
		contentPane.add(leftSidePanel);
		leftSidePanel.setLayout(null);

		// panel para listar alunos, adicionar alunos/grupos de alunos
		panelLeftSideStudents = new JPanel();
		panelLeftSideStudents.setBounds(10, 56, 210, leftInerPanelsHeight()-4);
		panelLeftSideStudents.setBackground(Color.white);
		panelLeftSideStudents.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelLeftSideStudents.setLayout(null);
		panelLeftSideStudents.setVisible(false);

		JPanel listGroupsOfStudentsPanel = new JPanel();
		listGroupsOfStudentsPanel.setBounds(1, 0, panelLeftSideStudents.getWidth()-2, (panelLeftSideStudents.getHeight()-64));
		listGroupsOfStudentsPanel.setBackground(Color.white);
		listGroupsOfStudentsPanel.setLayout(new BorderLayout(0, 0));
		listGroupsOfStudentsPanel.setVisible(true);
		listGroupsOfStudentsPanel.add(JScrollBarAdder.getScrollPaneGroups(), BorderLayout.CENTER);
		panelLeftSideStudents.add(listGroupsOfStudentsPanel);
		
		JButton btnAddStudents = new JButton();
		btnAddStudents.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				TabSingUpStudent.init(tabbedPane);
				tabbedPane.setSelectedIndex(tabbedPane.getTabCount()-1);
			}
		});
		btnAddStudents.setContentAreaFilled(false);
		btnAddStudents.setIcon(new ImageIcon(FrmMain.class.getResource("/images/addSingleStudent-icon.png")));
		btnAddStudents.setBounds(2, panelLeftSideStudents.getHeight()-62, (panelLeftSideStudents.getWidth()/2)-4, 60);
		panelLeftSideStudents.add(btnAddStudents);
		
		JButton btnCreateNewGroup = new JButton();
		btnCreateNewGroup.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//TODO
				TabGroupsRegister.tabAluno(tabbedPane);
				tabbedPane.setSelectedIndex(tabbedPane.getTabCount()-1);
			}
		});
		btnCreateNewGroup.setContentAreaFilled(false);
		btnCreateNewGroup.setIcon(new ImageIcon(FrmMain.class.getResource("/images/addNewGroupOfStudens-icon.png")));
		btnCreateNewGroup.setBounds((panelLeftSideStudents.getWidth()/2)+2, panelLeftSideStudents.getHeight()-62, (panelLeftSideStudents.getWidth()/2)-4, 60);
		panelLeftSideStudents.add(btnCreateNewGroup);
		
		// panel of reports
		panelLeftSideReports = new JPanel();
		panelLeftSideReports.setBounds(10, 111, 210, leftInerPanelsHeight()-8);
		panelLeftSideReports.setBackground(Color.white);
		panelLeftSideReports.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelLeftSideReports.setLayout(new BorderLayout(0, 0));
		panelLeftSideReports.setVisible(false);
		panelLeftSideReports.add(JScrollBarAdder.getScrollPaneReports(), BorderLayout.CENTER);

		// panel of procedures
		panelLeftSideProcedures = new JPanel();
		panelLeftSideProcedures.setBounds(10, 166, 210, leftInerPanelsHeight()-12);
		panelLeftSideProcedures.setBackground(Color.white);
		panelLeftSideProcedures.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelLeftSideProcedures.setLayout(null);
		panelLeftSideProcedures.setVisible(false);
		
		JLabel GuedesHomensEspecifica = new JLabel();
		GuedesHomensEspecifica.setText("  Guedes Homens Especifica");
		GuedesHomensEspecifica.setBounds(3, 2, panelLeftSideStudents.getWidth()-6, 55);
		GuedesHomensEspecifica.setOpaque(true);
		GuedesHomensEspecifica.setBackground(Color.lightGray);
		GuedesHomensEspecifica.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GuedesHomensEspecifica.setVisible(true);
		panelLeftSideProcedures.add(GuedesHomensEspecifica);
		
		// panel of Methodologies
		panelLeftSideMethodologies = new JPanel();
		panelLeftSideMethodologies.setBounds(10, 221, 210, leftInerPanelsHeight()-18);
		panelLeftSideMethodologies.setBackground(Color.white);
		panelLeftSideMethodologies.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelLeftSideMethodologies.setLayout(null);
		panelLeftSideMethodologies.setVisible(false);

		btnStudents = new JLabel("Alunos");
		btnStudents.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (!panelLeftSideStudents.isVisible()) {
					if ((panelLeftSideReports.isVisible()) || (panelLeftSideProcedures.isVisible())
							|| (panelLeftSideMethodologies.isVisible())) {
						setVisibilityReportsPanelFalse();
						setVisibilityProceduresPanelFalse();
						setVisibilityMethodologiesPanelFalse();
					}
					btnReports.setBounds(10, leftInerPanelsHeight()+56, 210, 44);
					btnProcedures.setBounds(10, leftInerPanelsHeight()+105, 210, 44);
					btnMethodologies.setBounds(10, leftInerPanelsHeight()+154, 210, 44);
					panelLeftSideStudents.setVisible(true);
					leftSidePanel.add(panelLeftSideStudents);
					//call method to list groups of students on database
					JScrollBarAdder.listGroupsLabels();
					leftSidePanel.repaint();
					leftSidePanel.revalidate();
				} else {
					setVisibilityStudentsPanelFalse();
				}
			}
		});
		btnStudents.setForeground(Color.white);
		btnStudents.setOpaque(true);
		btnStudents.setBackground(new Color(35, 164, 240));
		btnStudents.setHorizontalAlignment(SwingConstants.CENTER);
		btnStudents.setLabelFor(leftSidePanel);
		btnStudents.setBounds(10, 11, 210, 44);
		leftSidePanel.add(btnStudents);

		btnReports = new JLabel("Relat\u00F3rios");
		btnReports.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (!panelLeftSideReports.isVisible()) {
					if ((panelLeftSideStudents.isVisible()) || (panelLeftSideProcedures.isVisible())
							|| (panelLeftSideMethodologies.isVisible())) {
						setVisibilityProceduresPanelFalse();
						setVisibilityStudentsPanelFalse();
						setVisibilityMethodologiesPanelFalse();
					}
					btnProcedures.setBounds(10, leftInerPanelsHeight()+109, 210, 44);
					btnMethodologies.setBounds(10, leftInerPanelsHeight()+158, 210, 44);
					//Method called list types of reports
					JScrollBarAdder.listReportsLabels();
					panelLeftSideReports.setVisible(true);
					leftSidePanel.add(panelLeftSideReports);
					leftSidePanel.repaint();
					leftSidePanel.repaint();
				} else {
					setVisibilityReportsPanelFalse();
				}
			}
		});
		btnReports.setForeground(Color.white);
		btnReports.setOpaque(true);
		btnReports.setBackground(new Color(35, 164, 240));
		btnReports.setHorizontalAlignment(SwingConstants.CENTER);
		btnReports.setLabelFor(leftSidePanel);
		btnReports.setBounds(10, 66, 210, 44);
		leftSidePanel.add(btnReports);

		btnProcedures = new JLabel("Procedimentos");
		btnProcedures.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (!panelLeftSideProcedures.isVisible()) {
					if ((panelLeftSideReports.isVisible()) || (panelLeftSideStudents.isVisible())
							|| (panelLeftSideMethodologies.isVisible())) {
						setVisibilityReportsPanelFalse();
						setVisibilityStudentsPanelFalse();
						setVisibilityMethodologiesPanelFalse();
					}
					btnMethodologies.setBounds(10, leftInerPanelsHeight() + 158, 210, 44);
					panelLeftSideProcedures.setVisible(true);
					leftSidePanel.add(panelLeftSideProcedures);
					leftSidePanel.repaint();
					leftSidePanel.revalidate();
				} else {
					setVisibilityProceduresPanelFalse();
				}
			}
		});
		btnProcedures.setOpaque(true);
		btnProcedures.setForeground(Color.white);
		btnProcedures.setBackground(new Color(35, 164, 240));
		btnProcedures.setHorizontalAlignment(SwingConstants.CENTER);
		btnProcedures.setLabelFor(leftSidePanel);
		btnProcedures.setBounds(10, 121, 210, 44);
		leftSidePanel.add(btnProcedures);

		btnMethodologies = new JLabel("M\u00E9todologias");
		btnMethodologies.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (!panelLeftSideMethodologies.isVisible()) {
					if ((panelLeftSideStudents.isVisible()) || (panelLeftSideReports.isVisible())
							|| (panelLeftSideProcedures.isVisible())) {
						setVisibilityStudentsPanelFalse();
						setVisibilityReportsPanelFalse();
						setVisibilityProceduresPanelFalse();
					}
					btnMethodologies.setBounds(10, 176, 210, 44);
					panelLeftSideMethodologies.setVisible(true);
					leftSidePanel.add(panelLeftSideMethodologies);
					leftSidePanel.repaint();
					leftSidePanel.revalidate();
				} else {
					setVisibilityMethodologiesPanelFalse();
				}
			}
		});
		btnMethodologies.setOpaque(true);
		btnMethodologies.setForeground(Color.white);
		btnMethodologies.setBackground(new Color(35, 164, 240));
		btnMethodologies.setHorizontalAlignment(SwingConstants.CENTER);
		btnMethodologies.setLabelFor(leftSidePanel);
		btnMethodologies.setBounds(10, 176, 210, 44);
		leftSidePanel.add(btnMethodologies);

		//adiciona jtabbedpane com botão de fechar
		contentPane.add(new CloseableTabbedPane().makeUI(maxBounds, tabbedPane));
		TabStudent.init(tabbedPane);
	}

	private void setVisibilityStudentsPanelFalse() {
		btnReports.setBounds(10, 66, 210, 44);
		btnProcedures.setBounds(10, 121, 210, 44);
		btnMethodologies.setBounds(10, 176, 210, 44);
		panelLeftSideStudents.setVisible(false);
		leftSidePanel.remove(panelLeftSideStudents);
		leftSidePanel.repaint();
		leftSidePanel.revalidate();
	}

	private void setVisibilityReportsPanelFalse() {
		btnProcedures.setBounds(10, 121, 210, 44);
		btnMethodologies.setBounds(10, 176, 210, 44);
		panelLeftSideReports.setVisible(false);
		leftSidePanel.remove(panelLeftSideReports);
		leftSidePanel.repaint();
		leftSidePanel.revalidate();
	}

	private void setVisibilityProceduresPanelFalse() {
		btnMethodologies.setBounds(10, 176, 210, 44);
		panelLeftSideProcedures.setVisible(false);
		leftSidePanel.remove(panelLeftSideProcedures);
		leftSidePanel.repaint();
		leftSidePanel.revalidate();
	}

	private void setVisibilityMethodologiesPanelFalse() {
		panelLeftSideMethodologies.setVisible(false);
		leftSidePanel.remove(panelLeftSideMethodologies);
		leftSidePanel.repaint();
		leftSidePanel.revalidate();
	}
	
	/**
	 * Calculate the height to the left inner panels (Students, reports, procedures, Methodologies).
	 * @return height to panel
	 */
	private int leftInerPanelsHeight(){
		int height = leftSidePanel.getHeight();
		return height -= 209;
	}
}
