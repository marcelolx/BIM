package br.edu.unoesc.edi.bim.ui.tabs;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.TitledBorder;

import br.edu.unoesc.edi.bim.components.CloseableTabbedPane;
import br.edu.unoesc.edi.bim.components.JImage;
import br.edu.unoesc.edi.bim.components.JSearchField;
import br.edu.unoesc.edi.bim.ui.JScrollBarAdder;

/**
 * 
 * @author Marcelo
 *
 */
public class TabStudent {
	
	private static Rectangle maxBounds;
	private static JTabbedPane mainTabbedPane;
	
	public static void init(JTabbedPane mainPane) {
		mainTabbedPane = mainPane;
		maxBounds = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();

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
		searchStudents.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
					if((searchStudents.getText().length() % 2)==0){//pesquisa só quando o tamanho da pesquisa for par
						JScrollBarAdder.listSearchedStudents(maxBounds, mainPane, searchStudents.getText());
					}
					
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
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
				searchStudents.setText(""	);
				updateTabStudents();
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
	
	protected static void updateTabStudents(){
		JScrollBarAdder.removeTabStudentsPanels();
		JScrollBarAdder.listStudentsAtTabStudents(maxBounds, mainTabbedPane);
	}
}
