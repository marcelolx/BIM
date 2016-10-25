package br.edu.unoesc.edi.bim.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;

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
import java.awt.Font;
import java.awt.SystemColor;

/**
 * 
 * @author Marcelo
 *
 */
public class TabStudent {

	private static JList<String> txtStudentslist;
	private static JScrollPane StudentListScrollPane;

	/**
	 * @wbp.parser.entryPoint
	 */
	public static void init(JTabbedPane mainPane) {

		Rectangle maxBounds = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();

		JPanel pane = new JPanel();
		pane.setBackground(Color.white);
		pane.setPreferredSize(new Dimension(957, 860));

		JPanel northTabbedPane = new JPanel();
		northTabbedPane.setPreferredSize(new Dimension(45, 45));
		northTabbedPane.setBackground(Color.white);
		northTabbedPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		northTabbedPane.setLayout(new BorderLayout(0, 0));

		JSearchField searchStudents = new JSearchField();
		searchStudents.setIcon(JImage.loadIcon("/images/Search-52.png"));
		searchStudents.setEmptyText("Procurar Aluno");
		northTabbedPane.add(searchStudents, BorderLayout.CENTER);

		JPanel centralTabbedPane = new JPanel();
		centralTabbedPane.setPreferredSize(new Dimension(maxBounds.width, maxBounds.height));
		centralTabbedPane.setBackground(Color.white);
		centralTabbedPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pane.setLayout(new BorderLayout(0, 0));

		pane.add(northTabbedPane, BorderLayout.NORTH);

		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(maxBounds.width - maxBounds.height, 10));
		panel.setBackground(Color.WHITE);
		northTabbedPane.add(panel, BorderLayout.EAST);
		panel.setLayout(new BorderLayout(0, 0));

		JButton clearSearchStudents = new JButton();
		panel.add(clearSearchStudents, BorderLayout.WEST);
		clearSearchStudents.setPreferredSize(new Dimension(50, 50));
		clearSearchStudents.setContentAreaFilled(false);
		clearSearchStudents
				.setIcon(new ImageIcon(CloseableTabbedPane.class.getResource("/images/Clear Symbol-48.png")));
		pane.add(centralTabbedPane);
		centralTabbedPane.setLayout(null);

		StudentListScrollPane = new JScrollPane();
		StudentListScrollPane.setBounds(2, 2, maxBounds.width-245, maxBounds.height-167);
		StudentListScrollPane.setBackground(Color.WHITE);
		// StudentListScrollPane.setLayout(null);
		centralTabbedPane.add(StudentListScrollPane);

		JPanel studentListPanel = new JPanel();
		studentListPanel.setBackground(Color.WHITE);
		StudentListScrollPane.setViewportView(studentListPanel);
		studentListPanel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("  Ana Clara");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(0, 0, maxBounds.width-247, 55);
		lblNewLabel_1.setMaximumSize(new Dimension(30, 10));
		lblNewLabel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblNewLabel_1.setPreferredSize(new Dimension(5, 5));
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setOpaque(true);
		studentListPanel.add(lblNewLabel_1);

		JLabel lblNewLabel_11 = new JLabel("  Isadora Pinto  -  24 Anos  -  69Kg");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_11.setBounds(0, 55, maxBounds.width-247, 55);
		lblNewLabel_11.setMaximumSize(new Dimension(30, 10));
		lblNewLabel_11.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblNewLabel_11.setPreferredSize(new Dimension(5, 5));
		lblNewLabel_11.setBackground(SystemColor.menu);
		lblNewLabel_11.setForeground(Color.BLACK);
		lblNewLabel_11.setOpaque(true);
		studentListPanel.add(lblNewLabel_11);

		JLabel lblNewLabel_111 = new JLabel("  Maria Pia");
		lblNewLabel_111.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_111.setBounds(0, 110, maxBounds.width-247, 55);
		lblNewLabel_111.setMaximumSize(new Dimension(30, 10));
		lblNewLabel_111.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblNewLabel_111.setPreferredSize(new Dimension(5, 5));
		lblNewLabel_111.setBackground(Color.WHITE);
		lblNewLabel_111.setForeground(Color.BLACK);
		lblNewLabel_111.setOpaque(true);
		studentListPanel.add(lblNewLabel_111);

		JLabel lblNewLabel_1111 = new JLabel("  Ana Clara");
		lblNewLabel_1111.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1111.setBounds(0, 165, maxBounds.width-247, 55);
		lblNewLabel_1111.setMaximumSize(new Dimension(30, 10));
		lblNewLabel_1111.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblNewLabel_1111.setPreferredSize(new Dimension(5, 5));
		lblNewLabel_1111.setBackground(SystemColor.menu);
		lblNewLabel_1111.setForeground(Color.BLACK);
		lblNewLabel_1111.setOpaque(true);
		studentListPanel.add(lblNewLabel_1111);
		
		JLabel lblNewLabel_11111 = new JLabel("  Isadora Pinto");
		lblNewLabel_11111.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_11111.setBounds(0, 220, maxBounds.width-247, 55);
		lblNewLabel_11111.setMaximumSize(new Dimension(30, 10));
		lblNewLabel_11111.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblNewLabel_11111.setPreferredSize(new Dimension(5, 5));
		lblNewLabel_11111.setBackground(Color.WHITE);
		lblNewLabel_11111.setForeground(Color.BLACK);
		lblNewLabel_11111.setOpaque(true);
		studentListPanel.add(lblNewLabel_11111);

		JLabel lblNewLabel_111111 = new JLabel("  Maria Pia");
		lblNewLabel_111111.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_111111.setBounds(0, 275, maxBounds.width-247, 55);
		lblNewLabel_111111.setMaximumSize(new Dimension(30, 10));
		lblNewLabel_111111.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblNewLabel_111111.setPreferredSize(new Dimension(5, 5));
		lblNewLabel_111111.setBackground(SystemColor.menu);
		lblNewLabel_111111.setForeground(Color.BLACK);
		lblNewLabel_111111.setOpaque(true);
		studentListPanel.add(lblNewLabel_111111);

		JLabel lblNewLabel_1111111 = new JLabel("  Ana Clara");
		lblNewLabel_1111111.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1111111.setBounds(0, 325, maxBounds.width-247, 55);
		lblNewLabel_1111111.setMaximumSize(new Dimension(30, 10));
		lblNewLabel_1111111.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblNewLabel_1111111.setPreferredSize(new Dimension(5, 5));
		lblNewLabel_1111111.setBackground(Color.WHITE);
		lblNewLabel_1111111.setForeground(Color.BLACK);
		lblNewLabel_1111111.setOpaque(true);
		studentListPanel.add(lblNewLabel_1111111);
		
		mainPane.addTab("Alunos", pane);
	}
}
