package br.edu.unoesc.edi.bim.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
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
		pane.setLayout(new BorderLayout(0, 0));
		
		JPanel northTabbedPane = new JPanel();
		northTabbedPane.setPreferredSize(new Dimension(45, 45));
		northTabbedPane.setBackground(Color.white);
		northTabbedPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		northTabbedPane.setLayout(new BorderLayout(0, 0));

		JSearchField searchStudents = new JSearchField();
		searchStudents.setIcon(JImage.loadIcon("/images/Search-52.png"));
		searchStudents.setEmptyText("Procurar Aluno");
		northTabbedPane.add(searchStudents, BorderLayout.CENTER);
		
		//Não sei porque está aí, mas está.
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(maxBounds.width - maxBounds.height, 10));
		panel.setBackground(Color.WHITE);
		northTabbedPane.add(panel, BorderLayout.EAST);
		panel.setLayout(new BorderLayout(0, 0));
		
		JButton clearSearchStudents = new JButton();
		panel.add(clearSearchStudents, BorderLayout.WEST);
		clearSearchStudents.setPreferredSize(new Dimension(50, 50));
		clearSearchStudents.setContentAreaFilled(false);
		clearSearchStudents.setIcon(new ImageIcon(CloseableTabbedPane.class.getResource("/images/Clear Symbol-48.png")));
		
		JPanel centralTabbedPane = new JPanel();
		centralTabbedPane.setPreferredSize(new Dimension(maxBounds.width, maxBounds.height));
		centralTabbedPane.setBackground(Color.white);
		centralTabbedPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		centralTabbedPane.setLayout(new BorderLayout(0, 0));
		centralTabbedPane.add(JScrollBarAdder.getScrollPaneTabStudents(), BorderLayout.CENTER);
		JScrollBarAdder.listStudentsAtTabStudents(maxBounds);
		/*JLabel[] teste = new JLabel[50];

		for (int i = 0; i < 20; i++) {
			teste[i] = new JLabel("  Ana Clara");
			teste[i].setFont(new Font("Tahoma", Font.PLAIN, 24));
			teste[i].setBounds(0, i * 55, maxBounds.width - 247, 55);
			teste[i].setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			teste[i].setPreferredSize(new Dimension(5, 5));
			if (i % 2 == 0) {
				teste[i].setBackground(Color.WHITE);
			}
			teste[i].setForeground(Color.BLACK);
			teste[i].setOpaque(true);
			centralTabbedPane.add(teste[i]);
		}
		
		*/
		pane.add(northTabbedPane, BorderLayout.NORTH);
		pane.add(centralTabbedPane, BorderLayout.CENTER);
		mainPane.addTab("Alunos", pane);
	}
}
