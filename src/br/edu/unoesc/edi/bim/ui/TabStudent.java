package br.edu.unoesc.edi.bim.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
public class TabStudent {


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
		clearSearchStudents.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//TODO
				JScrollBarAdder.removePanels();
				JScrollBarAdder.listStudentsAtTabStudents(maxBounds, mainPane);
				
			}
		});
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
		JScrollBarAdder.listStudentsAtTabStudents(maxBounds, mainPane);

		pane.add(northTabbedPane, BorderLayout.NORTH);
		pane.add(centralTabbedPane, BorderLayout.CENTER);
		mainPane.addTab("Alunos", pane);
	}
}
