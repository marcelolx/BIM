package br.edu.unoesc.edi.bim.ui;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import br.edu.unoesc.edi.bim.components.CloseableTabbedPane;
import br.edu.unoesc.edi.bim.components.JImage;
import br.edu.unoesc.edi.bim.components.JSearchField;
/**
 * 
 * @author Marcelo
 *
 */
public class TabGroupsRegister {
	//TODO
	public static void tabAluno(JTabbedPane mainPane){
		JPanel pane = new JPanel();
		pane.setLayout(null);
		pane.setBackground(Color.white);
		
		JPanel northPane = new JPanel();
		northPane.setLayout(null);
		northPane.setBounds(1, 0, mainPane.getWidth()-9, 50);
		northPane.setBackground(Color.white);
		northPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JLabel lblCadastroNorth = new JLabel("Cadastro de Grupos");
		lblCadastroNorth.setFont(new Font("Base 02", Font.PLAIN, 22));
		lblCadastroNorth.setBackground(Color.black);
		lblCadastroNorth.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroNorth.setBounds(1, 1, mainPane.getWidth()-11, 40);
		lblCadastroNorth.setVisible(true);
		northPane.add(lblCadastroNorth);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(null);
		centerPanel.setBounds(1, 52, mainPane.getWidth()-9, mainPane.getHeight()-94);
		centerPanel.setBackground(Color.white);
		centerPanel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JLabel lblName = new JLabel("Nome*");
		lblName.setBounds((mainPane.getWidth()/4), 50, 60, 22);
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setForeground(Color.gray);
		lblName.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblName);
		
		JTextField txtGroupName = new JTextField();
		txtGroupName.setBounds((mainPane.getWidth()/4)+62, 50, 380, 22);
		txtGroupName.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtGroupName.setForeground(Color.gray);
		centerPanel.add(txtGroupName);
		
		JPanel listStudentsPanel = new JPanel();
		listStudentsPanel.setLayout(new BorderLayout(0, 0));
		listStudentsPanel.setBounds(calcPaneSize(mainPane, 6), 82, 300, 290);
		listStudentsPanel.setBackground(Color.white);
		listStudentsPanel.setVisible(true);
		listStudentsPanel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		listStudentsPanel.add(JScrollBarAdder.getScrollPaneStudents(), BorderLayout.CENTER);
		centerPanel.add(listStudentsPanel);
		JScrollBarAdder.listStudents();
		
		JLabel btnSetNewGroup = new JLabel(">>");
		btnSetNewGroup.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0){
				JScrollBarAdder.listStudentsNewGroup();
			}
		});
		btnSetNewGroup.setForeground(Color.white);
		btnSetNewGroup.setOpaque(true);
		btnSetNewGroup.setBackground(new Color(35, 164, 240));
		btnSetNewGroup.setHorizontalAlignment(SwingConstants.CENTER);
		btnSetNewGroup.setBounds(calcPaneSize(mainPane, 6)+304, 167, 48, 48);
		centerPanel.add(btnSetNewGroup);
		
		JLabel btnRemoveFromNewGroup = new JLabel("<<");
		btnRemoveFromNewGroup.setForeground(Color.white);
		btnRemoveFromNewGroup.setOpaque(true);
		btnRemoveFromNewGroup.setBackground(new Color(35, 164, 240));
		btnRemoveFromNewGroup.setHorizontalAlignment(SwingConstants.CENTER);
		btnRemoveFromNewGroup.setBounds(calcPaneSize(mainPane, 6)+304, 219, 48, 48);
		centerPanel.add(btnRemoveFromNewGroup);
		
		JPanel listNewGroupStudents = new JPanel();
		listNewGroupStudents.setLayout(new BorderLayout(0, 0));
		listNewGroupStudents.setBounds(calcPaneSize(mainPane, 6)+356, 82, 300, 290);
		listNewGroupStudents.setBackground(Color.white);
		listNewGroupStudents.setVisible(true);
		listNewGroupStudents.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		listNewGroupStudents.add(JScrollBarAdder.getScrollPaneStudentsNewGroup(), BorderLayout.CENTER);
		centerPanel.add(listNewGroupStudents);
		
		pane.add(northPane);
		pane.add(centerPanel);
		
		pane.setVisible(true);
		mainPane.addTab("Novo Grupo", pane);
	}
	
	private static int calcPaneSize(JTabbedPane mainPane, int sub){
		int size = mainPane.getWidth()/sub;
		return size;
	}
}
