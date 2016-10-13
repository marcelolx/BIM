package br.edu.unoesc.edi.bim.ui;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import br.edu.unoesc.edi.bim.components.CloseableTabbedPane;
import br.edu.unoesc.edi.bim.components.JImage;
import br.edu.unoesc.edi.bim.components.JSearchField;
/**
 * 
 * @author Marcelo
 *
 */
public class TabAluno {
	public static void tabAluno(JTabbedPane mainPane){
		JPanel pane = new JPanel();
		pane.setLayout(null);
		pane.setBackground(Color.white);
		
		JSearchField searchStudents = new JSearchField();
		searchStudents.setBounds(10, 10, 400, 30);
		searchStudents.setIcon(JImage.loadIcon("/images/Search-52.png"));
		searchStudents.setEmptyText("Procurar Aluno");
		pane.add(searchStudents);
		
		JButton clearSearchStudents = new JButton();
		clearSearchStudents.setContentAreaFilled(false);
		clearSearchStudents.setBounds(420, 5, 80, 40);
		clearSearchStudents.setIcon(new ImageIcon(CloseableTabbedPane.class.getResource("/images/Clear Symbol-48.png")));
		pane.add(clearSearchStudents);
		
		
		
		mainPane.addTab("Aluno", pane);
	}
}
