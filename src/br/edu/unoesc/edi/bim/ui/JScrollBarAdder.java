package br.edu.unoesc.edi.bim.ui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import br.edu.unoesc.edi.bim.actions.ActionJlabelGroups;
import br.edu.unoesc.edi.bim.actions.ActionJlabelReports;

/**
 * 
 * @author Marcelo
 *
 */
public class JScrollBarAdder {

	private static JScrollPane scrollPane;
	private static JPanel panel;
	private static JScrollPane scrollPane2;
	private static JPanel panel2;
	private static JLabel[] group = new JLabel[100];
	private static JLabel[] reports = new JLabel[100];

	public static JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getPanel());
		}
		return scrollPane;
	}

	private static JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
			panel.setBackground(Color.white);
		}
		return panel;
	}

	
	public static JScrollPane getScrollPane2() {
		if (scrollPane2 == null) {
			scrollPane2 = new JScrollPane();
			scrollPane2.setViewportView(getPanel2());
		}
		return scrollPane2;
	}

	private static JPanel getPanel2() {
		if (panel2 == null) {
			panel2 = new JPanel();
			panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
			panel2.setBackground(Color.white);
		}
		return panel2;
	}
	/*
	 * Método para listar todos os grupos de alunos cadastrados
	 * TODO 
	 * 	Necessário pegar todos os grupos do DB ainda e listar.
	 */
	public static void listGroups(){
		
		
		for (int i = 0; i < 50; i++) {
			group[i] = new JLabel();
			group[i].setForeground(Color.black);
			group[i].setFont(new Font("BankGothic Md BT", Font.BOLD, 14));
			group[i].setText("Group "+i);
			group[i].addMouseListener(new ActionJlabelGroups());
			panel.add(group[i]);
			panel.updateUI();
			panel.repaint();
			panel.revalidate();
		}
	}
	
	public static void listTypeOfReports(){
		for (int i = 0; i < 50; i++) {
			reports[i] = new JLabel();
			reports[i].setForeground(Color.black);
			reports[i].setFont(new Font("BankGothic Md BT", Font.BOLD, 14));
			reports[i].setText("Report "+i);
			reports[i].addMouseListener(new ActionJlabelReports());
			panel2.add(reports[i]);
			panel2.updateUI();
			panel2.repaint();
			panel2.revalidate();
		}
	}
	
}
