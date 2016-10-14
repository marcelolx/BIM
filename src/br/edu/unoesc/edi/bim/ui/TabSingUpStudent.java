package br.edu.unoesc.edi.bim.ui;


import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import br.edu.unoesc.edi.bim.components.JImage;
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
		
		pane.add(northTabbedPane);
		pane.add(centerPanel);
		pane.setVisible(true);
		
		mainPane.addTab("Cadastro Aluno", pane);
		
	}
}
