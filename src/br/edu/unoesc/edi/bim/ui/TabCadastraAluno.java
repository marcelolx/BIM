package br.edu.unoesc.edi.bim.ui;


import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.TitledBorder;

import br.edu.unoesc.edi.bim.components.CloseableTabbedPane;
import br.edu.unoesc.edi.bim.components.JImage;
import br.edu.unoesc.edi.bim.components.JSearchField;
/**
 * 
 * @author Marcelo
 *
 */
public class TabCadastraAluno {
	//TODO
	public static void tabCadastraAluno(JTabbedPane mainPane){
		JPanel pane = new JPanel();
		pane.setLayout(null);
		pane.setBackground(Color.white);
		
		JPanel northTabbedPane = new JPanel();
		northTabbedPane.setLayout(null);
		northTabbedPane.setBounds(1, 0, mainPane.getWidth()-9, 50);
		northTabbedPane.setBackground(Color.white);
		northTabbedPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JSearchField searchStudents = new JSearchField();
		searchStudents.setBounds(10, 10, 400, 30);
		searchStudents.setIcon(JImage.loadIcon("/images/Search-52.png"));
		searchStudents.setEmptyText("Procurar Aluno");
		northTabbedPane.add(searchStudents);
		
		JButton clearSearchStudents = new JButton();
		clearSearchStudents.setContentAreaFilled(false);
		clearSearchStudents.setBounds(420, 5, 80, 40);
		clearSearchStudents.setIcon(new ImageIcon(CloseableTabbedPane.class.getResource("/images/Clear Symbol-48.png")));
		northTabbedPane.add(clearSearchStudents);
		
		JPanel centralTabbedPane = new JPanel();
		centralTabbedPane.setLayout(null);
		centralTabbedPane.setBounds(1, 52, mainPane.getWidth()-9, mainPane.getHeight()-94);
		centralTabbedPane.setBackground(Color.white);
		centralTabbedPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		
		pane.add(northTabbedPane);
		pane.add(centralTabbedPane);
		pane.setVisible(true);
		
		mainPane.addTab("Cadastro Aluno", pane);
		
	}
}
