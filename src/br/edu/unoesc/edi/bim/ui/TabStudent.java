package br.edu.unoesc.edi.bim.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
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
public class TabStudent {

	private static JList<String> txtStudentslist;
	private static JScrollPane StudentListScrollPane;

	public static void init(JTabbedPane mainPane) {
		JPanel pane = new JPanel();
		pane.setLayout(null);
		pane.setBackground(Color.white);

		JPanel northTabbedPane = new JPanel();
		northTabbedPane.setLayout(null);
		northTabbedPane.setBounds(1, 0, mainPane.getWidth() - 9, 50);
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
		clearSearchStudents
				.setIcon(new ImageIcon(CloseableTabbedPane.class.getResource("/images/Clear Symbol-48.png")));
		northTabbedPane.add(clearSearchStudents);

		JPanel centralTabbedPane = new JPanel();
		centralTabbedPane.setLayout(null);
		centralTabbedPane.setBounds(1, 1, mainPane.getWidth() - 9, mainPane.getHeight() - 94);
		centralTabbedPane.setBackground(Color.white);
		centralTabbedPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		StudentListScrollPane = new JScrollPane();
		StudentListScrollPane.setBounds(1, 52, mainPane.getWidth() - 9, mainPane.getHeight() - 94);
		StudentListScrollPane.setBackground(Color.WHITE);
		centralTabbedPane.add(StudentListScrollPane);

		JPanel studentListPanel = new JPanel();
		StudentListScrollPane.setViewportView(studentListPanel);
		studentListPanel.setLayout(new GridLayout(0, 1, 1, 0));

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setPreferredSize(new Dimension(5, 5));
		studentListPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setPreferredSize(new Dimension(5, 5));
		lblNewLabel_11.setBackground(new Color(35, 164, 240));
		lblNewLabel_11.setForeground(Color.black);
		studentListPanel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_111 = new JLabel("");
		lblNewLabel_111.setPreferredSize(new Dimension(5, 5));
		studentListPanel.add(lblNewLabel_111);
		
		JLabel lblNewLabel_1111 = new JLabel("");
		lblNewLabel_1111.setPreferredSize(new Dimension(5, 5));
		studentListPanel.add(lblNewLabel_1111);
		

		pane.add(northTabbedPane);
		pane.add(centralTabbedPane);

		mainPane.addTab("Alunos", pane);
	}
}
