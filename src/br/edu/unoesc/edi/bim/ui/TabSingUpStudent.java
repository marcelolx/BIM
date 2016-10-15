package br.edu.unoesc.edi.bim.ui;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import br.edu.unoesc.edi.bim.components.JSearchField;
/**
 * 
 * @author Marcelo
 *
 */
public class TabSingUpStudent {
	//TODO
	public static void init(JTabbedPane mainPane){
		JPanel pane = new JPanel();
		pane.setLayout(null);
		pane.setBackground(Color.white);
		
		JPanel northTabbedPane = new JPanel();
		northTabbedPane.setLayout(null);
		northTabbedPane.setBounds(1, 0, mainPane.getWidth()-9, 50);
		northTabbedPane.setBackground(Color.white);
		northTabbedPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JLabel lblCadastroNorth = new JLabel("Cadastro de Aluno");
		lblCadastroNorth.setFont(new Font("Base 02", Font.PLAIN, 22));
		lblCadastroNorth.setBackground(Color.black);
		lblCadastroNorth.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroNorth.setBounds(1, 1, mainPane.getWidth()-11, 40);
		lblCadastroNorth.setVisible(true);
		northTabbedPane.add(lblCadastroNorth);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(null);
		centerPanel.setBounds(1, 52, mainPane.getWidth()-9, mainPane.getHeight()-94);
		centerPanel.setBackground(Color.white);
		centerPanel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JLabel lblStudentPhoto = new JLabel();
		lblStudentPhoto.setBounds(50, 50, 170, 180);
		lblStudentPhoto.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentPhoto.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblStudentPhoto.setIcon(new ImageIcon(TabSingUpStudent.class.getResource("/images/UserFilled-165.png")));
		centerPanel.add(lblStudentPhoto);
		
		JButton addStudentPhoto = new JButton();
		addStudentPhoto.setContentAreaFilled(false);
		addStudentPhoto.setBounds(50, 232, 85, 44);
		addStudentPhoto.setIcon(new ImageIcon(TabSingUpStudent.class.getResource("/images/AddCamera-32.png")));
		centerPanel.add(addStudentPhoto);
		
		JButton removeStudentPhoto = new JButton();
		removeStudentPhoto.setContentAreaFilled(false);
		removeStudentPhoto.setBounds(137, 232, 85, 44);
		removeStudentPhoto.setIcon(new ImageIcon(TabSingUpStudent.class.getResource("/images/Delete Filled-32.png")));
		centerPanel.add(removeStudentPhoto);
		
		JLabel lblName = new JLabel("Nome *");
		lblName.setBounds(calcPaneWidthSizeToSetComponents(mainPane)+1, 50, 60, 22);
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setForeground(Color.gray);
		lblName.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblName);
		
		JSearchField txtName = new JSearchField();
		txtName.setBounds(calcPaneWidthSizeToSetComponents(mainPane)+62, 50, 380, 22);
		txtName.setEmptyText("Nome completo sem abrevia��es");
		txtName.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtName.setForeground(Color.gray);
		centerPanel.add(txtName);
		
		JLabel lblMail = new JLabel("E-mail *");
		lblMail.setBounds(calcPaneWidthSizeToSetComponents(mainPane), 92, 60, 22);
		lblMail.setHorizontalAlignment(SwingConstants.CENTER);
		lblMail.setForeground(Color.gray);
		lblMail.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblMail);
		
		JTextField txtMail = new JTextField();
		txtMail.setBounds(calcPaneWidthSizeToSetComponents(mainPane)+62, 90, 380, 22);
		txtMail.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtMail.setForeground(Color.gray);
		centerPanel.add(txtMail);
		
		JLabel lblPhone = new JLabel("Telefone");
		lblPhone.setBounds(calcPaneWidthSizeToSetComponents(mainPane)-2, 132, 60, 22);
		lblPhone.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhone.setForeground(Color.gray);
		lblPhone.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblPhone);
		
		JSearchField txtPhone = new JSearchField();
		txtPhone.setBounds(calcPaneWidthSizeToSetComponents(mainPane)+62, 130, 200, 22);
		txtPhone.setEmptyText("+55 (00) 0000-00000");
		txtPhone.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtPhone.setForeground(Color.gray);
		centerPanel.add(txtPhone);
		
		JLabel lblBirthday = new JLabel("Data Nascimento*");
		lblBirthday.setBounds(calcPaneWidthSizeToSetComponents(mainPane)-60, 174, 120, 22);
		lblBirthday.setHorizontalAlignment(SwingConstants.CENTER);
		lblBirthday.setForeground(Color.gray);
		lblBirthday.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblBirthday);
		
		JSearchField txtBirthday = new JSearchField();
		txtBirthday.setBounds(calcPaneWidthSizeToSetComponents(mainPane)+62, 172, 170, 22);
		txtBirthday.setEmptyText("00/00/0000");
		txtBirthday.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtBirthday.setForeground(Color.gray);
		centerPanel.add(txtBirthday);
		
		JLabel lblAge = new JLabel("Idade*");
		lblAge.setBounds(calcPaneWidthSizeToSetComponents(mainPane)+228, 174, 60, 22);
		lblAge.setHorizontalAlignment(SwingConstants.CENTER);
		lblAge.setForeground(Color.gray);
		lblAge.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblAge);
		
		JTextField txtAge = new JTextField();
		txtAge.setBounds(calcPaneWidthSizeToSetComponents(mainPane)+290, 172, 45, 22);
		txtAge.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtAge.setForeground(Color.gray);
		centerPanel.add(txtAge);
		
		JLabel lblGenre = new JLabel("G�nero*");
		lblGenre.setBounds(calcPaneWidthSizeToSetComponents(mainPane), 214, 60, 22);
		lblGenre.setHorizontalAlignment(SwingConstants.CENTER);
		lblGenre.setForeground(Color.gray);
		lblGenre.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblGenre);
		
		JRadioButton rbGenreMale = new JRadioButton("Masculino");
		rbGenreMale.setBounds(calcPaneWidthSizeToSetComponents(mainPane)+62, 214, 109, 22);
		rbGenreMale.setFont(new Font("Sans Serif", Font.BOLD, 13));
		rbGenreMale.setBackground(Color.white);
		rbGenreMale.setForeground(Color.gray);
		centerPanel.add(rbGenreMale);
		
		JRadioButton rbGenreFemale = new JRadioButton("Feminino");
		rbGenreFemale.setBounds(calcPaneWidthSizeToSetComponents(mainPane)+173, 214, 109, 22);
		rbGenreFemale.setFont(new Font("Sans Serif", Font.BOLD, 13));
		rbGenreFemale.setBackground(Color.white);
		rbGenreFemale.setForeground(Color.gray);
		centerPanel.add(rbGenreFemale);
		
		JLabel lblWeight = new JLabel("Peso(kg)*");
		lblWeight.setBounds(calcPaneWidthSizeToSetComponents(mainPane)-3, 256, 60, 22);
		lblWeight.setHorizontalAlignment(SwingConstants.CENTER);
		lblWeight.setForeground(Color.gray);
		lblWeight.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblWeight);
		
		JTextField txtWeight = new JTextField();
		txtWeight.setBounds(calcPaneWidthSizeToSetComponents(mainPane)+62, 256, 45, 22);
		txtWeight.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtWeight.setForeground(Color.gray);
		centerPanel.add(txtWeight);
		
		JLabel lblHeight = new JLabel("Altura(cm)*");
		lblHeight.setBounds(calcPaneWidthSizeToSetComponents(mainPane)+139, 256, 70, 22);
		lblHeight.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeight.setForeground(Color.gray);
		lblHeight.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblHeight);
		
		JTextField txtHeight = new JTextField();
		txtHeight.setBounds(calcPaneWidthSizeToSetComponents(mainPane)+219, 256, 45, 22);
		txtHeight.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtHeight.setForeground(Color.gray);
		centerPanel.add(txtHeight);
		
		JLabel lblGroups = new JLabel("Grupos");
		lblGroups.setBounds(calcPaneWidthSizeToSetComponents(mainPane), 298, 60, 22);
		lblGroups.setHorizontalAlignment(SwingConstants.CENTER);
		lblGroups.setForeground(Color.gray);
		lblGroups.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblGroups);
		
		JPanel listGroupsPanel = new JPanel();
		listGroupsPanel.setLayout(new BorderLayout(0, 0));
		listGroupsPanel.setBounds(calcPaneWidthSizeToSetComponents(mainPane)+62, 298, 380, 150);
		listGroupsPanel.setBackground(Color.white);
		listGroupsPanel.setVisible(true);
		listGroupsPanel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		listGroupsPanel.add(JScrollBarAdder.getScrollPaneGroupsRadioButton(), BorderLayout.CENTER);
		centerPanel.add(listGroupsPanel);
		JScrollBarAdder.listGroupsRadioButtons();
		
		JLabel btnReset = new JLabel("Limpar");
		btnReset.setForeground(Color.white);
		btnReset.setOpaque(true);
		btnReset.setBackground(new Color(64, 130, 240));
		btnReset.setHorizontalAlignment(SwingConstants.CENTER);
		btnReset.setBounds(calcPaneWidthSizeToSetComponents(mainPane)+252, 452, 95, 44);
		centerPanel.add(btnReset);
		
		JLabel btnSave = new JLabel("Salvar");
		btnSave.setForeground(Color.white);
		btnSave.setOpaque(true);
		btnSave.setBackground(new Color(64, 130, 240));
		btnSave.setHorizontalAlignment(SwingConstants.CENTER);
		btnSave.setBounds(calcPaneWidthSizeToSetComponents(mainPane)+349, 452, 95, 44);
		centerPanel.add(btnSave);
		
		pane.add(northTabbedPane);
		pane.add(centerPanel);
		pane.setVisible(true);

		mainPane.addTab("Novo Aluno", pane);
	}
	
	private static int calcPaneWidthSizeToSetComponents(JTabbedPane mainPane){
		return ((mainPane.getWidth()-220-440)/2)+220;
	}
}
